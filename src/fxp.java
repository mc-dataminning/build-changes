public class fxp extends fxd<bxk, fhp<bxk>> {
   private static final agi a = new agi("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fhp<bxk> j;
   private final fhp<bxk> k;
   private final fhp<bxk> l = this.a();

   public fxp(fvx.a $$0) {
      super($$0, new fiw<>($$0.a(fkn.aV)), 0.2F);
      this.k = new fix<>($$0.a(fkn.aW));
      this.j = new fiy<>($$0.a(fkn.aX));
   }

   public agi a(bxk $$0) {
      return a;
   }

   public void a(bxk $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      int $$6 = $$0.gh();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bxk $$0, enw $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, atm.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
