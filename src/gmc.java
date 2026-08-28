public class gmc extends gkc<cnq> {
   private static final akq a = akq.b("textures/entity/shulker/spark.png");
   private static final gfb f = gfb.i(a);
   private final fww<cnq> g;

   public gmc(gkd.a $$0) {
      super($$0);
      this.g = new fww<>($$0.a(fyd.bm));
   }

   protected int a(cnq $$0, jd $$1) {
      return 15;
   }

   public void a(cnq $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      float $$6 = ayn.j($$2, $$0.O, $$0.dG());
      float $$7 = ayn.i($$2, $$0.P, $$0.dI());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayn.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ayn.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ayn.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      fbg $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gpw.d);
      $$3.b(1.5F, 1.5F, 1.5F);
      fbg $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gpw.d, 654311423);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(cnq $$0) {
      return a;
   }
}
