public class gyu extends gyt<hcc, gfr> {
   private static final ald a = ald.b("textures/entity/sheep/sheep_fur.png");
   private final gea<hcc> b;
   private final gea<hcc> c;

   public gyu(gwc<hcc, gfr> $$0, ggz $$1) {
      super($$0);
      this.b = new gfq($$1.a(ghc.cM));
      this.c = new gfq($$1.a(ghc.cL));
   }

   public void a(fho $$0, gny $$1, int $$2, hcc $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gea<hcc> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               fhs $$7 = $$1.getBuffer(goi.s(a));
               $$6.a($$0, $$7, $$2, gvg.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.aq != null && "jeb_".equals($$3.aq.getString())) {
               int $$8 = 25;
               int $$9 = azk.d($$3.u);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwv.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azk.i($$3.u)) / 25.0F;
               int $$15 = cje.a(cwv.a($$12));
               int $$16 = cje.a(cwv.a($$13));
               $$17 = axu.a($$14, $$15, $$16);
            } else {
               $$17 = cje.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
