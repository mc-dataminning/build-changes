public class ggv extends giz<cef, fsa<cef>> {
   private static final akm a = new akm("textures/entity/bee/bee_angry.png");
   private static final akm i = new akm("textures/entity/bee/bee_angry_nectar.png");
   private static final akm j = new akm("textures/entity/bee/bee.png");
   private static final akm k = new akm("textures/entity/bee/bee_nectar.png");

   public ggv(ght.a $$0) {
      super($$0, new fsa<>($$0.a(fvv.k)), 0.4F);
   }

   public akm a(cef $$0) {
      if ($$0.Z_()) {
         return $$0.gz() ? i : a;
      } else {
         return $$0.gz() ? k : j;
      }
   }
}
