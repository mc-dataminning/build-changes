public class gha extends ggo<ccw, fqm<ccw>> {
   private static final ajt a = new ajt("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fqm<ccw> j;
   private final fqm<ccw> k;
   private final fqm<ccw> l = this.a();

   public gha(gfi.a $$0) {
      super($$0, new frt<>($$0.a(ftl.bb)), 0.2F);
      this.k = new fru<>($$0.a(ftl.bc));
      this.j = new frv<>($$0.a(ftl.bd));
   }

   public ajt a(ccw $$0) {
      return a;
   }

   public void a(ccw $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
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

   protected void a(ccw $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, axk.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
