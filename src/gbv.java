public class gbv extends gcd {
   private static final azh a = azh.a();
   private final gby b;
   private float F = 1.0F;

   gbv(fxw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gby $$7) {
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
   public gbh b() {
      return gbh.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = ayz.i(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      ffg $$0 = ffg.Q();
      gcr $$1 = $$0.s;
      return $$1 != null && $$1.bx().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gA();
   }

   public static class a implements gbg<lm> {
      private final gby a;

      public a(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gbg<lb> {
      private final gby a;

      public b(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lb $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbd $$8 = new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gbg<lm> {
      private final gby a;

      public c(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gbg<lm> {
      private final gby a;

      public d(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbv $$8 = new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
