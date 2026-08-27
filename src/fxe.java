public class fxe extends fuc<cec> {
   private static final afw a = new afw("textures/entity/wither/wither_invulnerable.png");
   private static final afw f = new afw("textures/entity/wither/wither.png");
   private final fht g;

   public fxe(fud.a $$0) {
      super($$0);
      this.g = new fht($$0.a(fiv.bU));
   }

   public static fjc a() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("head", fjb.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fiy.a);
      return fjc.a($$0, 64, 64);
   }

   protected int a(cec $$0, ht $$1) {
      return 15;
   }

   public void a(cec $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = asy.j($$2, $$0.N, $$0.dB());
      float $$7 = asy.i($$2, $$0.O, $$0.dD());
      eml $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public afw a(cec $$0) {
      return $$0.w() ? a : f;
   }
}
