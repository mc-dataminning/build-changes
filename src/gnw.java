public class gnw extends gkp<cnh> {
   private static final akt a = new akt("textures/entity/wither/wither_invulnerable.png");
   private static final akt b = new akt("textures/entity/wither/wither.png");
   private final fxo g;

   public gnw(gkq.a $$0) {
      super($$0);
      this.g = new fxo($$0.a(fyr.ch));
   }

   public static fyy a() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("head", fyx.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyu.a);
      return fyy.a($$0, 64, 64);
   }

   protected int a(cnh $$0, ir $$1) {
      return 15;
   }

   public void a(cnh $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aym.j($$2, $$0.P, $$0.dK());
      float $$7 = aym.i($$2, $$0.Q, $$0.dM());
      fbg $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cnh $$0) {
      return $$0.y() ? a : b;
   }
}
