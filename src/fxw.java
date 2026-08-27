public class fxw extends fvj<ceq> {
   public static final agg a = new agg("textures/entity/trident.png");
   private final fjh f;

   public fxw(fvk.a $$0) {
      super($$0);
      this.f = new fjh($$0.a(fka.bC));
   }

   public void a(ceq $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ati.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ati.i($$2, $$0.O, $$0.dD()) + 90.0F));
      eno $$6 = fwi.c($$4, this.f.a(this.a($$0)), false, $$0.F());
      this.f.a($$3, $$6, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agg a(ceq $$0) {
      return a;
   }
}
