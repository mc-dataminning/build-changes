public class hae extends gxe<ckm, hgg, gjo> {
   private static final alk a = alk.b("textures/entity/rabbit/brown.png");
   private static final alk j = alk.b("textures/entity/rabbit/white.png");
   private static final alk k = alk.b("textures/entity/rabbit/black.png");
   private static final alk l = alk.b("textures/entity/rabbit/gold.png");
   private static final alk m = alk.b("textures/entity/rabbit/salt.png");
   private static final alk n = alk.b("textures/entity/rabbit/white_splotched.png");
   private static final alk o = alk.b("textures/entity/rabbit/toast.png");
   private static final alk p = alk.b("textures/entity/rabbit/caerbannog.png");

   public hae(gyk.a $$0) {
      super($$0, new gjo($$0.a(glf.cH)), new gjo($$0.a(glf.cI)), 0.3F);
   }

   public alk a(hgg $$0) {
      if ($$0.b) {
         return o;
      } else {
         return switch ($$0.c) {
            case a -> a;
            case b -> j;
            case c -> k;
            case e -> l;
            case f -> m;
            case d -> n;
            case g -> p;
         };
      }
   }

   public hgg b() {
      return new hgg();
   }

   public void a(ckm $$0, hgg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(o.a($$0.ai().getString()));
      $$1.c = $$0.gu();
   }
}
