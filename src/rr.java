import javax.annotation.Nullable;

class rr {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rr(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rr a(Runnable $$0) {
      return new rr(null, $$0);
   }

   static rr a(long $$0, Runnable $$1) {
      return new rr($$0, $$1);
   }
}
