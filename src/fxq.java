public class fxq extends fxd<bxl, fja<bxl>> {
   private static final agi a = new agi("textures/entity/rabbit/brown.png");
   private static final agi i = new agi("textures/entity/rabbit/white.png");
   private static final agi j = new agi("textures/entity/rabbit/black.png");
   private static final agi k = new agi("textures/entity/rabbit/gold.png");
   private static final agi l = new agi("textures/entity/rabbit/salt.png");
   private static final agi m = new agi("textures/entity/rabbit/white_splotched.png");
   private static final agi n = new agi("textures/entity/rabbit/toast.png");
   private static final agi o = new agi("textures/entity/rabbit/caerbannog.png");

   public fxq(fvx.a $$0) {
      super($$0, new fja<>($$0.a(fkn.aY)), 0.3F);
   }

   public agi a(bxl $$0) {
      String $$1 = n.a($$0.ad().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gf()) {
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
