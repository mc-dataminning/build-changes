public class glj extends gln<chl, fwb<chl>> {
   private static final akr a = akr.b("textures/entity/llama/creamy.png");
   private static final akr i = akr.b("textures/entity/llama/white.png");
   private static final akr j = akr.b("textures/entity/llama/brown.png");
   private static final akr k = akr.b("textures/entity/llama/gray.png");

   public glj(gkh.a $$0, fyg $$1) {
      super($$0, new fwb<>($$0.a($$1)), 0.7F);
      this.a(new gon(this, $$0.f()));
   }

   public akr a(chl $$0) {
      return switch ($$0.gw()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
