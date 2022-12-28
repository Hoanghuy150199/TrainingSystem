using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Services
{
    public interface ITraineeService
    {
        Task<List<Trainee>> GetAllAsync();
        Task<Trainee> GetByIdAsync(string id);
        Task<Trainee> CreateAsync(Trainee trainee);
        Task UpdateAsync(string id, Trainee trainee);
        Task DeleteAsync(string id);
    }
}
