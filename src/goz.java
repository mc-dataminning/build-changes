public class goz extends gop<cgc, fuw<cgc>> {
   private static final akq a = akq.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akq b = akq.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akq c = akq.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akq d = akq.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akq e = akq.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akq f = akq.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akq g = akq.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akq h = akq.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akq i = akq.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akq j = akq.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akq k = akq.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akq l = akq.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final fxk<cgc> m;
   private final fxl<cgc> n;

   public goz(glz<cgc, fuw<cgc>> $$0, fya $$1) {
      super($$0);
      this.m = new fxk<>($$1.a(fyd.bN));
      this.n = new fxl<>($$1.a(fyd.bL));
   }

   public void a(fbc $$0, get $$1, int $$2, cgc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cgc.b $$10 = $$3.gx();

      fve<cgc> $$11 = (fve<cgc>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akq $$12 = switch ($$10) {
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
      int $$13 = $$3.gw().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13);
   }
}
