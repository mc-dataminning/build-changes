public class z extends RuntimeException {
   private final o a;

   public z(o $$0) {
      this.a = $$0;
   }

   public o a() {
      return this.a;
   }

   @Override
   public Throwable getCause() {
      return this.a.b();
   }

   @Override
   public String getMessage() {
      return this.a.a();
   }
}
