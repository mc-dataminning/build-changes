public class gbs extends gca {
   private static final azf a = azf.a();
   private final gbv b;
   private float F = 1.0F;

   gbs(fxt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbv $$7) {
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
   public gbe b() {
      return gbe.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = ayx.i(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      ffd $$0 = ffd.Q();
      gco $$1 = $$0.s;
      return $$1 != null && $$1.bx().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gA();
   }

   public static class a implements gbd<lm> {
      private final gbv a;

      public a(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbs($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gbd<lb> {
      private final gbv a;

      public b(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lb $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gba $$8 = new gbs($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gbd<lm> {
      private final gbv a;

      public c(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbs($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gbd<lm> {
      private final gbv a;

      public d(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbs $$8 = new gbs($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
