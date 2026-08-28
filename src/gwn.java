public class gwn extends gwe<gzz, gbl<gzz>> {
   private static final alz a = alz.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alz b = alz.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alz c = alz.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alz d = alz.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alz e = alz.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alz f = alz.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alz g = alz.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alz h = alz.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alz i = alz.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alz j = alz.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alz k = alz.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alz l = alz.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gds m;
   private final gdt n;

   public gwn(gtm<gzz, gbl<gzz>> $$0, gej $$1) {
      super($$0);
      this.m = new gds($$1.a(gem.dk));
      this.n = new gdt($$1.a(gem.di));
   }

   public void a(fgr $$0, glk $$1, int $$2, gzz $$3, float $$4, float $$5) {
      ciw.b $$6 = $$3.a;

      gbl<gzz> $$7 = (gbl<gzz>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alz $$8 = switch ($$6) {
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
