public class gnp extends glk<cjt> {
   private static final akt a = new akt("textures/entity/illager/vindicator.png");

   public gnp(gkq.a $$0) {
      super($$0, new fwe<>($$0.a(fyr.bW)), 0.5F);
      this.a(new goy<cjt, fwe<cjt>>(this, $$0.d()) {
         public void a(fbc $$0, gfg $$1, int $$2, cjt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gq()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akt a(cjt $$0) {
      return a;
   }
}
