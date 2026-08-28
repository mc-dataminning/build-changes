public class gkg<T extends ckl> extends gkw<T> {
   private static final akq a = akq.b("textures/entity/illager/evoker.png");

   public gkg(gkd.a $$0) {
      super($$0, new fvs<>($$0.a(fyd.ac)), 0.5F);
      this.a(new goi<T, fvs<T>>(this, $$0.d()) {
         public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gw()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akq a(T $$0) {
      return a;
   }
}
