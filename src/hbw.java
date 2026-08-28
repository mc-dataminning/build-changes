public class hbw extends hbm<hfl, ggp<hfl>> {
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
   private final gix m;
   private final giy n;

   public hbw(gyv<hfl, ggp<hfl>> $$0, gjp $$1) {
      super($$0);
      this.m = new gix($$1.a(gjs.dH));
      this.n = new giy($$1.a(gjs.dF));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hfl $$3, float $$4, float $$5) {
      ckf.b $$6 = $$3.a;

      ggp<hfl> $$7 = (ggp<hfl>)(switch ($$6.a()) {
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
