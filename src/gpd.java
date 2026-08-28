public class gpd extends got<cge, fva<cge>> {
   private static final akr a = akr.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akr b = akr.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akr c = akr.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akr d = akr.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akr e = akr.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akr f = akr.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akr g = akr.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akr h = akr.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akr i = akr.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akr j = akr.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akr k = akr.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akr l = akr.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final fxo<cge> m;
   private final fxp<cge> n;

   public gpd(gmd<cge, fva<cge>> $$0, fye $$1) {
      super($$0);
      this.m = new fxo<>($$1.a(fyh.bN));
      this.n = new fxp<>($$1.a(fyh.bL));
   }

   public void a(fbg $$0, gex $$1, int $$2, cge $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cge.b $$10 = $$3.gw();

      fvi<cge> $$11 = (fvi<cge>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akr $$12 = switch ($$10) {
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
      int $$13 = $$3.gv().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13);
   }
}
