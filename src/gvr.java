public class gvr extends gwt<gxy, gbl> {
   private static final akv a = akv.b("textures/entity/breeze/breeze_wind.png");
   private final gbl b;

   public gvr(gse.a $$0, gub<gxy, gbl> $$1) {
      super($$1);
      this.b = new gbl($$0.a(gfc.L));
   }

   public void a(ffu $$0, gly $$1, int $$2, gxy $$3, float $$4, float $$5) {
      ffy $$6 = $$1.getBuffer(gmi.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      grj.a(this.b, this.b.d()).a($$0, $$6, $$2, hei.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
