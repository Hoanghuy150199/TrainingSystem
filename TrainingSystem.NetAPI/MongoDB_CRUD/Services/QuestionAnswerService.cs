using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;
using MongoDB_CRUD.Repository;

namespace MongoDB_CRUD.Services
{
    public class QuestionAnswerService : IQuestionAnswerService
    {
        private readonly IQuestionAnswerRepository _questionAnswerRepository;

        public QuestionAnswerService(IQuestionAnswerRepository questionAnswerRepository)
        {
            _questionAnswerRepository = questionAnswerRepository;
        }

        public Task<List<QuestionAnswer>> GetAllAsync()
        {
            return _questionAnswerRepository.GetAllAsync();
        }

        public Task<QuestionAnswer> GetByIdAsync(string id)
        {
            return _questionAnswerRepository.GetByIdAsync(id);
        }

        public Task<QuestionAnswer> CreateAsync(QuestionAnswer questionAnswer)
        {
            return _questionAnswerRepository.CreateAsync(questionAnswer);
        }

        public Task UpdateAsync(string id, QuestionAnswer questionAnswer)
        {
            return _questionAnswerRepository.UpdateAsync(id, questionAnswer);
        }

        public Task DeleteAsync(string id)
        {
            return _questionAnswerRepository.DeleteAsync(id);
        }
    }
}
