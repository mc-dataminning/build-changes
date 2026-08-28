public class gyy extends gwx<csk, hey> {
   private static final alg a = alg.b("textures/entity/shulker/spark.png");
   private static final grc g = grc.j(a);
   private final gii h;

   public gyy(gwy.a $$0) {
      super($$0);
      this.h = new gii($$0.a(gjs.cW));
   }

   protected int a(csk $$0, iv $$1) {
      return 15;
   }

   public void a(hey $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azm.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azm.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azm.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fkh $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hjg.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fkh $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hjg.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hey a() {
      return new hey();
   }

   public void a(csk $$0, hey $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
