using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Services;

namespace MongoDB_CRUD.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TraineeCourseManagementsController : ControllerBase
    {
        private readonly ITraineeCourseManagementService _traineeCourseManagementService;
        public TraineeCourseManagementsController(ITraineeCourseManagementService traineeCourseManagementService)
        {
            _traineeCourseManagementService = traineeCourseManagementService;
        }
        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            return Ok(await _traineeCourseManagementService.GetAllAsync().ConfigureAwait(false));
        }
        [HttpGet("{id:length(24)}")]
        public async Task<IActionResult> Get(string id)
        {
            var traineeCourseManagement = await _traineeCourseManagementService.GetByIdAsync(id).ConfigureAwait(false);
            if (traineeCourseManagement == null)
            {
                return NotFound();
            }
            return Ok(traineeCourseManagement);
        }
        [HttpGet("name/{traineeName}")]
        public async Task<IActionResult> GetByName(string traineeName)
        {
            var traineeCourseManagement = await _traineeCourseManagementService.GetByNameAsync(traineeName).ConfigureAwait(false);
            if (traineeCourseManagement == null)
            {
                return NotFound();
            }
            return Ok(traineeCourseManagement);
        }
        [HttpPost]
        public async Task<IActionResult> Create(TraineeCourseManagement traineeCourseManagement)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest();
            }
            await _traineeCourseManagementService.CreateAsync(traineeCourseManagement).ConfigureAwait(false);
            return Ok(traineeCourseManagement.Id);
        }
        [HttpPut("{id:length(24)}")]
        public async Task<IActionResult> Update(string id, TraineeCourseManagement traineeCourseManagementIn)
        {
            var traineeCourseManagement = await _traineeCourseManagementService.GetByIdAsync(id).ConfigureAwait(false);
            if (traineeCourseManagement == null)
            {
                return NotFound();
            }
            traineeCourseManagementIn.Id = traineeCourseManagement.Id;
            await _traineeCourseManagementService.UpdateAsync(id, traineeCourseManagementIn).ConfigureAwait(false);
            return NoContent();
        }
        [HttpDelete("{id:length(24)}")]
        public async Task<IActionResult> Delete(string id)
        {
            var traineeCourseManagement = await _traineeCourseManagementService.GetByIdAsync(id).ConfigureAwait(false);
            if (traineeCourseManagement == null)
            {
                return NotFound();
            }
            await _traineeCourseManagementService.DeleteAsync(traineeCourseManagement.Id).ConfigureAwait(false);
            return NoContent();
        }
    }
}
