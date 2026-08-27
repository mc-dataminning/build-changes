public class ghw extends ghm<cce, fnw<cce>> {
   private static final ajh a = new ajh("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ajh b = new ajh("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ajh c = new ajh("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ajh d = new ajh("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ajh e = new ajh("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ajh f = new ajh("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ajh g = new ajh("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ajh h = new ajh("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ajh i = new ajh("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ajh j = new ajh("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ajh k = new ajh("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ajh l = new ajh("textures/entity/fish/tropical_b_pattern_6.png");
   private final fql<cce> m;
   private final fqm<cce> n;

   public ghw(gew<cce, fnw<cce>> $$0, frb $$1) {
      super($$0);
      this.m = new fql<>($$1.a(fre.bM));
      this.n = new fqm<>($$1.a(fre.bK));
   }

   public void a(eub $$0, fxs $$1, int $$2, cce $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cce.b $$10 = $$3.gy();

      foe<cce> $$11 = (foe<cce>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ajh $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gx().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
