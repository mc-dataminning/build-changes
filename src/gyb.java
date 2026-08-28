public class gyb extends gxs<hbq, gda<hbq>> {
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
   private final gfh m;
   private final gfi n;

   public gyb(gva<hbq, gda<hbq>> $$0, gfy $$1) {
      super($$0);
      this.m = new gfh($$1.a(ggb.dr));
      this.n = new gfi($$1.a(ggb.dp));
   }

   public void a(fgr $$0, gmx $$1, int $$2, hbq $$3, float $$4, float $$5) {
      cis.b $$6 = $$3.a;

      gda<hbq> $$7 = (gda<hbq>)(switch ($$6.a()) {
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
