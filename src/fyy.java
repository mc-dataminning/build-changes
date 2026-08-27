public class fyy extends fvw<cez> {
   private static final agi a = new agi("textures/entity/wither/wither_invulnerable.png");
   private static final agi f = new agi("textures/entity/wither/wither.png");
   private final fjl g;

   public fyy(fvx.a $$0) {
      super($$0);
      this.g = new fjl($$0.a(fkn.bU));
   }

   public static fku a() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("head", fkt.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkq.a);
      return fku.a($$0, 64, 64);
   }

   protected int a(cez $$0, ht $$1) {
      return 15;
   }

   public void a(cez $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = atm.j($$2, $$0.N, $$0.dD());
      float $$7 = atm.i($$2, $$0.O, $$0.dF());
      eoa $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(cez $$0) {
      return $$0.x() ? a : f;
   }
}
