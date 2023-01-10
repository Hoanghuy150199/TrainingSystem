using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using MongoDB.Driver;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public class TraineeRepository : ITraineeRepository
    {
        private readonly IMongoCollection<Trainee> _collection;
        private readonly DbConfiguration _settings;
        public TraineeRepository(IOptions<DbConfiguration> settings)
        {
            _settings = settings.Value;
            var client = new MongoClient(_settings.ConnectionString);
            var database = client.GetDatabase(_settings.DatabaseName);
            _collection = database.GetCollection<Trainee>(_settings.traineeCollectionName);
        }

        public Task<List<Trainee>> GetAllAsync()
        {
            return _collection.Find(c => true).ToListAsync();
        }
        public Task<Trainee> GetByIdAsync(string id)
        {
            return _collection.Find(c => c.Id == id).FirstOrDefaultAsync();
        }
        public Task<Trainee> GetByNameAsync(string username)
        {
            return _collection.Find(c => c.Username == username).FirstOrDefaultAsync();
        }
        public async Task<Trainee> CreateAsync(Trainee trainee)
        {
            await _collection.InsertOneAsync(trainee).ConfigureAwait(false);
            return trainee;
        }
        public Task UpdateAsync(string id, Trainee trainee)
        {
            return _collection.ReplaceOneAsync(c => c.Id == id, trainee);
        }
        public Task DeleteAsync(string id)
        {
            return _collection.DeleteOneAsync(c => c.Id == id);
        }
    }
}
