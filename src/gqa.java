public class gqa extends gpx {
   private final fgc a;

   gqa(glo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fgc $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = ayh.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = (float)ayh.b($$8) / 255.0F;
      this.w = (float)ayh.c($$8) / 255.0F;
      this.x = (float)ayh.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gpb b() {
      return gpb.b;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         int $$0 = this.t - this.s;
         double $$1 = 1.0 / (double)$$0;
         this.g = azz.d($$1, this.g, this.a.a());
         this.h = azz.d($$1, this.h, this.a.b());
         this.i = azz.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements gpa<me> {
      private final gps a;

      public a(gps $$0) {
         this.a = $$0;
      }

      public gox a(me $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqa $$8 = new gqa($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
