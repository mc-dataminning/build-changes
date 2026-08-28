public class hbe extends hav<het, gfy<het>> {
   private static final alg a = alg.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alg b = alg.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alg c = alg.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alg d = alg.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alg e = alg.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alg f = alg.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alg g = alg.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alg h = alg.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alg i = alg.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alg j = alg.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alg k = alg.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alg l = alg.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gig m;
   private final gih n;

   public hbe(gye<het, gfy<het>> $$0, giy $$1) {
      super($$0);
      this.m = new gig($$1.a(gjb.dF));
      this.n = new gih($$1.a(gjb.dD));
   }

   public void a(fjj $$0, gqa $$1, int $$2, het $$3, float $$4, float $$5) {
      ckb.b $$6 = $$3.a;

      gfy<het> $$7 = (gfy<het>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alg $$8 = switch ($$6) {
         case a -> a;
         case b -> b;
         case c -> c;
         case d -> d;
         case e -> e;
         case f -> f;
         case g -> g;
         case h -> h;
         case i -> i;
         case j -> j;
         case k -> k;
         case l -> l;
      };
      a($$7, $$8, $$0, $$1, $$2, $$3, $$3.c);
   }
}
