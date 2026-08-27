import javax.annotation.Nullable;

class rj {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rj(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rj a(Runnable $$0) {
      return new rj(null, $$0);
   }

   static rj a(long $$0, Runnable $$1) {
      return new rj($$0, $$1);
   }
}
