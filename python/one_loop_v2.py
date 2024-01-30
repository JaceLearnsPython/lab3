def one_loop(l: list) -> bool:

    seen_numbers = set()

    for num in l:
        if num in seen_numbers:
            return True
        seen_numbers.add(num)

    return False

my_list = [1, 2, 3, 4, 5]
result = one_loop(my_list)

my_list2 = [1, 2, 2, 3, 4, 5, 2]
result2 = one_loop(my_list2)

if result:
    print("True")
else:
    print("False")

if result2:
    print("True")
else:
    print("False")

if __name__ == "__main__":
    one_loop([1,2,3,4]);

