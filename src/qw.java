import javax.annotation.Nullable;

class qw {
   @Nullable
   public final Long a;
   public final Runnable b;

   private qw(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static qw a(Runnable $$0) {
      return new qw(null, $$0);
   }

   static qw a(long $$0, Runnable $$1) {
      return new qw($$0, $$1);
   }
}
