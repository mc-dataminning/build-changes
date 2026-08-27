public class fxi extends fzl<bxt, fiu<bxt>> {
   private static final ahd a = new ahd("textures/entity/bee/bee_angry.png");
   private static final ahd i = new ahd("textures/entity/bee/bee_angry_nectar.png");
   private static final ahd j = new ahd("textures/entity/bee/bee.png");
   private static final ahd k = new ahd("textures/entity/bee/bee_nectar.png");

   public fxi(fyf.a $$0) {
      super($$0, new fiu<>($$0.a(fmo.j)), 0.4F);
   }

   public ahd a(bxt $$0) {
      if ($$0.aa_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
