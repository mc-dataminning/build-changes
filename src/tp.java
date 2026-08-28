import javax.annotation.Nullable;

class tp {
   @Nullable
   public final Long a;
   public final Runnable b;

   private tp(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static tp a(Runnable $$0) {
      return new tp(null, $$0);
   }

   static tp a(long $$0, Runnable $$1) {
      return new tp($$0, $$1);
   }
}
