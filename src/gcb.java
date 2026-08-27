public class gcb<T extends cfq> extends gcr<T> {
   private static final ajc a = new ajc("textures/entity/illager/evoker.png");

   public gcb(gby.a $$0) {
      super($$0, new fns<>($$0.a(fqe.X)), 0.5F);
      this.a(new ggc<T, fns<T>>(this, $$0.d()) {
         public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gv()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ajc a(T $$0) {
      return a;
   }
}
