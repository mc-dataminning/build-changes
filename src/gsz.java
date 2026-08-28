public class gsz extends gsx<gwf, gaa> {
   private static final ali a = ali.b("textures/entity/sheep/sheep_fur.png");
   private final fyk<gwf> b;
   private final fyk<gwf> c;

   public gsz(gqg<gwf, gaa> $$0, gbi $$1) {
      super($$0);
      this.b = new fzz($$1.a(gbl.cf));
      this.c = new fzz($$1.a(gbl.cg));
   }

   public void a(feb $$0, gih $$1, int $$2, gwf $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fyk<gwf> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fef $$7 = $$1.getBuffer(gir.r(a));
               $$6.a($$0, $$7, $$2, gpl.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azk.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cuy.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azk.i($$3.p)) / 25.0F;
               int $$15 = chn.a(cuy.a($$12));
               int $$16 = chn.a(cuy.a($$13));
               $$17 = axv.a($$14, $$15, $$16);
            } else {
               $$17 = chn.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
