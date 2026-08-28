import javax.annotation.Nullable;

class tl {
   @Nullable
   public final Long a;
   public final Runnable b;

   private tl(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static tl a(Runnable $$0) {
      return new tl(null, $$0);
   }

   static tl a(long $$0, Runnable $$1) {
      return new tl($$0, $$1);
   }
}
