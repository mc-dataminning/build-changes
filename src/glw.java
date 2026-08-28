public class glw extends glj<cfv, fve<cfv>> {
   private static final akq a = akq.b("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fve<cfv> j;
   private final fve<cfv> k;
   private final fve<cfv> l = this.a();

   public glw(gkd.a $$0) {
      super($$0, new fwl<>($$0.a(fyd.bc)), 0.2F);
      this.k = new fwm<>($$0.a(fyd.bd));
      this.j = new fwn<>($$0.a(fyd.be));
   }

   public akq a(cfv $$0) {
      return a;
   }

   public void a(cfv $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      int $$6 = $$0.go();
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

   protected void a(cfv $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, ayn.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
