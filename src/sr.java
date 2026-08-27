import javax.annotation.Nullable;

class sr {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sr(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sr a(Runnable $$0) {
      return new sr(null, $$0);
   }

   static sr a(long $$0, Runnable $$1) {
      return new sr($$0, $$1);
   }
}
