public class gwz extends gwq<hao, gby<hao>> {
   private static final aku a = aku.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aku b = aku.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aku c = aku.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aku d = aku.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aku e = aku.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aku f = aku.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aku g = aku.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aku h = aku.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aku i = aku.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aku j = aku.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aku k = aku.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aku l = aku.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gef m;
   private final geg n;

   public gwz(gty<hao, gby<hao>> $$0, gew $$1) {
      super($$0);
      this.m = new gef($$1.a(gez.dp));
      this.n = new geg($$1.a(gez.dn));
   }

   public void a(ffs $$0, glv $$1, int $$2, hao $$3, float $$4, float $$5) {
      chw.b $$6 = $$3.a;

      gby<hao> $$7 = (gby<hao>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aku $$8 = switch ($$6) {
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
