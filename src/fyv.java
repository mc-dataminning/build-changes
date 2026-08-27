public class fyv extends fyl<bwu, ffp<bwu>> {
   private static final afw a = new afw("textures/entity/fish/tropical_a_pattern_1.png");
   private static final afw b = new afw("textures/entity/fish/tropical_a_pattern_2.png");
   private static final afw c = new afw("textures/entity/fish/tropical_a_pattern_3.png");
   private static final afw d = new afw("textures/entity/fish/tropical_a_pattern_4.png");
   private static final afw e = new afw("textures/entity/fish/tropical_a_pattern_5.png");
   private static final afw f = new afw("textures/entity/fish/tropical_a_pattern_6.png");
   private static final afw g = new afw("textures/entity/fish/tropical_b_pattern_1.png");
   private static final afw h = new afw("textures/entity/fish/tropical_b_pattern_2.png");
   private static final afw i = new afw("textures/entity/fish/tropical_b_pattern_3.png");
   private static final afw j = new afw("textures/entity/fish/tropical_b_pattern_4.png");
   private static final afw k = new afw("textures/entity/fish/tropical_b_pattern_5.png");
   private static final afw l = new afw("textures/entity/fish/tropical_b_pattern_6.png");
   private final fid<bwu> m;
   private final fie<bwu> n;

   public fyv(fvy<bwu, ffp<bwu>> $$0, fis $$1) {
      super($$0);
      this.m = new fid<>($$1.a(fiv.bG));
      this.n = new fie<>($$1.a(fiv.bE));
   }

   public void a(emh $$0, fpb $$1, int $$2, bwu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bwu.b $$10 = $$3.gp();

      ffx<bwu> $$11 = (ffx<bwu>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      afw $$12 = switch ($$10) {
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
