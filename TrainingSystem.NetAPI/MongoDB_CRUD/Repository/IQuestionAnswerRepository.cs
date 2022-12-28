﻿using System.Collections.Generic;
using System.Threading.Tasks;
using MongoDB_CRUD.Models;

namespace MongoDB_CRUD.Repository
{
    public interface IQuestionAnswerRepository
    {
        Task<List<QuestionAnswer>> GetAllAsync();
        Task<QuestionAnswer> GetByIdAsync(string id);
        Task<QuestionAnswer> CreateAsync(QuestionAnswer questionAnswer);
        Task UpdateAsync(string id, QuestionAnswer questionAnswer);
        Task DeleteAsync(string id);
    }
}
