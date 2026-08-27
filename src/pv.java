import javax.annotation.Nullable;

class pv {
   @Nullable
   public final Long a;
   public final Runnable b;

   private pv(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static pv a(Runnable $$0) {
      return new pv(null, $$0);
   }

   static pv a(long $$0, Runnable $$1) {
      return new pv($$0, $$1);
   }
}
