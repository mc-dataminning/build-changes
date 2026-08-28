public class gws extends gwq<haa, gdo> {
   private static final aku a = aku.b("textures/entity/sheep/sheep_fur.png");
   private final gby<haa> b;
   private final gby<haa> c;

   public gws(gty<haa, gdo> $$0, gew $$1) {
      super($$0);
      this.b = new gdn($$1.a(gez.cC));
      this.c = new gdn($$1.a(gez.cB));
   }

   public void a(ffs $$0, glv $$1, int $$2, haa $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gby<haa> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               ffw $$7 = $$1.getBuffer(gmf.s(a));
               $$6.a($$0, $$7, $$2, gtc.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = ayy.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cvk.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + ayy.i($$3.u)) / 25.0F;
               int $$15 = chs.a(cvk.a($$12));
               int $$16 = chs.a(cvk.a($$13));
               $$17 = axj.a($$14, $$15, $$16);
            } else {
               $$17 = chs.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
