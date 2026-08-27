import javax.annotation.Nullable;

class rl {
   @Nullable
   public final Long a;
   public final Runnable b;

   private rl(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static rl a(Runnable $$0) {
      return new rl(null, $$0);
   }

   static rl a(long $$0, Runnable $$1) {
      return new rl($$0, $$1);
   }
}
