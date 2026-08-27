public class gda extends gcq<bys, fjh<bys>> {
   private static final ahd a = new ahd("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ahd b = new ahd("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ahd c = new ahd("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ahd d = new ahd("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ahd e = new ahd("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ahd f = new ahd("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ahd g = new ahd("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ahd h = new ahd("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ahd i = new ahd("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ahd j = new ahd("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ahd k = new ahd("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ahd l = new ahd("textures/entity/fish/tropical_b_pattern_6.png");
   private final flv<bys> m;
   private final flw<bys> n;

   public gda(gaa<bys, fjh<bys>> $$0, fml $$1) {
      super($$0);
      this.m = new flv<>($$1.a(fmo.bJ));
      this.n = new flw<>($$1.a(fmo.bH));
   }

   public void a(ept $$0, fsz $$1, int $$2, bys $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bys.b $$10 = $$3.gp();

      fjp<bys> $$11 = (fjp<bys>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ahd $$12 = switch ($$10) {
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
