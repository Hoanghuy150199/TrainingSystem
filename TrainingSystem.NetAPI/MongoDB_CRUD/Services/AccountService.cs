using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Repository;

namespace MongoDB_CRUD.Services
{
    public class AccountService : IAccountService
    {
        private readonly IAccountRepository _accountRepository;

        public AccountService(IAccountRepository accountRepository)
        {
            _accountRepository = accountRepository;
        }

        public Task<List<Account>> GetAllAsync()
        {
            return _accountRepository.GetAllAsync();
        }

        public Task<Account> GetByIdAsync(string id)
        {
            return _accountRepository.GetByIdAsync(id);
        }

        public Task<Account> CreateAsync(Account account)
        {
            return _accountRepository.CreateAsync(account);
        }

        public Task UpdateAsync(string id, Account account)
        {
            return _accountRepository.UpdateAsync(id, account);
        }

        public Task DeleteAsync(string id)
        {
            return _accountRepository.DeleteAsync(id);
        }
    }
}
