public class giq extends gku<cet, ftu<cet>> {
   private static final akk a = new akk("textures/entity/bee/bee_angry.png");
   private static final akk i = new akk("textures/entity/bee/bee_angry_nectar.png");
   private static final akk j = new akk("textures/entity/bee/bee.png");
   private static final akk k = new akk("textures/entity/bee/bee_nectar.png");

   public giq(gjo.a $$0) {
      super($$0, new ftu<>($$0.a(fxp.k)), 0.4F);
   }

   public akk a(cet $$0) {
      if ($$0.Z_()) {
         return $$0.gx() ? i : a;
      } else {
         return $$0.gx() ? k : j;
      }
   }
}
