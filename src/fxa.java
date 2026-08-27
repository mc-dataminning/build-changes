public class fxa extends fvw<cel> {
   private static final agi a = new agi("textures/entity/llama/spit.png");
   private final fij<cel> f;

   public fxa(fvx.a $$0) {
      super($$0);
      this.f = new fij<>($$0.a(fkn.at));
   }

   public void a(cel $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(atm.i($$2, $$0.N, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(atm.i($$2, $$0.O, $$0.dF())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eoa $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(cel $$0) {
      return a;
   }
}
