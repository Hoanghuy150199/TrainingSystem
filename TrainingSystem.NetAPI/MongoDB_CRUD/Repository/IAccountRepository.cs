using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public interface IAccountRepository
    {
        Task<List<Account>> GetAllAsync();
        Task<Account> GetByIdAsync(string id);
        Task<Account> CreateAsync(Account account);
        Task UpdateAsync(string id, Account account);
        Task DeleteAsync(string id);
    }
}
