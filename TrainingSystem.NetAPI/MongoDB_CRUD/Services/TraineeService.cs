using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Repository;

namespace MongoDB_CRUD.Services
{
    public class TraineeService : ITraineeService
    {
        private readonly ITraineeRepository _traineeRepository;

        public TraineeService(ITraineeRepository traineeRepository)
        {
            _traineeRepository = traineeRepository;
        }

        public Task<List<Trainee>> GetAllAsync()
        {
            return _traineeRepository.GetAllAsync();
        }

        public Task<Trainee> GetByIdAsync(string id)
        {
            return _traineeRepository.GetByIdAsync(id);
        }

        public Task<Trainee> CreateAsync(Trainee trainee)
        {
            return _traineeRepository.CreateAsync(trainee);
        }

        public Task UpdateAsync(string id, Trainee trainee)
        {
            return _traineeRepository.UpdateAsync(id, trainee);
        }

        public Task DeleteAsync(string id)
        {
            return _traineeRepository.DeleteAsync(id);
        }
    }
}
