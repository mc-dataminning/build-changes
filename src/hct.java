public class hct extends hcj<hgl, ghn<hgl>> {
   private static final alr a = alr.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alr b = alr.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alr c = alr.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alr d = alr.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alr e = alr.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alr f = alr.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alr g = alr.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alr h = alr.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alr i = alr.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alr j = alr.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alr k = alr.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alr l = alr.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gjv m;
   private final gjw n;

   public hct(gzs<hgl, ghn<hgl>> $$0, gkn $$1) {
      super($$0);
      this.m = new gjv($$1.a(gkq.dH));
      this.n = new gjw($$1.a(gkq.dF));
   }

   public void a(fld $$0, grn $$1, int $$2, hgl $$3, float $$4, float $$5) {
      clb.b $$6 = $$3.a;

      ghn<hgl> $$7 = (ghn<hgl>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alr $$8 = switch ($$6) {
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
