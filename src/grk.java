public class grk extends gpj<cpq, gxh> {
   private static final alj a = alj.b("textures/entity/shulker/spark.png");
   private static final gjq b = gjq.i(a);
   private final gbb h;

   public grk(gpk.a $$0) {
      super($$0);
      this.h = new gbb($$0.a(gck.cA));
   }

   protected int a(cpq $$0, jh $$1) {
      return 15;
   }

   public void a(gxh $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azm.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azm.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azm.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fev $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gyv.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fev $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gyv.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gxh a() {
      return new gxh();
   }

   public void a(cpq $$0, gxh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
