public class glh extends gku<cfl, fuq<cfl>> {
   private static final akk a = new akk("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fuq<cfl> j;
   private final fuq<cfl> k;
   private final fuq<cfl> l = this.a();

   public glh(gjo.a $$0) {
      super($$0, new fvx<>($$0.a(fxp.bb)), 0.2F);
      this.k = new fvy<>($$0.a(fxp.bc));
      this.j = new fvz<>($$0.a(fxp.bd));
   }

   public akk a(cfl $$0) {
      return a;
   }

   public void a(cfl $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      int $$6 = $$0.gp();
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

   protected void a(cfl $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayg.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
