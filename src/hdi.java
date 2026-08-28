public class hdi extends hcy<hgx, gic<hgx>> {
   private static final alk a = alk.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alk b = alk.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alk c = alk.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alk d = alk.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alk e = alk.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alk f = alk.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alk g = alk.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alk h = alk.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alk i = alk.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alk j = alk.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alk k = alk.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alk l = alk.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gkk m;
   private final gkl n;

   public hdi(hah<hgx, gic<hgx>> $$0, glc $$1) {
      super($$0);
      this.m = new gkk($$1.a(glf.dH));
      this.n = new gkl($$1.a(glf.dF));
   }

   public void a(flq $$0, gsc $$1, int $$2, hgx $$3, float $$4, float $$5) {
      cks.b $$6 = $$3.a;

      gic<hgx> $$7 = (gic<hgx>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alk $$8 = switch ($$6) {
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
