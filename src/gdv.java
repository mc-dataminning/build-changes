public class gdv extends gdl<bzc, fkb<bzc>> {
   private static final ahh a = new ahh("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ahh b = new ahh("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ahh c = new ahh("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ahh d = new ahh("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ahh e = new ahh("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ahh f = new ahh("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ahh g = new ahh("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ahh h = new ahh("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ahh i = new ahh("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ahh j = new ahh("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ahh k = new ahh("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ahh l = new ahh("textures/entity/fish/tropical_b_pattern_6.png");
   private final fmp<bzc> m;
   private final fmq<bzc> n;

   public gdv(gav<bzc, fkb<bzc>> $$0, fnf $$1) {
      super($$0);
      this.m = new fmp<>($$1.a(fni.bI));
      this.n = new fmq<>($$1.a(fni.bG));
   }

   public void a(eqk $$0, ftt $$1, int $$2, bzc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bzc.b $$10 = $$3.gq();

      fkj<bzc> $$11 = (fkj<bzc>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ahh $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gp().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
