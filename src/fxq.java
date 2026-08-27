public class fxq extends fzt<bxz, fjc<bxz>> {
   private static final ahg a = new ahg("textures/entity/bee/bee_angry.png");
   private static final ahg i = new ahg("textures/entity/bee/bee_angry_nectar.png");
   private static final ahg j = new ahg("textures/entity/bee/bee.png");
   private static final ahg k = new ahg("textures/entity/bee/bee_nectar.png");

   public fxq(fyn.a $$0) {
      super($$0, new fjc<>($$0.a(fmw.j)), 0.4F);
   }

   public ahg a(bxz $$0) {
      if ($$0.aa_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
