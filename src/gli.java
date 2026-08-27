public class gli extends gky<cdt, frj<cdt>> {
   private static final akf a = new akf("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akf b = new akf("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akf c = new akf("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akf d = new akf("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akf e = new akf("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akf f = new akf("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akf g = new akf("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akf h = new akf("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akf i = new akf("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akf j = new akf("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akf k = new akf("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akf l = new akf("textures/entity/fish/tropical_b_pattern_6.png");
   private final ftx<cdt> m;
   private final fty<cdt> n;

   public gli(gii<cdt, frj<cdt>> $$0, fun $$1) {
      super($$0);
      this.m = new ftx<>($$1.a(fuq.bM));
      this.n = new fty<>($$1.a(fuq.bK));
   }

   public void a(exn $$0, gbe $$1, int $$2, cdt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cdt.b $$10 = $$3.gA();

      frr<cdt> $$11 = (frr<cdt>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akf $$12 = switch ($$10) {
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
