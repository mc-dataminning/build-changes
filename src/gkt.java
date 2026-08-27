public class gkt<T extends cjo> extends glk<T> {
   private static final akt a = new akt("textures/entity/illager/evoker.png");

   public gkt(gkq.a $$0) {
      super($$0, new fwe<>($$0.a(fyr.ae)), 0.5F);
      this.a(new goy<T, fwe<T>>(this, $$0.d()) {
         public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gI()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akt a(T $$0) {
      return a;
   }
}
