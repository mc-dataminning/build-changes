public class glg extends gks<cfl, fvz<cfl>> {
   private static final akk a = new akk("textures/entity/rabbit/brown.png");
   private static final akk i = new akk("textures/entity/rabbit/white.png");
   private static final akk j = new akk("textures/entity/rabbit/black.png");
   private static final akk k = new akk("textures/entity/rabbit/gold.png");
   private static final akk l = new akk("textures/entity/rabbit/salt.png");
   private static final akk m = new akk("textures/entity/rabbit/white_splotched.png");
   private static final akk n = new akk("textures/entity/rabbit/toast.png");
   private static final akk o = new akk("textures/entity/rabbit/caerbannog.png");

   public glg(gjm.a $$0) {
      super($$0, new fvz<>($$0.a(fxn.be)), 0.3F);
   }

   public akk a(cfl $$0) {
      String $$1 = n.a($$0.ag().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.go()) {
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
