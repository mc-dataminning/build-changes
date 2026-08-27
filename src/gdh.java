public class gdh extends gcx<byx, fjo<byx>> {
   private static final ahg a = new ahg("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ahg b = new ahg("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ahg c = new ahg("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ahg d = new ahg("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ahg e = new ahg("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ahg f = new ahg("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ahg g = new ahg("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ahg h = new ahg("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ahg i = new ahg("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ahg j = new ahg("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ahg k = new ahg("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ahg l = new ahg("textures/entity/fish/tropical_b_pattern_6.png");
   private final fmc<byx> m;
   private final fmd<byx> n;

   public gdh(gah<byx, fjo<byx>> $$0, fms $$1) {
      super($$0);
      this.m = new fmc<>($$1.a(fmv.bJ));
      this.n = new fmd<>($$1.a(fmv.bH));
   }

   public void a(eqa $$0, ftg $$1, int $$2, byx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      byx.b $$10 = $$3.gp();

      fjw<byx> $$11 = (fjw<byx>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ahg $$12 = switch ($$10) {
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
      float[] $$13 = $$3.go().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
