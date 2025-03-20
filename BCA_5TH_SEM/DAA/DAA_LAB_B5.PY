def job_sequencing():
    n = int(input("Enter the number of jobs: "))
    jobs = []
    for i in range(n):
        job_id = input(f"Enter job {i + 1} ID: ")
        deadline = int(input(f"Enter the deadline for job {job_id}: "))
        profit = int(input(f"Enter the profit for job {job_id}: "))
        jobs.append((job_id, deadline, profit))
    selected_jobs, total_profit = job_greedy(jobs)
    print("Selected Jobs:")
    for job in selected_jobs:
        print(f"{job[0]} (Deadline: {job[1]}, Profit: {job[2]})")
    print("Total Profit:", total_profit)
def job_greedy(jobs):
    jobs.sort(key=lambda x: x[2], reverse=True)
    max_deadline = max(jobs, key=lambda x: x[1])[1]
    timeslots = [-1] * max_deadline
    selected_jobs = []
    for job in jobs:
        job_id, deadline, profit = job
        for i in range(deadline - 1, -1, -1):
            if timeslots[i] == -1:
                timeslots[i] = job_id
                selected_jobs.append(job)
                break
    total_profit = sum(job[2] for job in selected_jobs)
    return selected_jobs, total_profit
if __name__ == "__main__":
    job_sequencing() 