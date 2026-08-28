public class gso extends gsm<gvu, fzp> {
   private static final alh a = alh.b("textures/entity/sheep/sheep_fur.png");
   private final fxz<gvu> b;
   private final fxz<gvu> c;

   public gso(gpv<gvu, fzp> $$0, gax $$1) {
      super($$0);
      this.b = new fzo($$1.a(gba.cf));
      this.c = new fzo($$1.a(gba.cg));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gvu $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fxz<gvu> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fdx $$7 = $$1.getBuffer(gig.r(a));
               $$6.a($$0, $$7, $$2, gpa.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azj.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cuu.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azj.i($$3.p)) / 25.0F;
               int $$15 = chi.a(cuu.a($$12));
               int $$16 = chi.a(cuu.a($$13));
               $$17 = axu.a($$14, $$15, $$16);
            } else {
               $$17 = chi.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
