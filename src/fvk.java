public class fvk extends fsi<ccq> {
   private static final aep a = new aep("textures/entity/wither/wither_invulnerable.png");
   private static final aep f = new aep("textures/entity/wither/wither.png");
   private final fgg g;

   public fvk(fsj.a $$0) {
      super($$0);
      this.g = new fgg($$0.a(fhi.bU));
   }

   public static fhp a() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("head", fho.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhl.a);
      return fhp.a($$0, 64, 64);
   }

   protected int a(ccq $$0, gv $$1) {
      return 15;
   }

   public void a(ccq $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aro.j($$2, $$0.N, $$0.dA());
      float $$7 = aro.i($$2, $$0.O, $$0.dC());
      ell $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aep a(ccq $$0) {
      return $$0.p() ? a : f;
   }
}
