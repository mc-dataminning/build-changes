public class fxv extends fvw<ceo> {
   private static final agi a = new agi("textures/entity/shulker/spark.png");
   private static final frc f = frc.i(a);
   private final fjh<ceo> g;

   public fxv(fvx.a $$0) {
      super($$0);
      this.g = new fjh<>($$0.a(fkn.bf));
   }

   protected int a(ceo $$0, ht $$1) {
      return 15;
   }

   public void a(ceo $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      float $$6 = atm.j($$2, $$0.N, $$0.dD());
      float $$7 = atm.i($$2, $$0.O, $$0.dF());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(atm.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(atm.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(atm.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eoa $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eoa $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(ceo $$0) {
      return a;
   }
}
