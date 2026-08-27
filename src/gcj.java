public class gcj extends gbz<byi, fiq<byi>> {
   private static final agt a = new agt("textures/entity/fish/tropical_a_pattern_1.png");
   private static final agt b = new agt("textures/entity/fish/tropical_a_pattern_2.png");
   private static final agt c = new agt("textures/entity/fish/tropical_a_pattern_3.png");
   private static final agt d = new agt("textures/entity/fish/tropical_a_pattern_4.png");
   private static final agt e = new agt("textures/entity/fish/tropical_a_pattern_5.png");
   private static final agt f = new agt("textures/entity/fish/tropical_a_pattern_6.png");
   private static final agt g = new agt("textures/entity/fish/tropical_b_pattern_1.png");
   private static final agt h = new agt("textures/entity/fish/tropical_b_pattern_2.png");
   private static final agt i = new agt("textures/entity/fish/tropical_b_pattern_3.png");
   private static final agt j = new agt("textures/entity/fish/tropical_b_pattern_4.png");
   private static final agt k = new agt("textures/entity/fish/tropical_b_pattern_5.png");
   private static final agt l = new agt("textures/entity/fish/tropical_b_pattern_6.png");
   private final fle<byi> m;
   private final flf<byi> n;

   public gcj(fzj<byi, fiq<byi>> $$0, flu $$1) {
      super($$0);
      this.m = new fle<>($$1.a(flx.bJ));
      this.n = new flf<>($$1.a(flx.bH));
   }

   public void a(epd $$0, fsi $$1, int $$2, byi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      byi.b $$10 = $$3.gp();

      fiy<byi> $$11 = (fiy<byi>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      agt $$12 = switch ($$10) {
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
