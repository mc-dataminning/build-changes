public class gkm<T extends ckn> extends glc<T> {
   private static final akr a = akr.b("textures/entity/illager/evoker.png");

   public gkm(gkj.a $$0) {
      super($$0, new fvy<>($$0.a(fyj.ac)), 0.5F);
      this.a(new goo<T, fvy<T>>(this, $$0.d()) {
         public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gu()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akr a(T $$0) {
      return a;
   }
}
