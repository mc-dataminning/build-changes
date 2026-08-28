public class gsv extends gsm<gwh, fxz<gwh>> {
   private static final alh a = alh.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alh b = alh.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alh c = alh.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alh d = alh.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alh e = alh.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alh f = alh.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alh g = alh.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alh h = alh.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alh i = alh.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alh j = alh.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alh k = alh.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alh l = alh.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gag m;
   private final gah n;

   public gsv(gpv<gwh, fxz<gwh>> $$0, gax $$1) {
      super($$0);
      this.m = new gag($$1.a(gba.cP));
      this.n = new gah($$1.a(gba.cN));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gwh $$3, float $$4, float $$5) {
      chm.b $$6 = $$3.a;

      fxz<gwh> $$7 = (fxz<gwh>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alh $$8 = switch ($$6) {
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
      a($$7, $$8, $$0, $$1, $$2, $$3, $$3.c);
   }
}
