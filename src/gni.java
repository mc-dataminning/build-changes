public class gni extends gnn<ciz, gtn> {
   private static final ale a = ale.b("textures/entity/end_crystal/end_crystal.png");
   private static final ghv b = ghv.f(a);
   private final fxl h;

   public gni(gno.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new fxl($$0.a(gap.aw));
   }

   public void a(gtn $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, gwx.d);
      $$1.b();
      eyw $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gnj.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azf.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gtn a() {
      return new gtn();
   }

   public void a(ciz $$0, gtn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.b + $$2;
      $$1.a = $$0.o();
      jf $$3 = $$0.m();
      if ($$3 != null) {
         $$1.b = eyw.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(ciz $$0, glc $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.m() != null;
   }
}
