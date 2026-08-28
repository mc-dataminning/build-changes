public class gsx extends gtc<cko, gzg> {
   private static final aku a = aku.b("textures/entity/end_crystal/end_crystal.png");
   private static final gnh b = gnh.g(a);
   private final gcx h;

   public gsx(gtd.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new gcx($$0.a(ggb.aM));
   }

   public void a(gzg $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, hfh.d);
      $$1.b();
      fbx $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gsy.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = ayz.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gzg a() {
      return new gzg();
   }

   public void a(cko $$0, gzg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.g();
      ji $$3 = $$0.f();
      if ($$3 != null) {
         $$1.b = fbx.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cko $$0, gqp $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.f() != null;
   }
}
