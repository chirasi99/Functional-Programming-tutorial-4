// -------------------Question 01------------------------------------

def interest(deposit: Double): Double = deposit match {
  case d if d <= 20000.00 => d * 0.02
  case d if d <= 200000.00 => d * 0.04
  case d if d <= 2000000.00 => d * 0.035
  case d => d * 0.06
}

interest(10000)
interest(100000)
interest(1000000)
interest(10000000)
interest(100000000)