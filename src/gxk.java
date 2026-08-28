public class gxk extends gvj<crp, hdi> {
   private static final ale a = ale.b("textures/entity/shulker/spark.png");
   private static final gpn g = gpn.j(a);
   private final ggw h;

   public gxk(gvk.a $$0) {
      super($$0);
      this.h = new ggw($$0.a(gif.cQ));
   }

   protected int a(crp $$0, iu $$1) {
      return 15;
   }

   public void a(hdi $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azk.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azk.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azk.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fiu $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hhp.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fiu $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hhp.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hdi a() {
      return new hdi();
   }

   public void a(crp $$0, hdi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
