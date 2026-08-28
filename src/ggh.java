public class ggh extends ggp {
   private static final azs a = azs.a();
   private final ggk b;
   private float F = 1.0F;

   ggh(gci $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ggk $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public gft b() {
      return gft.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = azk.h(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      fji $$0 = fji.Q();
      ghd $$1 = $$0.t;
      return $$1 != null && $$1.bG().c(this.g, this.h, this.i) <= 9.0 && $$0.n.aD().a() && $$1.gI();
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggh($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gfs<lk> {
      private final ggk a;

      public b(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lk $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfp $$8 = new ggh($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gfs<lv> {
      private final ggk a;

      public c(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggh($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gfs<lv> {
      private final ggk a;

      public d(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ggh $$8 = new ggh($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.A.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
