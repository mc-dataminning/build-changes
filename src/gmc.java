public class gmc extends glp<cfx, fvk<cfx>> {
   private static final akr a = akr.b("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fvk<cfx> j;
   private final fvk<cfx> k;
   private final fvk<cfx> l = this.a();

   public gmc(gkj.a $$0) {
      super($$0, new fwr<>($$0.a(fyj.bc)), 0.2F);
      this.k = new fws<>($$0.a(fyj.bd));
      this.j = new fwt<>($$0.a(fyj.be));
   }

   public akr a(cfx $$0) {
      return a;
   }

   public void a(cfx $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      int $$6 = $$0.gm();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.g = this.j;
         } else if ($$6 == 1) {
            this.g = this.k;
         } else {
            this.g = this.l;
         }
      }

      this.i = $$6;
      this.e = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cfx $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayo.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
