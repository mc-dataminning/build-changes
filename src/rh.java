import javax.annotation.Nullable;

class rh {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rh(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rh a(Runnable $$0) {
      return new rh(null, $$0);
   }

   static rh a(long $$0, Runnable $$1) {
      return new rh($$0, $$1);
   }
}
