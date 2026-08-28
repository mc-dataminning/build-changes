public class gtz extends gqz<cht, haa, gdn> {
   private static final akv a = akv.b("textures/entity/rabbit/brown.png");
   private static final akv b = akv.b("textures/entity/rabbit/white.png");
   private static final akv k = akv.b("textures/entity/rabbit/black.png");
   private static final akv l = akv.b("textures/entity/rabbit/gold.png");
   private static final akv m = akv.b("textures/entity/rabbit/salt.png");
   private static final akv n = akv.b("textures/entity/rabbit/white_splotched.png");
   private static final akv o = akv.b("textures/entity/rabbit/toast.png");
   private static final akv p = akv.b("textures/entity/rabbit/caerbannog.png");

   public gtz(gsf.a $$0) {
      super($$0, new gdn($$0.a(gfd.ct)), new gdn($$0.a(gfd.cu)), 0.3F);
   }

   public akv a(haa $$0) {
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

   public haa b() {
      return new haa();
   }

   public void a(cht $$0, haa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.gs();
   }
}
