public class gdr extends gde<cbg, fop<cbg>> {
   private static final ajc a = new ajc("textures/entity/rabbit/brown.png");
   private static final ajc i = new ajc("textures/entity/rabbit/white.png");
   private static final ajc j = new ajc("textures/entity/rabbit/black.png");
   private static final ajc k = new ajc("textures/entity/rabbit/gold.png");
   private static final ajc l = new ajc("textures/entity/rabbit/salt.png");
   private static final ajc m = new ajc("textures/entity/rabbit/white_splotched.png");
   private static final ajc n = new ajc("textures/entity/rabbit/toast.png");
   private static final ajc o = new ajc("textures/entity/rabbit/caerbannog.png");

   public gdr(gby.a $$0) {
      super($$0, new fop<>($$0.a(fqe.ba)), 0.3F);
   }

   public ajc a(cbg $$0) {
      String $$1 = n.a($$0.ad().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gl()) {
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
