public class fyj extends fvw<cey> {
   public static final agi a = new agi("textures/entity/trident.png");
   private final fju f;

   public fyj(fvx.a $$0) {
      super($$0);
      this.f = new fju($$0.a(fkn.bC));
   }

   public void a(cey $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(atm.i($$2, $$0.N, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(atm.i($$2, $$0.O, $$0.dF()) + 90.0F));
      eoa $$6 = fwv.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(cey $$0) {
      return a;
   }
}
