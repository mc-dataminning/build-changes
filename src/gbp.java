public class gbp extends gbx {
   private static final azc a = azc.a();
   private final gbs b;
   private float F;

   gbp(fxq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbs $$7) {
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
   public gbb b() {
      return gbb.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = ayu.i(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      ffa $$0 = ffa.Q();
      gcl $$1 = $$0.s;
      return $$1 != null && $$1.bx().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gA();
   }

   public static class a implements gba<lm> {
      private final gbs a;

      public a(gbs $$0) {
         this.a = $$0;
      }

      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gba<lb> {
      private final gbs a;

      public b(gbs $$0) {
         this.a = $$0;
      }

      public gax a(lb $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gax $$8 = new gbp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gba<lm> {
      private final gbs a;

      public c(gbs $$0) {
         this.a = $$0;
      }

      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gba<lm> {
      private final gbs a;

      public d(gbs $$0) {
         this.a = $$0;
      }

      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbp $$8 = new gbp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
