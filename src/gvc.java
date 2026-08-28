public class gvc extends gwe<gxi, gav> {
   private static final alz a = alz.b("textures/entity/breeze/breeze_wind.png");
   private final gav b;

   public gvc(grp.a $$0, gtm<gxi, gav> $$1) {
      super($$1);
      this.b = new gav($$0.a(gem.I));
   }

   public void a(fgr $$0, glk $$1, int $$2, gxi $$3, float $$4, float $$5) {
      fgv $$6 = $$1.getBuffer(glu.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gqu.a(this.b, this.b.d()).a($$0, $$6, $$2, hbb.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
