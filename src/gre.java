public class gre extends gof<chs, gxc, gau> {
   private static final alj a = alj.b("textures/entity/rabbit/brown.png");
   private static final alj b = alj.b("textures/entity/rabbit/white.png");
   private static final alj k = alj.b("textures/entity/rabbit/black.png");
   private static final alj l = alj.b("textures/entity/rabbit/gold.png");
   private static final alj m = alj.b("textures/entity/rabbit/salt.png");
   private static final alj n = alj.b("textures/entity/rabbit/white_splotched.png");
   private static final alj o = alj.b("textures/entity/rabbit/toast.png");
   private static final alj p = alj.b("textures/entity/rabbit/caerbannog.png");

   public gre(gpk.a $$0) {
      super($$0, new gau($$0.a(gck.cn)), new gau($$0.a(gck.co)), 0.3F);
   }

   public alj a(gxc $$0) {
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

   public gxc b() {
      return new gxc();
   }

   public void a(chs $$0, gxc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.gm();
   }
}
