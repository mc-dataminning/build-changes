public class gwg extends gwe<gzm, gdb> {
   private static final alz a = alz.b("textures/entity/sheep/sheep_fur.png");
   private final gbl<gzm> b;
   private final gbl<gzm> c;

   public gwg(gtm<gzm, gdb> $$0, gej $$1) {
      super($$0);
      this.b = new gda($$1.a(gem.cz));
      this.c = new gda($$1.a(gem.cy));
   }

   public void a(fgr $$0, glk $$1, int $$2, gzm $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gbl<gzm> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fgv $$7 = $$1.getBuffer(glu.s(a));
               $$6.a($$0, $$7, $$2, gsq.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = bae.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwl.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + bae.i($$3.p)) / 25.0F;
               int $$15 = cis.a(cwl.a($$12));
               int $$16 = cis.a(cwl.a($$13));
               $$17 = ayp.a($$14, $$15, $$16);
            } else {
               $$17 = cis.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
