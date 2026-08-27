public class gjn extends giz<cfa, fuh<cfa>> {
   private static final akn a = new akn("textures/entity/rabbit/brown.png");
   private static final akn i = new akn("textures/entity/rabbit/white.png");
   private static final akn j = new akn("textures/entity/rabbit/black.png");
   private static final akn k = new akn("textures/entity/rabbit/gold.png");
   private static final akn l = new akn("textures/entity/rabbit/salt.png");
   private static final akn m = new akn("textures/entity/rabbit/white_splotched.png");
   private static final akn n = new akn("textures/entity/rabbit/toast.png");
   private static final akn o = new akn("textures/entity/rabbit/caerbannog.png");

   public gjn(ght.a $$0) {
      super($$0, new fuh<>($$0.a(fvv.be)), 0.3F);
   }

   public akn a(cfa $$0) {
      String $$1 = n.a($$0.af().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gp()) {
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
