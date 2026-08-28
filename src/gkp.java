public class gkp extends gkc<cfx, ftz<cfx>> {
   private static final ale a = new ale("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final ftz<cfx> j;
   private final ftz<cfx> k;
   private final ftz<cfx> l = this.a();

   public gkp(giw.a $$0) {
      super($$0, new fvg<>($$0.a(fwy.bb)), 0.2F);
      this.k = new fvh<>($$0.a(fwy.bc));
      this.j = new fvi<>($$0.a(fwy.bd));
   }

   public ale a(cfx $$0) {
      return a;
   }

   public void a(cfx $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      int $$6 = $$0.gs();
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

   protected void a(cfx $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayy.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
