public class fxo extends fzr<bxy, fja<bxy>> {
   private static final ahg a = new ahg("textures/entity/bee/bee_angry.png");
   private static final ahg i = new ahg("textures/entity/bee/bee_angry_nectar.png");
   private static final ahg j = new ahg("textures/entity/bee/bee.png");
   private static final ahg k = new ahg("textures/entity/bee/bee_nectar.png");

   public fxo(fyl.a $$0) {
      super($$0, new fja<>($$0.a(fmu.j)), 0.4F);
   }

   public ahg a(bxy $$0) {
      if ($$0.aa_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
