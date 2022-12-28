using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using MongoDB.Driver;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public class QuestionAnswerRepository : IQuestionAnswerRepository
    {
        private readonly IMongoCollection<QuestionAnswer> _collection;
        private readonly DbConfiguration _settings;
        public QuestionAnswerRepository(IOptions<DbConfiguration> settings)
        {
            _settings = settings.Value;
            var client = new MongoClient(_settings.ConnectionString);
            var database = client.GetDatabase(_settings.DatabaseName);
            _collection = database.GetCollection<QuestionAnswer>(_settings.questionAnswerCollectionName);
        }

        public Task<List<QuestionAnswer>> GetAllAsync()
        {
            return _collection.Find(c => true).ToListAsync();
        }
        public Task<QuestionAnswer> GetByIdAsync(string id)
        {
            return _collection.Find(c => c.Id == id).FirstOrDefaultAsync();
        }
        public async Task<QuestionAnswer> CreateAsync(QuestionAnswer questionAnswer)
        {
            await _collection.InsertOneAsync(questionAnswer).ConfigureAwait(false);
            return questionAnswer;
        }
        public Task UpdateAsync(string id, QuestionAnswer questionAnswer)
        {
            return _collection.ReplaceOneAsync(c => c.Id == id, questionAnswer);
        }
        public Task DeleteAsync(string id)
        {
            return _collection.DeleteOneAsync(c => c.Id == id);
        }
    }
}
