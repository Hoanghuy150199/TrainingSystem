using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Repository;

namespace MongoDB_CRUD.Services
{
    public class TraineeCourseManagementService : ITraineeCourseManagementService
    {
        private readonly ITraineeCourseManagementRepository _traineeCourseManagementRepository;

        public TraineeCourseManagementService(ITraineeCourseManagementRepository traineeCourseManagementRepository)
        {
            _traineeCourseManagementRepository = traineeCourseManagementRepository;
        }

        public Task<List<TraineeCourseManagement>> GetAllAsync()
        {
            return _traineeCourseManagementRepository.GetAllAsync();
        }

        public Task<TraineeCourseManagement> GetByIdAsync(string id)
        {
            return _traineeCourseManagementRepository.GetByIdAsync(id);
        }

        public Task<TraineeCourseManagement> CreateAsync(TraineeCourseManagement traineeCourseManagement)
        {
            return _traineeCourseManagementRepository.CreateAsync(traineeCourseManagement);
        }

        public Task UpdateAsync(string id, TraineeCourseManagement traineeCourseManagement)
        {
            return _traineeCourseManagementRepository.UpdateAsync(id, traineeCourseManagement);
        }

        public Task DeleteAsync(string id)
        {
            return _traineeCourseManagementRepository.DeleteAsync(id);
        }
    }
}
