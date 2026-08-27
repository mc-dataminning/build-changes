public class fxu extends fxk<bvm, feq<bvm>> {
   private static final aeu a = new aeu("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aeu b = new aeu("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aeu c = new aeu("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aeu d = new aeu("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aeu e = new aeu("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aeu f = new aeu("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aeu g = new aeu("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aeu h = new aeu("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aeu i = new aeu("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aeu j = new aeu("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aeu k = new aeu("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aeu l = new aeu("textures/entity/fish/tropical_b_pattern_6.png");
   private final fhe<bvm> m;
   private final fhf<bvm> n;

   public fxu(fux<bvm, feq<bvm>> $$0, fht $$1) {
      super($$0);
      this.m = new fhe<>($$1.a(fhw.bG));
      this.n = new fhf<>($$1.a(fhw.bE));
   }

   public void a(elk $$0, fnz $$1, int $$2, bvm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvm.b $$10 = $$3.gl();

      fey<bvm> $$11 = (fey<bvm>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aeu $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gk().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
