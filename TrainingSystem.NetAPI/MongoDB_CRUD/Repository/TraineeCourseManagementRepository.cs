using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using MongoDB.Driver;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public class TraineeCourseManagementRepository : ITraineeCourseManagementRepository
    {
        private readonly IMongoCollection<TraineeCourseManagement> _collection;
        private readonly DbConfiguration _settings;
        public TraineeCourseManagementRepository(IOptions<DbConfiguration> settings)
        {
            _settings = settings.Value;
            var client = new MongoClient(_settings.ConnectionString);
            var database = client.GetDatabase(_settings.DatabaseName);
            _collection = database.GetCollection<TraineeCourseManagement>(_settings.traineeCourseManagementCollectionName);
        }

        public Task<List<TraineeCourseManagement>> GetAllAsync()
        {
            return _collection.Find(c => true).ToListAsync();
        }
        public Task<TraineeCourseManagement> GetByIdAsync(string id)
        {
            return _collection.Find(c => c.Id == id).FirstOrDefaultAsync();
        }
        public async Task<TraineeCourseManagement> CreateAsync(TraineeCourseManagement traineeCourseManagement)
        {
            await _collection.InsertOneAsync(traineeCourseManagement).ConfigureAwait(false);
            return traineeCourseManagement;
        }
        public Task UpdateAsync(string id, TraineeCourseManagement traineeCourseManagement)
        {
            return _collection.ReplaceOneAsync(c => c.Id == id, traineeCourseManagement);
        }
        public Task DeleteAsync(string id)
        {
            return _collection.DeleteOneAsync(c => c.Id == id);
        }
    }
}
