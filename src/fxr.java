public class fxr<T extends ccj> extends fyh<T> {
   private static final agt a = new agt("textures/entity/illager/evoker.png");

   public fxr(fxo.a $$0) {
      super($$0, new fjm<>($$0.a(flx.Y)), 0.5F);
      this.a(new gbs<T, fjm<T>>(this, $$0.d()) {
         public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.go()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public agt a(T $$0) {
      return a;
   }
}
