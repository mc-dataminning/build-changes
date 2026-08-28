public class gpf extends gov<cge, fvc<cge>> {
   private static final akr a = akr.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akr b = akr.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akr c = akr.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akr d = akr.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akr e = akr.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akr f = akr.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akr g = akr.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akr h = akr.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akr i = akr.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akr j = akr.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akr k = akr.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akr l = akr.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final fxq<cge> m;
   private final fxr<cge> n;

   public gpf(gmf<cge, fvc<cge>> $$0, fyg $$1) {
      super($$0);
      this.m = new fxq<>($$1.a(fyj.bN));
      this.n = new fxr<>($$1.a(fyj.bL));
   }

   public void a(fbi $$0, gez $$1, int $$2, cge $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cge.b $$10 = $$3.gv();

      fvk<cge> $$11 = (fvk<cge>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akr $$12 = switch ($$10) {
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
      int $$13 = $$3.gu().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13);
   }
}
