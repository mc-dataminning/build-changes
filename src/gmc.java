public class gmc extends giy<cof> {
   private static final alf a = new alf("textures/entity/wither/wither_invulnerable.png");
   private static final alf f = new alf("textures/entity/wither/wither.png");
   private final fvy g;

   public gmc(giz.a $$0) {
      super($$0);
      this.g = new fvy($$0.a(fxb.cb));
   }

   public static fxi a() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("head", fxh.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxe.a);
      return fxi.a($$0, 64, 64);
   }

   protected int a(cof $$0, iz $$1) {
      return 15;
   }

   public void a(cof $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayz.j($$2, $$0.O, $$0.dF());
      float $$7 = ayz.i($$2, $$0.P, $$0.dH());
      fae $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cof $$0) {
      return $$0.y() ? a : f;
   }
}
