public class grz extends gse<cjv, gyi> {
   private static final akv a = akv.b("textures/entity/end_crystal/end_crystal.png");
   private static final gmj b = gmj.g(a);
   private final gbz h;

   public grz(gsf.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new gbz($$0.a(gfd.aK));
   }

   public void a(gyi $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, hej.d);
      $$1.b();
      fbb $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gsa.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = ayz.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gyi a() {
      return new gyi();
   }

   public void a(cjv $$0, gyi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.m();
      ji $$3 = $$0.l();
      if ($$3 != null) {
         $$1.b = fbb.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cjv $$0, gpr $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.l() != null;
   }
}
