public class gpd extends gme<cgu, guz, fyv> {
   private static final alc a = alc.b("textures/entity/rabbit/brown.png");
   private static final alc b = alc.b("textures/entity/rabbit/white.png");
   private static final alc k = alc.b("textures/entity/rabbit/black.png");
   private static final alc l = alc.b("textures/entity/rabbit/gold.png");
   private static final alc m = alc.b("textures/entity/rabbit/salt.png");
   private static final alc n = alc.b("textures/entity/rabbit/white_splotched.png");
   private static final alc o = alc.b("textures/entity/rabbit/toast.png");
   private static final alc p = alc.b("textures/entity/rabbit/caerbannog.png");

   public gpd(gnj.a $$0) {
      super($$0, new fyv($$0.a(gak.bX)), new fyv($$0.a(gak.bY)), 0.3F);
   }

   public alc a(guz $$0) {
      if ($$0.b) {
         return o;
      } else {
         return switch ($$0.c) {
            case a -> a;
            case b -> b;
            case c -> k;
            case e -> l;
            case f -> m;
            case d -> n;
            case g -> p;
         };
      }
   }

   public guz c() {
      return new guz();
   }

   public void a(cgu $$0, guz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.aj().getString()));
      $$1.c = $$0.gp();
   }
}
