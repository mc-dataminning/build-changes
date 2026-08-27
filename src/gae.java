public class gae extends fzs<byq, fjw<byq>> {
   private static final ahg a = new ahg("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fjw<byq> j;
   private final fjw<byq> k;
   private final fjw<byq> l = this.a();

   public gae(fym.a $$0) {
      super($$0, new fld<>($$0.a(fmv.aY)), 0.2F);
      this.k = new fle<>($$0.a(fmv.aZ));
      this.j = new flf<>($$0.a(fmv.ba));
   }

   public ahg a(byq $$0) {
      return a;
   }

   public void a(byq $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
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

   protected void a(byq $$0, eqa $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, aun.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
