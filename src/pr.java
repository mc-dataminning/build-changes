import javax.annotation.Nullable;

class pr {
   @Nullable
   public final Long a;
   public final Runnable b;

   private pr(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static pr a(Runnable $$0) {
      return new pr(null, $$0);
   }

   static pr a(long $$0, Runnable $$1) {
      return new pr($$0, $$1);
   }
}
