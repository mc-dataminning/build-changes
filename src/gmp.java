public class gmp extends gmf<cfg, fso<cfg>> {
   private static final akn a = new akn("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akn b = new akn("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akn c = new akn("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akn d = new akn("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akn e = new akn("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akn f = new akn("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akn g = new akn("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akn h = new akn("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akn i = new akn("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akn j = new akn("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akn k = new akn("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akn l = new akn("textures/entity/fish/tropical_b_pattern_6.png");
   private final fvc<cfg> m;
   private final fvd<cfg> n;

   public gmp(gjp<cfg, fso<cfg>> $$0, fvs $$1) {
      super($$0);
      this.m = new fvc<>($$1.a(fvv.bM));
      this.n = new fvd<>($$1.a(fvv.bK));
   }

   public void a(eyu $$0, gck $$1, int $$2, cfg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfg.b $$10 = $$3.gA();

      fsw<cfg> $$11 = (fsw<cfg>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akn $$12 = switch ($$10) {
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
