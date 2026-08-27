public class fww extends fvw<cah> {
   private static final agi a = new agi("textures/entity/lead_knot.png");
   private final fig<cah> f;

   public fww(fvx.a $$0) {
      super($$0);
      this.f = new fig<>($$0.a(fkn.aq));
   }

   public void a(cah $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eoa $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(cah $$0) {
      return a;
   }
}
