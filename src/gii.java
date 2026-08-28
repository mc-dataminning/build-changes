public class gii extends gkm<cep, ftm<cep>> {
   private static final akk a = new akk("textures/entity/bee/bee_angry.png");
   private static final akk i = new akk("textures/entity/bee/bee_angry_nectar.png");
   private static final akk j = new akk("textures/entity/bee/bee.png");
   private static final akk k = new akk("textures/entity/bee/bee_nectar.png");

   public gii(gjg.a $$0) {
      super($$0, new ftm<>($$0.a(fxh.k)), 0.4F);
   }

   public akk a(cep $$0) {
      if ($$0.Z_()) {
         return $$0.gx() ? i : a;
      } else {
         return $$0.gx() ? k : j;
      }
   }
}
