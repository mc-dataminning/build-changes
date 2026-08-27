public class gct extends gcg<car, fnt<car>> {
   private static final aiy a = new aiy("textures/entity/rabbit/brown.png");
   private static final aiy i = new aiy("textures/entity/rabbit/white.png");
   private static final aiy j = new aiy("textures/entity/rabbit/black.png");
   private static final aiy k = new aiy("textures/entity/rabbit/gold.png");
   private static final aiy l = new aiy("textures/entity/rabbit/salt.png");
   private static final aiy m = new aiy("textures/entity/rabbit/white_splotched.png");
   private static final aiy n = new aiy("textures/entity/rabbit/toast.png");
   private static final aiy o = new aiy("textures/entity/rabbit/caerbannog.png");

   public gct(gba.a $$0) {
      super($$0, new fnt<>($$0.a(fpi.ba)), 0.3F);
   }

   public aiy a(car $$0) {
      String $$1 = n.a($$0.ad().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gg()) {
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
