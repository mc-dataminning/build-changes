public class gvb extends gwd<gxh, gau> {
   private static final alz a = alz.b("textures/entity/breeze/breeze_wind.png");
   private final gau b;

   public gvb(gro.a $$0, gtl<gxh, gau> $$1) {
      super($$1);
      this.b = new gau($$0.a(gel.I));
   }

   public void a(fgq $$0, glj $$1, int $$2, gxh $$3, float $$4, float $$5) {
      fgu $$6 = $$1.getBuffer(glt.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gqt.a(this.b, this.b.d()).a($$0, $$6, $$2, hba.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
