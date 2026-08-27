public class gps extends gpi<cfe, fvi<cfe>> {
   private static final akt a = new akt("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akt b = new akt("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akt c = new akt("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akt d = new akt("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akt e = new akt("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akt f = new akt("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akt g = new akt("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akt h = new akt("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akt i = new akt("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akt j = new akt("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akt k = new akt("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akt l = new akt("textures/entity/fish/tropical_b_pattern_6.png");
   private final fxy<cfe> m;
   private final fxz<cfe> n;

   public gps(gmp<cfe, fvi<cfe>> $$0, fyo $$1) {
      super($$0);
      this.m = new fxy<>($$1.a(fyr.bS));
      this.n = new fxz<>($$1.a(fyr.bQ));
   }

   public void a(fbc $$0, gfg $$1, int $$2, cfe $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfe.b $$10 = $$3.gJ();

      fvq<cfe> $$11 = (fvq<cfe>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akt $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gI().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
