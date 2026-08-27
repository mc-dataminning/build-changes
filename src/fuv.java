public class fuv extends fsi<ccp> {
   public static final aep a = new aep("textures/entity/trident.png");
   private final fgp f;

   public fuv(fsj.a $$0) {
      super($$0);
      this.f = new fgp($$0.a(fhi.bC));
   }

   public void a(ccp $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aro.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aro.i($$2, $$0.O, $$0.dC()) + 90.0F));
      ell $$6 = fth.c($$4, this.f.a(this.a($$0)), false, $$0.z());
      this.f.a($$3, $$6, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aep a(ccp $$0) {
      return a;
   }
}
