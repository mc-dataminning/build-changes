public class fzm extends fxn<cfl> {
   private static final agt a = new agt("textures/entity/shulker/spark.png");
   private static final fsq f = fsq.i(a);
   private final fkq<cfl> g;

   public fzm(fxo.a $$0) {
      super($$0);
      this.g = new fkq<>($$0.a(flx.bi));
   }

   protected int a(cfl $$0, hv $$1) {
      return 15;
   }

   public void a(cfl $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      float $$6 = aty.j($$2, $$0.N, $$0.dC());
      float $$7 = aty.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aty.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aty.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aty.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eph $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eph $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(cfl $$0) {
      return a;
   }
}
