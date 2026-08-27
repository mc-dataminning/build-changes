public class fwi extends ftg<ccz> {
   private static final aex a = new aex("textures/entity/wither/wither_invulnerable.png");
   private static final aex f = new aex("textures/entity/wither/wither.png");
   private final fgz g;

   public fwi(fth.a $$0) {
      super($$0);
      this.g = new fgz($$0.a(fib.bU));
   }

   public static fii a() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("head", fih.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fie.a);
      return fii.a($$0, 64, 64);
   }

   protected int a(ccz $$0, gw $$1) {
      return 15;
   }

   public void a(ccz $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = arx.j($$2, $$0.N, $$0.dB());
      float $$7 = arx.i($$2, $$0.O, $$0.dD());
      elt $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aex a(ccz $$0) {
      return $$0.w() ? a : f;
   }
}
