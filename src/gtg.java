public class gtg extends gsx<gws, fyk<gws>> {
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
   private final gar m;
   private final gas n;

   public gtg(gqg<gws, fyk<gws>> $$0, gbi $$1) {
      super($$0);
      this.m = new gar($$1.a(gbl.cP));
      this.n = new gas($$1.a(gbl.cN));
   }

   public void a(feb $$0, gih $$1, int $$2, gws $$3, float $$4, float $$5) {
      chr.b $$6 = $$3.a;

      fyk<gws> $$7 = (fyk<gws>)(switch ($$6.a()) {
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
