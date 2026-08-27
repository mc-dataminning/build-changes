public class fxp extends fzs<bxy, fjb<bxy>> {
   private static final ahg a = new ahg("textures/entity/bee/bee_angry.png");
   private static final ahg i = new ahg("textures/entity/bee/bee_angry_nectar.png");
   private static final ahg j = new ahg("textures/entity/bee/bee.png");
   private static final ahg k = new ahg("textures/entity/bee/bee_nectar.png");

   public fxp(fym.a $$0) {
      super($$0, new fjb<>($$0.a(fmv.j)), 0.4F);
   }

   public ahg a(bxy $$0) {
      if ($$0.aa_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
