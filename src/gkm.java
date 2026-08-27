public class gkm extends gkc<cdi, fqn<cdi>> {
   private static final ajv a = new ajv("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ajv b = new ajv("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ajv c = new ajv("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ajv d = new ajv("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ajv e = new ajv("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ajv f = new ajv("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ajv g = new ajv("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ajv h = new ajv("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ajv i = new ajv("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ajv j = new ajv("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ajv k = new ajv("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ajv l = new ajv("textures/entity/fish/tropical_b_pattern_6.png");
   private final ftb<cdi> m;
   private final ftc<cdi> n;

   public gkm(ghm<cdi, fqn<cdi>> $$0, ftr $$1) {
      super($$0);
      this.m = new ftb<>($$1.a(ftu.bM));
      this.n = new ftc<>($$1.a(ftu.bK));
   }

   public void a(ewr $$0, gai $$1, int $$2, cdi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cdi.b $$10 = $$3.gy();

      fqv<cdi> $$11 = (fqv<cdi>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ajv $$12 = switch ($$10) {
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
