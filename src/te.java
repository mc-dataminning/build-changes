import javax.annotation.Nullable;

class te {
   @Nullable
   public final Long a;
   public final Runnable b;

   private te(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static te a(Runnable $$0) {
      return new te(null, $$0);
   }

   static te a(long $$0, Runnable $$1) {
      return new te($$0, $$1);
   }
}
