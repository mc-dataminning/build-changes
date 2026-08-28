public class gwa extends gvy<gzg, gcv> {
   private static final alz a = alz.b("textures/entity/sheep/sheep_fur.png");
   private final gbf<gzg> b;
   private final gbf<gzg> c;

   public gwa(gtg<gzg, gcv> $$0, ged $$1) {
      super($$0);
      this.b = new gcu($$1.a(geg.cz));
      this.c = new gcu($$1.a(geg.cy));
   }

   public void a(fgl $$0, gle $$1, int $$2, gzg $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gbf<gzg> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fgp $$7 = $$1.getBuffer(glo.r(a));
               $$6.a($$0, $$7, $$2, gsk.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = bae.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwh.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + bae.i($$3.p)) / 25.0F;
               int $$15 = cio.a(cwh.a($$12));
               int $$16 = cio.a(cwh.a($$13));
               $$17 = ayp.a($$14, $$15, $$16);
            } else {
               $$17 = cio.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
