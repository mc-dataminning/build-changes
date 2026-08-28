public class hah extends gzy<hdv, gfd<hdv>> {
   private static final ale a = ale.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ale b = ale.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ale c = ale.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ale d = ale.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ale e = ale.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ale f = ale.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ale g = ale.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ale h = ale.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ale i = ale.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ale j = ale.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ale k = ale.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ale l = ale.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final ghl m;
   private final ghm n;

   public hah(gxh<hdv, gfd<hdv>> $$0, gic $$1) {
      super($$0);
      this.m = new ghl($$1.a(gif.dB));
      this.n = new ghm($$1.a(gif.dz));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hdv $$3, float $$4, float $$5) {
      cjr.b $$6 = $$3.a;

      gfd<hdv> $$7 = (gfd<hdv>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ale $$8 = switch ($$6) {
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
