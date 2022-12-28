using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Services;

namespace MongoDB_CRUD.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class AccountsController : ControllerBase
    {
        private readonly IAccountService _accountService;
        public AccountsController(IAccountService accountService)
        {
            _accountService = accountService;
        }
        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            return Ok(await _accountService.GetAllAsync().ConfigureAwait(false));
        }
        [HttpGet("{id:length(24)}")]
        public async Task<IActionResult> Get(string id)
        {
            var account = await _accountService.GetByIdAsync(id).ConfigureAwait(false);
            if (account == null)
            {
                return NotFound();
            }
            return Ok(account);
        }
        [HttpPost]
        public async Task<IActionResult> Create(Account account)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest();
            }
            await _accountService.CreateAsync(account).ConfigureAwait(false);
            return Ok(account.Id);
        }
        [HttpPut("{id:length(24)}")]
        public async Task<IActionResult> Update(string id, Account accountIn)
        {
            var account = await _accountService.GetByIdAsync(id).ConfigureAwait(false);
            if (account == null)
            {
                return NotFound();
            }
            accountIn.Id = account.Id;
            await _accountService.UpdateAsync(id, accountIn).ConfigureAwait(false);
            return NoContent();
        }
        [HttpDelete("{id:length(24)}")]
        public async Task<IActionResult> Delete(string id)
        {
            var account = await _accountService.GetByIdAsync(id).ConfigureAwait(false);
            if (account == null)
            {
                return NotFound();
            }
            await _accountService.DeleteAsync(account.Id).ConfigureAwait(false);
            return NoContent();
        }
    }
}
