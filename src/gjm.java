public class gjm extends giz<cex, fsw<cex>> {
   private static final akm a = new akm("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fsw<cex> j;
   private final fsw<cex> k;
   private final fsw<cex> l = this.a();

   public gjm(ght.a $$0) {
      super($$0, new fud<>($$0.a(fvv.bb)), 0.2F);
      this.k = new fue<>($$0.a(fvv.bc));
      this.j = new fuf<>($$0.a(fvv.bd));
   }

   public akm a(cex $$0) {
      return a;
   }

   public void a(cex $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      int $$6 = $$0.gr();
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

   protected void a(cex $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayd.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
