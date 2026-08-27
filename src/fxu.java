public class fxu extends fxi<bxp, fhu<bxp>> {
   private static final agm a = new agm("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fhu<bxp> j;
   private final fhu<bxp> k;
   private final fhu<bxp> l = this.a();

   public fxu(fwc.a $$0) {
      super($$0, new fjb<>($$0.a(fks.aV)), 0.2F);
      this.k = new fjc<>($$0.a(fks.aW));
      this.j = new fjd<>($$0.a(fks.aX));
   }

   public agm a(bxp $$0) {
      return a;
   }

   public void a(bxp $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
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

   protected void a(bxp $$0, eob $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, atq.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
