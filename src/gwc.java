public class gwc extends gwa<gzi, gcx> {
   private static final alp a = alp.b("textures/entity/sheep/sheep_fur.png");
   private final gbh<gzi> b;
   private final gbh<gzi> c;

   public gwc(gti<gzi, gcx> $$0, gef $$1) {
      super($$0);
      this.b = new gcw($$1.a(gei.cC));
      this.c = new gcw($$1.a(gei.cB));
   }

   public void a(fgl $$0, glg $$1, int $$2, gzi $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gbh<gzi> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fgp $$7 = $$1.getBuffer(glq.s(a));
               $$6.a($$0, $$7, $$2, gsm.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azu.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cwd.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azu.i($$3.p)) / 25.0F;
               int $$15 = cik.a(cwd.a($$12));
               int $$16 = cik.a(cwd.a($$13));
               $$17 = ayf.a($$14, $$15, $$16);
            } else {
               $$17 = cik.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
