import javax.annotation.Nullable;

class sx {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sx(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sx a(Runnable $$0) {
      return new sx(null, $$0);
   }

   static sx a(long $$0, Runnable $$1) {
      return new sx($$0, $$1);
   }
}
