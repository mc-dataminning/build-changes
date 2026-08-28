public class gei extends gft {
   private final gfo a;

   protected gei(gbm $$0, double $$1, double $$2, double $$3, gfo $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gex b() {
      return gex.b;
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

   public static class a implements gew<ls> {
      private final gfo a;

      public a(gfo $$0) {
         this.a = $$0;
      }

      public get a(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gei($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gew<ls> {
      private final gfo a;

      public b(gfo $$0) {
         this.a = $$0;
      }

      public get a(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         get $$8 = new gei($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
