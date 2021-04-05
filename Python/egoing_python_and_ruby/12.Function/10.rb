arr = [1, 3, 123 , 12 , 13, 67]
arr.delete_if() do |item|
  item > 7
end
puts arr
