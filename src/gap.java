public class gap extends gaf<bxr, fhh<bxr>> {
   private static final agi a = new agi("textures/entity/fish/tropical_a_pattern_1.png");
   private static final agi b = new agi("textures/entity/fish/tropical_a_pattern_2.png");
   private static final agi c = new agi("textures/entity/fish/tropical_a_pattern_3.png");
   private static final agi d = new agi("textures/entity/fish/tropical_a_pattern_4.png");
   private static final agi e = new agi("textures/entity/fish/tropical_a_pattern_5.png");
   private static final agi f = new agi("textures/entity/fish/tropical_a_pattern_6.png");
   private static final agi g = new agi("textures/entity/fish/tropical_b_pattern_1.png");
   private static final agi h = new agi("textures/entity/fish/tropical_b_pattern_2.png");
   private static final agi i = new agi("textures/entity/fish/tropical_b_pattern_3.png");
   private static final agi j = new agi("textures/entity/fish/tropical_b_pattern_4.png");
   private static final agi k = new agi("textures/entity/fish/tropical_b_pattern_5.png");
   private static final agi l = new agi("textures/entity/fish/tropical_b_pattern_6.png");
   private final fjv<bxr> m;
   private final fjw<bxr> n;

   public gap(fxs<bxr, fhh<bxr>> $$0, fkk $$1) {
      super($$0);
      this.m = new fjv<>($$1.a(fkn.bG));
      this.n = new fjw<>($$1.a(fkn.bE));
   }

   public void a(enw $$0, fqu $$1, int $$2, bxr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bxr.b $$10 = $$3.gq();

      fhp<bxr> $$11 = (fhp<bxr>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      agi $$12 = switch ($$10) {
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
