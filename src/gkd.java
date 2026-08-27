public class gkd extends gjt<cdd, fqe<cdd>> {
   private static final ajt a = new ajt("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ajt b = new ajt("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ajt c = new ajt("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ajt d = new ajt("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ajt e = new ajt("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ajt f = new ajt("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ajt g = new ajt("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ajt h = new ajt("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ajt i = new ajt("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ajt j = new ajt("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ajt k = new ajt("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ajt l = new ajt("textures/entity/fish/tropical_b_pattern_6.png");
   private final fss<cdd> m;
   private final fst<cdd> n;

   public gkd(ghd<cdd, fqe<cdd>> $$0, fti $$1) {
      super($$0);
      this.m = new fss<>($$1.a(ftl.bM));
      this.n = new fst<>($$1.a(ftl.bK));
   }

   public void a(ewi $$0, fzz $$1, int $$2, cdd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cdd.b $$10 = $$3.gy();

      fqm<cdd> $$11 = (fqm<cdd>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ajt $$12 = switch ($$10) {
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
