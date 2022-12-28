using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public interface ITraineeCourseManagementRepository
    {
        Task<List<TraineeCourseManagement>> GetAllAsync();
        Task<TraineeCourseManagement> GetByIdAsync(string id);
        Task<TraineeCourseManagement> CreateAsync(TraineeCourseManagement traineeCourseManagement);
        Task UpdateAsync(string id, TraineeCourseManagement traineeCourseManagement);
        Task DeleteAsync(string id);
    }
}
