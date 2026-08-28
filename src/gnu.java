public class gnu extends gnk<cgg, ftt<cgg>> {
   private static final alf a = new alf("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alf b = new alf("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alf c = new alf("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alf d = new alf("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alf e = new alf("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alf f = new alf("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alf g = new alf("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alf h = new alf("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alf i = new alf("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alf j = new alf("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alf k = new alf("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alf l = new alf("textures/entity/fish/tropical_b_pattern_6.png");
   private final fwh<cgg> m;
   private final fwi<cgg> n;

   public gnu(gku<cgg, ftt<cgg>> $$0, fwx $$1) {
      super($$0);
      this.m = new fwh<>($$1.a(fxa.bM));
      this.n = new fwi<>($$1.a(fxa.bK));
   }

   public void a(ezz $$0, gdp $$1, int $$2, cgg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cgg.b $$10 = $$3.gB();

      fub<cgg> $$11 = (fub<cgg>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alf $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gA().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
