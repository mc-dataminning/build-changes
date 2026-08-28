public class gma extends giw<cod> {
   private static final alf a = new alf("textures/entity/wither/wither_invulnerable.png");
   private static final alf f = new alf("textures/entity/wither/wither.png");
   private final fvw g;

   public gma(gix.a $$0) {
      super($$0);
      this.g = new fvw($$0.a(fwz.cb));
   }

   public static fxg a() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("head", fxf.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxc.a);
      return fxg.a($$0, 64, 64);
   }

   protected int a(cod $$0, iz $$1) {
      return 15;
   }

   public void a(cod $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayz.j($$2, $$0.O, $$0.dF());
      float $$7 = ayz.i($$2, $$0.P, $$0.dH());
      fac $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cod $$0) {
      return $$0.y() ? a : f;
   }
}
