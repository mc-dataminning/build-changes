public class gdg extends gcw<byx, fjn<byx>> {
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
   private final fmb<byx> m;
   private final fmc<byx> n;

   public gdg(gag<byx, fjn<byx>> $$0, fmr $$1) {
      super($$0);
      this.m = new fmb<>($$1.a(fmu.bJ));
      this.n = new fmc<>($$1.a(fmu.bH));
   }

   public void a(epz $$0, ftf $$1, int $$2, byx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      byx.b $$10 = $$3.gp();

      fjv<byx> $$11 = (fjv<byx>)(switch ($$10.a()) {
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
