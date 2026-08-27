public class fxc extends fyn {
   private final fyi a;

   protected fxc(fuh $$0, double $$1, double $$2, double $$3, fyi $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public fxr b() {
      return fxr.d;
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   public static class a implements fxq<ko> {
      private final fyi a;

      public a(fyi $$0) {
         this.a = $$0;
      }

      public fxn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fxc($$1, $$2, $$3, $$4, this.a);
      }
   }
}
