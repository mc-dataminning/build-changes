public class hdg extends hcw<hgv, gia<hgv>> {
   private static final ali a = ali.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ali b = ali.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ali c = ali.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ali d = ali.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ali e = ali.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ali f = ali.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ali g = ali.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ali h = ali.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ali i = ali.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ali j = ali.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ali k = ali.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ali l = ali.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gki m;
   private final gkj n;

   public hdg(haf<hgv, gia<hgv>> $$0, gla $$1) {
      super($$0);
      this.m = new gki($$1.a(gld.dH));
      this.n = new gkj($$1.a(gld.dF));
   }

   public void a(flo $$0, gsa $$1, int $$2, hgv $$3, float $$4, float $$5) {
      ckq.b $$6 = $$3.a;

      gia<hgv> $$7 = (gia<hgv>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ali $$8 = switch ($$6) {
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
