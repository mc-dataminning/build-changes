public class glf extends gks<cfk, fuo<cfk>> {
   private static final akk a = new akk("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fuo<cfk> j;
   private final fuo<cfk> k;
   private final fuo<cfk> l = this.a();

   public glf(gjm.a $$0) {
      super($$0, new fvv<>($$0.a(fxn.bb)), 0.2F);
      this.k = new fvw<>($$0.a(fxn.bc));
      this.j = new fvx<>($$0.a(fxn.bd));
   }

   public akk a(cfk $$0) {
      return a;
   }

   public void a(cfk $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      int $$6 = $$0.gq();
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

   protected void a(cfk $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayg.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
