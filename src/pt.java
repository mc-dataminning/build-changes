import javax.annotation.Nullable;

class pt {
   @Nullable
   public final Long a;
   public final Runnable b;

   private pt(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static pt a(Runnable $$0) {
      return new pt(null, $$0);
   }

   static pt a(long $$0, Runnable $$1) {
      return new pt($$0, $$1);
   }
}
