public class gri extends grn<cks, gxq> {
   private static final alz a = alz.b("textures/entity/end_crystal/end_crystal.png");
   private static final glt b = glt.f(a);
   private final gbh h;

   public gri(gro.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new gbh($$0.a(gel.aH));
   }

   public void a(gxq $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, hba.d);
      $$1.b();
      fbx $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         grj.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = bae.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gxq a() {
      return new gxq();
   }

   public void a(cks $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.a + $$2;
      $$1.a = $$0.m();
      jh $$3 = $$0.l();
      if ($$3 != null) {
         $$1.b = fbx.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cks $$0, gpa $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.l() != null;
   }
}
