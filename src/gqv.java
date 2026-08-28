public class gqv extends grw<gta, fwv> {
   private static final alc a = alc.b("textures/entity/breeze/breeze_wind.png");
   private final fwv b;

   public gqv(gnj.a $$0, gpf<gta, fwv> $$1) {
      super($$1);
      this.b = new fwv($$0.a(gak.C));
   }

   public void a(fde $$0, ghg $$1, int $$2, gta $$3, float $$4, float $$5) {
      fdi $$6 = $$1.getBuffer(ghq.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gmp.a(this.b, this.b.e()).a($$0, $$6, $$2, gws.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
