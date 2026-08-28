public class gll extends glp<chl, fwd<chl>> {
   private static final akr a = akr.b("textures/entity/llama/creamy.png");
   private static final akr i = akr.b("textures/entity/llama/white.png");
   private static final akr j = akr.b("textures/entity/llama/brown.png");
   private static final akr k = akr.b("textures/entity/llama/gray.png");

   public gll(gkj.a $$0, fyi $$1) {
      super($$0, new fwd<>($$0.a($$1)), 0.7F);
      this.a(new gop(this, $$0.f()));
   }

   public akr a(chl $$0) {
      return switch ($$0.gv()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
