public class ger extends gee<cbx, fpo<cbx>> {
   private static final ajh a = new ajh("textures/entity/rabbit/brown.png");
   private static final ajh i = new ajh("textures/entity/rabbit/white.png");
   private static final ajh j = new ajh("textures/entity/rabbit/black.png");
   private static final ajh k = new ajh("textures/entity/rabbit/gold.png");
   private static final ajh l = new ajh("textures/entity/rabbit/salt.png");
   private static final ajh m = new ajh("textures/entity/rabbit/white_splotched.png");
   private static final ajh n = new ajh("textures/entity/rabbit/toast.png");
   private static final ajh o = new ajh("textures/entity/rabbit/caerbannog.png");

   public ger(gcy.a $$0) {
      super($$0, new fpo<>($$0.a(frc.ba)), 0.3F);
   }

   public ajh a(cbx $$0) {
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
