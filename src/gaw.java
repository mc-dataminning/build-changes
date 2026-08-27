public class gaw extends fzl<byt, flx<byt>> {
   private static final ahd a = new ahd("textures/entity/turtle/big_sea_turtle.png");

   public gaw(fyf.a $$0) {
      super($$0, new flx<>($$0.a(fmo.bK)), 0.7F);
   }

   public void a(byt $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      if ($$0.o_()) {
         this.d *= 0.5F;
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(byt $$0) {
      return a;
   }
}
