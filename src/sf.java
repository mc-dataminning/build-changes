import javax.annotation.Nullable;

class sf {
   @Nullable
   public final Long a;
   public final Runnable b;

   private sf(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static sf a(Runnable $$0) {
      return new sf(null, $$0);
   }

   static sf a(long $$0, Runnable $$1) {
      return new sf($$0, $$1);
   }
}
