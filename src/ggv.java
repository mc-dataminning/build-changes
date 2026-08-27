public class ggv extends giz<ceh, fsa<ceh>> {
   private static final akn a = new akn("textures/entity/bee/bee_angry.png");
   private static final akn i = new akn("textures/entity/bee/bee_angry_nectar.png");
   private static final akn j = new akn("textures/entity/bee/bee.png");
   private static final akn k = new akn("textures/entity/bee/bee_nectar.png");

   public ggv(ght.a $$0) {
      super($$0, new fsa<>($$0.a(fvv.k)), 0.4F);
   }

   public akn a(ceh $$0) {
      if ($$0.Z_()) {
         return $$0.gz() ? i : a;
      } else {
         return $$0.gz() ? k : j;
      }
   }
}
