import javax.annotation.Nullable;

class sq {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sq(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sq a(Runnable $$0) {
      return new sq(null, $$0);
   }

   static sq a(long $$0, Runnable $$1) {
      return new sq($$0, $$1);
   }
}
