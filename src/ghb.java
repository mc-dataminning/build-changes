public class ghb extends ggo<ccx, frx<ccx>> {
   private static final ajt a = new ajt("textures/entity/rabbit/brown.png");
   private static final ajt i = new ajt("textures/entity/rabbit/white.png");
   private static final ajt j = new ajt("textures/entity/rabbit/black.png");
   private static final ajt k = new ajt("textures/entity/rabbit/gold.png");
   private static final ajt l = new ajt("textures/entity/rabbit/salt.png");
   private static final ajt m = new ajt("textures/entity/rabbit/white_splotched.png");
   private static final ajt n = new ajt("textures/entity/rabbit/toast.png");
   private static final ajt o = new ajt("textures/entity/rabbit/caerbannog.png");

   public ghb(gfi.a $$0) {
      super($$0, new frx<>($$0.a(ftl.be)), 0.3F);
   }

   public ajt a(ccx $$0) {
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
