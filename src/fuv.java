public class fuv extends fui<bvg, fgj<bvg>> {
   private static final aeu a = new aeu("textures/entity/rabbit/brown.png");
   private static final aeu i = new aeu("textures/entity/rabbit/white.png");
   private static final aeu j = new aeu("textures/entity/rabbit/black.png");
   private static final aeu k = new aeu("textures/entity/rabbit/gold.png");
   private static final aeu l = new aeu("textures/entity/rabbit/salt.png");
   private static final aeu m = new aeu("textures/entity/rabbit/white_splotched.png");
   private static final aeu n = new aeu("textures/entity/rabbit/toast.png");
   private static final aeu o = new aeu("textures/entity/rabbit/caerbannog.png");

   public fuv(ftc.a $$0) {
      super($$0, new fgj<>($$0.a(fhw.aY)), 0.3F);
   }

   public aeu a(bvg $$0) {
      String $$1 = n.a($$0.ab().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.ga()) {
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
