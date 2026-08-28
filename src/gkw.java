public class gkw extends giw<cns> {
   private static final alf a = new alf("textures/entity/shulker/spark.png");
   private static final gdw f = gdw.i(a);
   private final fvs<cns> g;

   public gkw(gix.a $$0) {
      super($$0);
      this.g = new fvs<>($$0.a(fwz.bl));
   }

   protected int a(cns $$0, iz $$1) {
      return 15;
   }

   public void a(cns $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      $$3.a();
      float $$6 = ayz.j($$2, $$0.O, $$0.dF());
      float $$7 = ayz.i($$2, $$0.P, $$0.dH());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayz.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ayz.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ayz.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      fac $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      fac $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, goq.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cns $$0) {
      return a;
   }
}
