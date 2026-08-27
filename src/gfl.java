public class gfl<T extends chj> extends ggb<T> {
   private static final ajt a = new ajt("textures/entity/illager/evoker.png");

   public gfl(gfi.a $$0) {
      super($$0, new fra<>($$0.a(ftl.ab)), 0.5F);
      this.a(new gjm<T, fra<T>>(this, $$0.d()) {
         public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ajt a(T $$0) {
      return a;
   }
}
