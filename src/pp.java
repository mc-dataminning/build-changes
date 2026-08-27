import javax.annotation.Nullable;

class pp {
   @Nullable
   public final Long a;
   public final Runnable b;

   private pp(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static pp a(Runnable $$0) {
      return new pp(null, $$0);
   }

   static pp a(long $$0, Runnable $$1) {
      return new pp($$0, $$1);
   }
}
