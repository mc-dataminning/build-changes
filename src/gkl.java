public class gkl extends gjy<cft, ftv<cft>> {
   private static final alb a = new alb("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final ftv<cft> j;
   private final ftv<cft> k;
   private final ftv<cft> l = this.a();

   public gkl(gis.a $$0) {
      super($$0, new fvc<>($$0.a(fwu.bb)), 0.2F);
      this.k = new fvd<>($$0.a(fwu.bc));
      this.j = new fve<>($$0.a(fwu.bd));
   }

   public alb a(cft $$0) {
      return a;
   }

   public void a(cft $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
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

   protected void a(cft $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayu.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
