require 'test_helper'

class ResultsControllerTest < ActionDispatch::IntegrationTest
  setup do
    @result = results(:one)
  end

  test "should get index" do
    get results_url, as: :json
    assert_response :success
  end

  test "should create result" do
    assert_difference('Result.count') do
      post results_url, params: { result: { expense: @result.expense, information_id: @result.information_id, proft: @result.proft, revenue: @result.revenue, type: @result.type } }, as: :json
    end

    assert_response 201
  end

  test "should show result" do
    get result_url(@result), as: :json
    assert_response :success
  end

  test "should update result" do
    patch result_url(@result), params: { result: { expense: @result.expense, information_id: @result.information_id, proft: @result.proft, revenue: @result.revenue, type: @result.type } }, as: :json
    assert_response 200
  end

  test "should destroy result" do
    assert_difference('Result.count', -1) do
      delete result_url(@result), as: :json
    end

    assert_response 204
  end
end
