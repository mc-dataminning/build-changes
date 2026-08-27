public class gmp extends gmf<cfe, fso<cfe>> {
   private static final akm a = new akm("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akm b = new akm("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akm c = new akm("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akm d = new akm("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akm e = new akm("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akm f = new akm("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akm g = new akm("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akm h = new akm("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akm i = new akm("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akm j = new akm("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akm k = new akm("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akm l = new akm("textures/entity/fish/tropical_b_pattern_6.png");
   private final fvc<cfe> m;
   private final fvd<cfe> n;

   public gmp(gjp<cfe, fso<cfe>> $$0, fvs $$1) {
      super($$0);
      this.m = new fvc<>($$1.a(fvv.bM));
      this.n = new fvd<>($$1.a(fvv.bK));
   }

   public void a(eys $$0, gck $$1, int $$2, cfe $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfe.b $$10 = $$3.gA();

      fsw<cfe> $$11 = (fsw<cfe>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akm $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gz().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
