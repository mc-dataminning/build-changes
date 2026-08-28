public class gtv extends gqv<chq, gzw, gdj> {
   private static final aku a = aku.b("textures/entity/rabbit/brown.png");
   private static final aku b = aku.b("textures/entity/rabbit/white.png");
   private static final aku k = aku.b("textures/entity/rabbit/black.png");
   private static final aku l = aku.b("textures/entity/rabbit/gold.png");
   private static final aku m = aku.b("textures/entity/rabbit/salt.png");
   private static final aku n = aku.b("textures/entity/rabbit/white_splotched.png");
   private static final aku o = aku.b("textures/entity/rabbit/toast.png");
   private static final aku p = aku.b("textures/entity/rabbit/caerbannog.png");

   public gtv(gsb.a $$0) {
      super($$0, new gdj($$0.a(gez.ct)), new gdj($$0.a(gez.cu)), 0.3F);
   }

   public aku a(gzw $$0) {
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

   public gzw b() {
      return new gzw();
   }

   public void a(chq $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.gp();
   }
}
