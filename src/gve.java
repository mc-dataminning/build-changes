public class gve extends gvj<clp, hbm> {
   private static final ale a = ale.b("textures/entity/end_crystal/end_crystal.png");
   private static final gpn g = gpn.g(a);
   private final gfa h;

   public gve(gvk.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.h = new gfa($$0.a(gif.aQ));
   }

   public void a(hbm $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(g), $$3, hhp.d);
      $$1.b();
      fdw $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gvf.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azk.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public hbm a() {
      return new hbm();
   }

   public void a(clp $$0, hbm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.g();
      iu $$3 = $$0.f();
      if ($$3 != null) {
         $$1.b = fdw.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(clp $$0, gsw $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.f() != null;
   }
}
