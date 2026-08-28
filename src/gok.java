public class gok extends goa<cfs, fui<cfs>> {
   private static final akk a = new akk("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akk b = new akk("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akk c = new akk("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akk d = new akk("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akk e = new akk("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akk f = new akk("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akk g = new akk("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akk h = new akk("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akk i = new akk("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akk j = new akk("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akk k = new akk("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akk l = new akk("textures/entity/fish/tropical_b_pattern_6.png");
   private final fww<cfs> m;
   private final fwx<cfs> n;

   public gok(glk<cfs, fui<cfs>> $$0, fxm $$1) {
      super($$0);
      this.m = new fww<>($$1.a(fxp.bM));
      this.n = new fwx<>($$1.a(fxp.bK));
   }

   public void a(fao $$0, gef $$1, int $$2, cfs $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfs.b $$10 = $$3.gy();

      fuq<cfs> $$11 = (fuq<cfs>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akk $$12 = switch ($$10) {
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
