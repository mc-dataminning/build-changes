public class gcd extends gcl {
   private static final aym a = aym.a();
   private final gcg b;
   private float F = 1.0F;

   gcd(fyd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gcg $$7) {
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
   public gbp b() {
      return gbp.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = aye.i(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      ffn $$0 = ffn.Q();
      gcz $$1 = $$0.s;
      return $$1 != null && $$1.bx().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gw();
   }

   public static class a implements gbo<ln> {
      private final gcg a;

      public a(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gbo<lc> {
      private final gcg a;

      public b(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(lc $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbl $$8 = new gcd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gbo<ln> {
      private final gcg a;

      public c(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gbo<ln> {
      private final gcg a;

      public d(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcd $$8 = new gcd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
