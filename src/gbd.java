public class gbd<T extends cfb> extends gbt<T> {
   private static final aiy a = new aiy("textures/entity/illager/evoker.png");

   public gbd(gba.a $$0) {
      super($$0, new fmw<>($$0.a(fpi.X)), 0.5F);
      this.a(new gfe<T, fmw<T>>(this, $$0.d()) {
         public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gq()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aiy a(T $$0) {
      return a;
   }
}
