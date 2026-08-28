import javax.annotation.Nullable;

class tb {
   @Nullable
   public final Long a;
   public final Runnable b;

   private tb(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static tb a(Runnable $$0) {
      return new tb(null, $$0);
   }

   static tb a(long $$0, Runnable $$1) {
      return new tb($$0, $$1);
   }
}
