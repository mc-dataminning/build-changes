public class gzc extends gyt<hcq, gea<hcq>> {
   private static final ald a = ald.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ald b = ald.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ald c = ald.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ald d = ald.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ald e = ald.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ald f = ald.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ald g = ald.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ald h = ald.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ald i = ald.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ald j = ald.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ald k = ald.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ald l = ald.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final ggi m;
   private final ggj n;

   public gzc(gwc<hcq, gea<hcq>> $$0, ggz $$1) {
      super($$0);
      this.m = new ggi($$1.a(ghc.dB));
      this.n = new ggj($$1.a(ghc.dz));
   }

   public void a(fho $$0, gny $$1, int $$2, hcq $$3, float $$4, float $$5) {
      cjj.b $$6 = $$3.a;

      gea<hcq> $$7 = (gea<hcq>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ald $$8 = switch ($$6) {
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
