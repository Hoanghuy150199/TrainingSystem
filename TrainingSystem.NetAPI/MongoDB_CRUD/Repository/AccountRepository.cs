using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using MongoDB.Driver;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public class AccountRepository : IAccountRepository
    {
        private readonly IMongoCollection<Account> _collection;
        private readonly DbConfiguration _settings;
        public AccountRepository(IOptions<DbConfiguration> settings)
        {
            _settings = settings.Value;
            var client = new MongoClient(_settings.ConnectionString);
            var database = client.GetDatabase(_settings.DatabaseName);
            _collection = database.GetCollection<Account>(_settings.accountCollectionName);
        }

        public Task<List<Account>> GetAllAsync()
        {
            return _collection.Find(c => true).ToListAsync();
        }
        public Task<Account> GetByIdAsync(string id)
        {
            return _collection.Find(c => c.Id == id).FirstOrDefaultAsync();
        }
        public async Task<Account> CreateAsync(Account account)
        {
            await _collection.InsertOneAsync(account).ConfigureAwait(false);
            return account;
        }
        public Task UpdateAsync(string id, Account account)
        {
            return _collection.ReplaceOneAsync(c => c.Id == id, account);
        }
        public Task DeleteAsync(string id)
        {
            return _collection.DeleteOneAsync(c => c.Id == id);
        }
    }
}
