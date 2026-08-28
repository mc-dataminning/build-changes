public class gsf extends grw<gvq, fxk<gvq>> {
   private static final alc a = alc.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alc b = alc.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alc c = alc.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alc d = alc.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alc e = alc.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alc f = alc.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alc g = alc.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alc h = alc.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alc i = alc.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alc j = alc.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alc k = alc.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alc l = alc.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final fzq m;
   private final fzr n;

   public gsf(gpf<gvq, fxk<gvq>> $$0, gah $$1) {
      super($$0);
      this.m = new fzq($$1.a(gak.cP));
      this.n = new fzr($$1.a(gak.cN));
   }

   public void a(fde $$0, ghg $$1, int $$2, gvq $$3, float $$4, float $$5) {
      cha.b $$6 = $$3.a;

      fxk<gvq> $$7 = (fxk<gvq>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alc $$8 = switch ($$6) {
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
