public class fwd extends ftb<ccu> {
   private static final aeu a = new aeu("textures/entity/wither/wither_invulnerable.png");
   private static final aeu f = new aeu("textures/entity/wither/wither.png");
   private final fgu g;

   public fwd(ftc.a $$0) {
      super($$0);
      this.g = new fgu($$0.a(fhw.bU));
   }

   public static fid a() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("head", fic.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhz.a);
      return fid.a($$0, 64, 64);
   }

   protected int a(ccu $$0, gw $$1) {
      return 15;
   }

   public void a(ccu $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ars.j($$2, $$0.N, $$0.dA());
      float $$7 = ars.i($$2, $$0.O, $$0.dC());
      elo $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aeu a(ccu $$0) {
      return $$0.p() ? a : f;
   }
}
