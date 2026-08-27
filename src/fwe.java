public class fwe extends ftc<cdf> {
   private static final aez a = new aez("textures/entity/wither/wither_invulnerable.png");
   private static final aez f = new aez("textures/entity/wither/wither.png");
   private final fgu g;

   public fwe(ftd.a $$0) {
      super($$0);
      this.g = new fgu($$0.a(fhw.bU));
   }

   public static fid a() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("head", fic.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhz.a);
      return fid.a($$0, 64, 64);
   }

   protected int a(cdf $$0, gw $$1) {
      return 15;
   }

   public void a(cdf $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = asb.j($$2, $$0.N, $$0.dB());
      float $$7 = asb.i($$2, $$0.O, $$0.dD());
      eln $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aez a(cdf $$0) {
      return $$0.w() ? a : f;
   }
}
