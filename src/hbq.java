public class hbq extends hbh<hff, ggk<hff>> {
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
   private final gis m;
   private final git n;

   public hbq(gyq<hff, ggk<hff>> $$0, gjk $$1) {
      super($$0);
      this.m = new gis($$1.a(gjn.dF));
      this.n = new git($$1.a(gjn.dD));
   }

   public void a(fjy $$0, gqm $$1, int $$2, hff $$3, float $$4, float $$5) {
      ckf.b $$6 = $$3.a;

      ggk<hff> $$7 = (ggk<hff>)(switch ($$6.a()) {
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
