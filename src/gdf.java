public class gdf extends gas<cim> {
   public static final aiy a = new aiy("textures/entity/trident.png");
   private final fog f;

   public gdf(gat.a $$0) {
      super($$0);
      this.f = new fog($$0.a(fpb.bE));
   }

   public void a(cim $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(awh.i($$2, $$0.M, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awh.i($$2, $$0.N, $$0.dE()) + 90.0F));
      ese $$6 = gbr.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cim $$0) {
      return a;
   }
}
