public class gnt extends gny<cji, gtz> {
   private static final alh a = alh.b("textures/entity/end_crystal/end_crystal.png");
   private static final gig b = gig.f(a);
   private final fxw h;

   public gnt(gnz.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new fxw($$0.a(gba.aw));
   }

   public void a(gtz $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, gxj.d);
      $$1.b();
      ezh $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gnu.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azj.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gtz a() {
      return new gtz();
   }

   public void a(cji $$0, gtz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.b + $$2;
      $$1.a = $$0.o();
      jg $$3 = $$0.m();
      if ($$3 != null) {
         $$1.b = ezh.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cji $$0, gln $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.m() != null;
   }
}
