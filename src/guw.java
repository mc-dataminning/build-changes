public class guw extends gvy<gxc, gap> {
   private static final alz a = alz.b("textures/entity/breeze/breeze_wind.png");
   private final gap b;

   public guw(grj.a $$0, gtg<gxc, gap> $$1) {
      super($$1);
      this.b = new gap($$0.a(geg.I));
   }

   public void a(fgl $$0, gle $$1, int $$2, gxc $$3, float $$4, float $$5) {
      fgp $$6 = $$1.getBuffer(glo.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gqo.a(this.b, this.b.d()).a($$0, $$6, $$2, hav.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
