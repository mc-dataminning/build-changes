public class hal extends hbm<hcs, gfv> {
   private static final alg a = alg.b("textures/entity/breeze/breeze_wind.png");
   private final gfv b;

   public hal(gwy.a $$0, gyv<hcs, gfv> $$1) {
      super($$1);
      this.b = new gfv($$0.a(gjs.L));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hcs $$3, float $$4, float $$5) {
      fkh $$6 = $$1.getBuffer(grc.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gwd.a(this.b, this.b.d()).a($$0, $$6, $$2, hjg.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
