public class gpt extends gmu<chg, gvq, fzk> {
   private static final alh a = alh.b("textures/entity/rabbit/brown.png");
   private static final alh b = alh.b("textures/entity/rabbit/white.png");
   private static final alh k = alh.b("textures/entity/rabbit/black.png");
   private static final alh l = alh.b("textures/entity/rabbit/gold.png");
   private static final alh m = alh.b("textures/entity/rabbit/salt.png");
   private static final alh n = alh.b("textures/entity/rabbit/white_splotched.png");
   private static final alh o = alh.b("textures/entity/rabbit/toast.png");
   private static final alh p = alh.b("textures/entity/rabbit/caerbannog.png");

   public gpt(gnz.a $$0) {
      super($$0, new fzk($$0.a(gba.bX)), new fzk($$0.a(gba.bY)), 0.3F);
   }

   public alh a(gvq $$0) {
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

   public gvq c() {
      return new gvq();
   }

   public void a(chg $$0, gvq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.gv();
   }
}
