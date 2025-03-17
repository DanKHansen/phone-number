object PhoneNumber:
   def clean(s: String): Option[String] =
      Option(s.filter(_.isDigit))