public class guy extends gwa<gxe, gar> {
   private static final alp a = alp.b("textures/entity/breeze/breeze_wind.png");
   private final gar b;

   public guy(grl.a $$0, gti<gxe, gar> $$1) {
      super($$1);
      this.b = new gar($$0.a(gei.L));
   }

   public void a(fgl $$0, glg $$1, int $$2, gxe $$3, float $$4, float $$5) {
      fgp $$6 = $$1.getBuffer(glq.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gqq.a(this.b, this.b.d()).a($$0, $$6, $$2, hax.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
