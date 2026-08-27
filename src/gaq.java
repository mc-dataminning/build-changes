public class gaq extends fxn<cfx> {
   private static final agt a = new agt("textures/entity/wither/wither_invulnerable.png");
   private static final agt f = new agt("textures/entity/wither/wither.png");
   private final fku g;

   public gaq(fxo.a $$0) {
      super($$0);
      this.g = new fku($$0.a(flx.bY));
   }

   public static fme a() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("head", fmd.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fma.a);
      return fme.a($$0, 64, 64);
   }

   protected int a(cfx $$0, hv $$1) {
      return 15;
   }

   public void a(cfx $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aty.j($$2, $$0.N, $$0.dC());
      float $$7 = aty.i($$2, $$0.O, $$0.dE());
      eph $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(cfx $$0) {
      return $$0.y() ? a : f;
   }
}
