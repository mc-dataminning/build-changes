public class gqi extends gni<cpe, gtl> {
   private static final alc a = alc.b("textures/entity/projectiles/wind_charge.png");
   private final fzx b;

   public gqi(gnj.a $$0) {
      super($$0);
      this.b = new fzx($$0.a(gak.cX));
   }

   @Override
   public void a(gtl $$0, fde $$1, ghg $$2, int $$3) {
      fdi $$4 = $$2.getBuffer(ghq.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gws.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public alc a(gtl $$0) {
      return a;
   }

   @Override
   public gtl b() {
      return new gtl();
   }
}
