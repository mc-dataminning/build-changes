public class gjz extends ggw<cmn> {
   private static final akh a = new akh("textures/entity/wither/wither_invulnerable.png");
   private static final akh f = new akh("textures/entity/wither/wither.png");
   private final ftx g;

   public gjz(ggx.a $$0) {
      super($$0);
      this.g = new ftx($$0.a(fva.cb));
   }

   public static fvh a() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("head", fvg.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fvd.a);
      return fvh.a($$0, 64, 64);
   }

   protected int a(cmn $$0, in $$1) {
      return 15;
   }

   public void a(cmn $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = axz.j($$2, $$0.O, $$0.dD());
      float $$7 = axz.i($$2, $$0.P, $$0.dF());
      eyb $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(cmn $$0) {
      return $$0.y() ? a : f;
   }
}
