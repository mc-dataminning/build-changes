public class guh extends gty<gxt, fzj<gxt>> {
   private static final alj a = alj.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alj b = alj.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alj c = alj.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alj d = alj.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alj e = alj.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alj f = alj.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alj g = alj.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alj h = alj.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alj i = alj.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alj j = alj.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alj k = alj.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alj l = alj.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gbq m;
   private final gbr n;

   public guh(grh<gxt, fzj<gxt>> $$0, gch $$1) {
      super($$0);
      this.m = new gbq($$1.a(gck.dh));
      this.n = new gbr($$1.a(gck.df));
   }

   public void a(fer $$0, gjg $$1, int $$2, gxt $$3, float $$4, float $$5) {
      chy.b $$6 = $$3.a;

      fzj<gxt> $$7 = (fzj<gxt>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alj $$8 = switch ($$6) {
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
