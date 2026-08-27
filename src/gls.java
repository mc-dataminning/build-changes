public class gls extends gli<cep, frt<cep>> {
   private static final akh a = new akh("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akh b = new akh("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akh c = new akh("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akh d = new akh("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akh e = new akh("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akh f = new akh("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akh g = new akh("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akh h = new akh("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akh i = new akh("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akh j = new akh("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akh k = new akh("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akh l = new akh("textures/entity/fish/tropical_b_pattern_6.png");
   private final fuh<cep> m;
   private final fui<cep> n;

   public gls(gis<cep, frt<cep>> $$0, fux $$1) {
      super($$0);
      this.m = new fuh<>($$1.a(fva.bM));
      this.n = new fui<>($$1.a(fva.bK));
   }

   public void a(exx $$0, gbo $$1, int $$2, cep $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cep.b $$10 = $$3.gA();

      fsb<cep> $$11 = (fsb<cep>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akh $$12 = switch ($$10) {
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
