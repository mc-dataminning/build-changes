public class ggt extends ggj<cbm, fmw<cbm>> {
   private static final ajc a = new ajc("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ajc b = new ajc("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ajc c = new ajc("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ajc d = new ajc("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ajc e = new ajc("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ajc f = new ajc("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ajc g = new ajc("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ajc h = new ajc("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ajc i = new ajc("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ajc j = new ajc("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ajc k = new ajc("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ajc l = new ajc("textures/entity/fish/tropical_b_pattern_6.png");
   private final fpl<cbm> m;
   private final fpm<cbm> n;

   public ggt(gdt<cbm, fmw<cbm>> $$0, fqb $$1) {
      super($$0);
      this.m = new fpl<>($$1.a(fqe.bI));
      this.n = new fpm<>($$1.a(fqe.bG));
   }

   public void a(etd $$0, fwq $$1, int $$2, cbm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cbm.b $$10 = $$3.gw();

      fne<cbm> $$11 = (fne<cbm>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ajc $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gv().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
