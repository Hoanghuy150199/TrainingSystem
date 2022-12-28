using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Services;

namespace MongoDB_CRUD.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class QuestionAnswersController : ControllerBase
    {
        private readonly IQuestionAnswerService _questionAnswerService;
        public QuestionAnswersController(IQuestionAnswerService questionAnswerService)
        {
            _questionAnswerService = questionAnswerService;
        }
        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            return Ok(await _questionAnswerService.GetAllAsync().ConfigureAwait(false));
        }
        [HttpGet("{id:length(24)}")]
        public async Task<IActionResult> Get(string id)
        {
            var questionAnswer = await _questionAnswerService.GetByIdAsync(id).ConfigureAwait(false);
            if (questionAnswer == null)
            {
                return NotFound();
            }
            return Ok(questionAnswer);
        }
        [HttpPost]
        public async Task<IActionResult> Create(QuestionAnswer questionAnswer)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest();
            }
            await _questionAnswerService.CreateAsync(questionAnswer).ConfigureAwait(false);
            return Ok(questionAnswer.Id);
        }
        [HttpPut("{id:length(24)}")]
        public async Task<IActionResult> Update(string id, QuestionAnswer questionAnswerIn)
        {
            var questionAnswer = await _questionAnswerService.GetByIdAsync(id).ConfigureAwait(false);
            if (questionAnswer == null)
            {
                return NotFound();
            }
            questionAnswerIn.Id = questionAnswer.Id;
            await _questionAnswerService.UpdateAsync(id, questionAnswerIn).ConfigureAwait(false);
            return NoContent();
        }
        [HttpDelete("{id:length(24)}")]
        public async Task<IActionResult> Delete(string id)
        {
            var questionAnswer = await _questionAnswerService.GetByIdAsync(id).ConfigureAwait(false);
            if (questionAnswer == null)
            {
                return NotFound();
            }
            await _questionAnswerService.DeleteAsync(questionAnswer.Id).ConfigureAwait(false);
            return NoContent();
        }
    }
}
