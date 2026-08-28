public class gcl extends gct {
   private static final ayo a = ayo.a();
   private final gco b;
   private float F = 1.0F;

   gcl(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gco $$7) {
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
   public gbx b() {
      return gbx.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = ayg.i(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      ffw $$0 = ffw.Q();
      gdh $$1 = $$0.s;
      return $$1 != null && $$1.bz().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gy();
   }

   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gbw<lc> {
      private final gco a;

      public b(gco $$0) {
         this.a = $$0;
      }

      public gbt a(lc $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbt $$8 = new gcl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gbw<ln> {
      private final gco a;

      public c(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gbw<ln> {
      private final gco a;

      public d(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcl $$8 = new gcl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
