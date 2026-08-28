public class gwh extends gvy<gzt, gbf<gzt>> {
   private static final alz a = alz.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alz b = alz.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alz c = alz.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alz d = alz.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alz e = alz.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alz f = alz.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alz g = alz.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alz h = alz.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alz i = alz.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alz j = alz.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alz k = alz.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alz l = alz.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gdm m;
   private final gdn n;

   public gwh(gtg<gzt, gbf<gzt>> $$0, ged $$1) {
      super($$0);
      this.m = new gdm($$1.a(geg.dk));
      this.n = new gdn($$1.a(geg.di));
   }

   public void a(fgl $$0, gle $$1, int $$2, gzt $$3, float $$4, float $$5) {
      cis.b $$6 = $$3.a;

      gbf<gzt> $$7 = (gbf<gzt>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alz $$8 = switch ($$6) {
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
