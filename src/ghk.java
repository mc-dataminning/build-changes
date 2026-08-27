public class ghk extends ggx<cdc, fsg<cdc>> {
   private static final ajv a = new ajv("textures/entity/rabbit/brown.png");
   private static final ajv i = new ajv("textures/entity/rabbit/white.png");
   private static final ajv j = new ajv("textures/entity/rabbit/black.png");
   private static final ajv k = new ajv("textures/entity/rabbit/gold.png");
   private static final ajv l = new ajv("textures/entity/rabbit/salt.png");
   private static final ajv m = new ajv("textures/entity/rabbit/white_splotched.png");
   private static final ajv n = new ajv("textures/entity/rabbit/toast.png");
   private static final ajv o = new ajv("textures/entity/rabbit/caerbannog.png");

   public ghk(gfr.a $$0) {
      super($$0, new fsg<>($$0.a(ftu.be)), 0.3F);
   }

   public ajv a(cdc $$0) {
      String $$1 = n.a($$0.ad().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gn()) {
            case a -> a;
            case b -> i;
            case c -> j;
            case e -> k;
            case f -> l;
            case d -> m;
            case g -> o;
         };
      }
   }
}
