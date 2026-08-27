public class gau extends gak<bxw, fhm<bxw>> {
   private static final agm a = new agm("textures/entity/fish/tropical_a_pattern_1.png");
   private static final agm b = new agm("textures/entity/fish/tropical_a_pattern_2.png");
   private static final agm c = new agm("textures/entity/fish/tropical_a_pattern_3.png");
   private static final agm d = new agm("textures/entity/fish/tropical_a_pattern_4.png");
   private static final agm e = new agm("textures/entity/fish/tropical_a_pattern_5.png");
   private static final agm f = new agm("textures/entity/fish/tropical_a_pattern_6.png");
   private static final agm g = new agm("textures/entity/fish/tropical_b_pattern_1.png");
   private static final agm h = new agm("textures/entity/fish/tropical_b_pattern_2.png");
   private static final agm i = new agm("textures/entity/fish/tropical_b_pattern_3.png");
   private static final agm j = new agm("textures/entity/fish/tropical_b_pattern_4.png");
   private static final agm k = new agm("textures/entity/fish/tropical_b_pattern_5.png");
   private static final agm l = new agm("textures/entity/fish/tropical_b_pattern_6.png");
   private final fka<bxw> m;
   private final fkb<bxw> n;

   public gau(fxx<bxw, fhm<bxw>> $$0, fkp $$1) {
      super($$0);
      this.m = new fka<>($$1.a(fks.bG));
      this.n = new fkb<>($$1.a(fks.bE));
   }

   public void a(eob $$0, fqz $$1, int $$2, bxw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bxw.b $$10 = $$3.gq();

      fhu<bxw> $$11 = (fhu<bxw>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      agm $$12 = switch ($$10) {
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
