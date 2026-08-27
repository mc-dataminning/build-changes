public class fxz extends fxp<bvr, fev<bvr>> {
   private static final aew a = new aew("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aew b = new aew("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aew c = new aew("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aew d = new aew("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aew e = new aew("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aew f = new aew("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aew g = new aew("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aew h = new aew("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aew i = new aew("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aew j = new aew("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aew k = new aew("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aew l = new aew("textures/entity/fish/tropical_b_pattern_6.png");
   private final fhj<bvr> m;
   private final fhk<bvr> n;

   public fxz(fvc<bvr, fev<bvr>> $$0, fhy $$1) {
      super($$0);
      this.m = new fhj<>($$1.a(fib.bG));
      this.n = new fhk<>($$1.a(fib.bE));
   }

   public void a(elp $$0, foe $$1, int $$2, bvr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvr.b $$10 = $$3.go();

      ffd<bvr> $$11 = (ffd<bvr>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aew $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gn().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
