import javax.annotation.Nullable;

class td {
   @Nullable
   public final Long a;
   public final Runnable b;

   private td(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static td a(Runnable $$0) {
      return new td(null, $$0);
   }

   static td a(long $$0, Runnable $$1) {
      return new td($$0, $$1);
   }
}
