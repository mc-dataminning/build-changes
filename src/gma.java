public class gma extends gln<cfx, fvi<cfx>> {
   private static final akr a = akr.b("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fvi<cfx> j;
   private final fvi<cfx> k;
   private final fvi<cfx> l = this.a();

   public gma(gkh.a $$0) {
      super($$0, new fwp<>($$0.a(fyh.bc)), 0.2F);
      this.k = new fwq<>($$0.a(fyh.bd));
      this.j = new fwr<>($$0.a(fyh.be));
   }

   public akr a(cfx $$0) {
      return a;
   }

   public void a(cfx $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      int $$6 = $$0.gn();
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

   protected void a(cfx $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayo.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
