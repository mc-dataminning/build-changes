public class gwj extends gwa<gzv, gbh<gzv>> {
   private static final alp a = alp.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alp b = alp.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alp c = alp.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alp d = alp.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alp e = alp.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alp f = alp.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alp g = alp.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alp h = alp.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alp i = alp.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alp j = alp.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alp k = alp.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alp l = alp.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gdo m;
   private final gdp n;

   public gwj(gti<gzv, gbh<gzv>> $$0, gef $$1) {
      super($$0);
      this.m = new gdo($$1.a(gei.dp));
      this.n = new gdp($$1.a(gei.dn));
   }

   public void a(fgl $$0, glg $$1, int $$2, gzv $$3, float $$4, float $$5) {
      cio.b $$6 = $$3.a;

      gbh<gzv> $$7 = (gbh<gzv>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alp $$8 = switch ($$6) {
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
