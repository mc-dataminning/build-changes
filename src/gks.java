public class gks extends gkf<cga, fuc<cga>> {
   private static final alf a = new alf("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fuc<cga> j;
   private final fuc<cga> k;
   private final fuc<cga> l = this.a();

   public gks(giz.a $$0) {
      super($$0, new fvj<>($$0.a(fxb.bb)), 0.2F);
      this.k = new fvk<>($$0.a(fxb.bc));
      this.j = new fvl<>($$0.a(fxb.bd));
   }

   public alf a(cga $$0) {
      return a;
   }

   public void a(cga $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
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

   protected void a(cga $$0, faa $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayz.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
