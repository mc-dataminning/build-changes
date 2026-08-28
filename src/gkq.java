public class gkq extends gkc<cfy, fvk<cfy>> {
   private static final ale a = new ale("textures/entity/rabbit/brown.png");
   private static final ale i = new ale("textures/entity/rabbit/white.png");
   private static final ale j = new ale("textures/entity/rabbit/black.png");
   private static final ale k = new ale("textures/entity/rabbit/gold.png");
   private static final ale l = new ale("textures/entity/rabbit/salt.png");
   private static final ale m = new ale("textures/entity/rabbit/white_splotched.png");
   private static final ale n = new ale("textures/entity/rabbit/toast.png");
   private static final ale o = new ale("textures/entity/rabbit/caerbannog.png");

   public gkq(giw.a $$0) {
      super($$0, new fvk<>($$0.a(fwy.be)), 0.3F);
   }

   public ale a(cfy $$0) {
      String $$1 = n.a($$0.af().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gq()) {
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
