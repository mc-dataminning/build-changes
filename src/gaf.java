public class gaf extends fzt<byr, fjx<byr>> {
   private static final ahg a = new ahg("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fjx<byr> j;
   private final fjx<byr> k;
   private final fjx<byr> l = this.a();

   public gaf(fyn.a $$0) {
      super($$0, new fle<>($$0.a(fmw.aY)), 0.2F);
      this.k = new flf<>($$0.a(fmw.aZ));
      this.j = new flg<>($$0.a(fmw.ba));
   }

   public ahg a(byr $$0) {
      return a;
   }

   public void a(byr $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      int $$6 = $$0.gg();
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

   protected void a(byr $$0, eqb $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, auo.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
