public class gzm extends han<hbs, gex> {
   private static final alg a = alg.b("textures/entity/breeze/breeze_wind.png");
   private final gex b;

   public gzm(gvz.a $$0, gxw<hbs, gex> $$1) {
      super($$1);
      this.b = new gex($$0.a(git.L));
   }

   public void a(fjc $$0, gps $$1, int $$2, hbs $$3, float $$4, float $$5) {
      fjg $$6 = $$1.getBuffer(gqc.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gve.a(this.b, this.b.d()).a($$0, $$6, $$2, hif.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
