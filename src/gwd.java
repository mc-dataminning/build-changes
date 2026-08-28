public class gwd extends gtc<cra, gzj> {
   private static final aku a = aku.b("textures/entity/projectiles/wind_charge.png");
   private final gfo b;

   public gwd(gtd.a $$0) {
      super($$0);
      this.b = new gfo($$0.a(ggb.dA));
   }

   @Override
   public void a(gzj $$0, fgr $$1, gmx $$2, int $$3) {
      fgv $$4 = $$2.getBuffer(gnh.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hfh.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gzj d() {
      return new gzj();
   }
}
