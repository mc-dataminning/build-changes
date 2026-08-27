public class gac extends fzs<bxj, fgu<bxj>> {
   private static final agg a = new agg("textures/entity/fish/tropical_a_pattern_1.png");
   private static final agg b = new agg("textures/entity/fish/tropical_a_pattern_2.png");
   private static final agg c = new agg("textures/entity/fish/tropical_a_pattern_3.png");
   private static final agg d = new agg("textures/entity/fish/tropical_a_pattern_4.png");
   private static final agg e = new agg("textures/entity/fish/tropical_a_pattern_5.png");
   private static final agg f = new agg("textures/entity/fish/tropical_a_pattern_6.png");
   private static final agg g = new agg("textures/entity/fish/tropical_b_pattern_1.png");
   private static final agg h = new agg("textures/entity/fish/tropical_b_pattern_2.png");
   private static final agg i = new agg("textures/entity/fish/tropical_b_pattern_3.png");
   private static final agg j = new agg("textures/entity/fish/tropical_b_pattern_4.png");
   private static final agg k = new agg("textures/entity/fish/tropical_b_pattern_5.png");
   private static final agg l = new agg("textures/entity/fish/tropical_b_pattern_6.png");
   private final fji<bxj> m;
   private final fjj<bxj> n;

   public gac(fxf<bxj, fgu<bxj>> $$0, fjx $$1) {
      super($$0);
      this.m = new fji<>($$1.a(fka.bG));
      this.n = new fjj<>($$1.a(fka.bE));
   }

   public void a(enk $$0, fqh $$1, int $$2, bxj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bxj.b $$10 = $$3.gp();

      fhc<bxj> $$11 = (fhc<bxj>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      agg $$12 = switch ($$10) {
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
