public class get extends ggx<ccj, fpz<ccj>> {
   private static final ajv a = new ajv("textures/entity/bee/bee_angry.png");
   private static final ajv i = new ajv("textures/entity/bee/bee_angry_nectar.png");
   private static final ajv j = new ajv("textures/entity/bee/bee.png");
   private static final ajv k = new ajv("textures/entity/bee/bee_nectar.png");

   public get(gfr.a $$0) {
      super($$0, new fpz<>($$0.a(ftu.k)), 0.4F);
   }

   public ajv a(ccj $$0) {
      if ($$0.Z_()) {
         return $$0.gx() ? i : a;
      } else {
         return $$0.gx() ? k : j;
      }
   }
}
