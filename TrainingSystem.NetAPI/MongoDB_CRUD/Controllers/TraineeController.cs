using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Services;

namespace MongoDB_CRUD.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TraineesController : ControllerBase
    {
        private readonly ITraineeService _traineeService;
        public TraineesController(ITraineeService traineeService)
        {
            _traineeService = traineeService;
        }
        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            return Ok(await _traineeService.GetAllAsync().ConfigureAwait(false));
        }
        [HttpGet("{id:length(24)}")]
        public async Task<IActionResult> Get(string id)
        {
            var trainee = await _traineeService.GetByIdAsync(id).ConfigureAwait(false);
            if (trainee == null)
            {
                return NotFound();
            }
            return Ok(trainee);
        }
        [HttpPost]
        public async Task<IActionResult> Create(Trainee trainee)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest();
            }
            await _traineeService.CreateAsync(trainee).ConfigureAwait(false);
            return Ok(trainee.Id);
        }
        [HttpPut("{id:length(24)}")]
        public async Task<IActionResult> Update(string id, Trainee traineeIn)
        {
            var trainee = await _traineeService.GetByIdAsync(id).ConfigureAwait(false);
            if (trainee == null)
            {
                return NotFound();
            }
            traineeIn.Id = trainee.Id;
            await _traineeService.UpdateAsync(id, traineeIn).ConfigureAwait(false);
            return NoContent();
        }
        [HttpDelete("{id:length(24)}")]
        public async Task<IActionResult> Delete(string id)
        {
            var trainee = await _traineeService.GetByIdAsync(id).ConfigureAwait(false);
            if (trainee == null)
            {
                return NotFound();
            }
            await _traineeService.DeleteAsync(trainee.Id).ConfigureAwait(false);
            return NoContent();
        }
    }
}
