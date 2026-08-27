public class gdi extends gcy<byy, fjp<byy>> {
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
   private final fmd<byy> m;
   private final fme<byy> n;

   public gdi(gai<byy, fjp<byy>> $$0, fmt $$1) {
      super($$0);
      this.m = new fmd<>($$1.a(fmw.bJ));
      this.n = new fme<>($$1.a(fmw.bH));
   }

   public void a(eqb $$0, fth $$1, int $$2, byy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      byy.b $$10 = $$3.gp();

      fjx<byy> $$11 = (fjx<byy>)(switch ($$10.a()) {
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
