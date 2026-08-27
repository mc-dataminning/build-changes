public class gfp extends ght<ccu, fqv<ccu>> {
   private static final akf a = new akf("textures/entity/bee/bee_angry.png");
   private static final akf i = new akf("textures/entity/bee/bee_angry_nectar.png");
   private static final akf j = new akf("textures/entity/bee/bee.png");
   private static final akf k = new akf("textures/entity/bee/bee_nectar.png");

   public gfp(ggn.a $$0) {
      super($$0, new fqv<>($$0.a(fuq.k)), 0.4F);
   }

   public akf a(ccu $$0) {
      if ($$0.Z_()) {
         return $$0.gz() ? i : a;
      } else {
         return $$0.gz() ? k : j;
      }
   }
}
