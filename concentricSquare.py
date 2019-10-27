# 4 4 4 4 4 4 4
# 4 3 3 3 3 3 4
# 4 3 2 2 2 3 4
# 4 3 2 1 2 3 4
# 4 3 2 2 2 3 4
# 4 3 3 3 3 3 4
# 4 4 4 4 4 4 4

n = 4
k = 1
trow = 2 * n
row = 1
pattern = []
while k < trow:
    # Decreasing part
    col = n
    while col >= n - row + 1:
        pattern.append(f"{col} ")
        # print(col, end=" ")
        col -= 1
    col += 1
    # Constant part
    i = 1
    while i <= trow - (2 * row):
        pattern.append(f"{col} ")
        # print(col, end=" ")
        i += 1
    # Increasing part
    j = col + 1
    while j <= n:
        pattern.append(f"{j} ")
        # print(j, end=" ")
        j += 1
    if row < n:
        row += 1
    else:
        row -= 1
    pattern.append("\n")
    # print()
    k += 1

print("".join(pattern), end="")

