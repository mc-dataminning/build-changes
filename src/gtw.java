public class gtw extends gtn<gxi, fza<gxi>> {
   private static final all a = all.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final all b = all.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final all c = all.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final all d = all.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final all e = all.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final all f = all.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final all g = all.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final all h = all.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final all i = all.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final all j = all.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final all k = all.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final all l = all.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gbh m;
   private final gbi n;

   public gtw(gqw<gxi, fza<gxi>> $$0, gby $$1) {
      super($$0);
      this.m = new gbh($$1.a(gcb.cP));
      this.n = new gbi($$1.a(gcb.cN));
   }

   public void a(fek $$0, gix $$1, int $$2, gxi $$3, float $$4, float $$5) {
      chv.b $$6 = $$3.a;

      fza<gxi> $$7 = (fza<gxi>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      all $$8 = switch ($$6) {
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
