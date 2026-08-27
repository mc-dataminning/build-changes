import javax.annotation.Nullable;

class rp {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rp(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rp a(Runnable $$0) {
      return new rp(null, $$0);
   }

   static rp a(long $$0, Runnable $$1) {
      return new rp($$0, $$1);
   }
}
