public class gry extends grw<gvd, fza> {
   private static final alc a = alc.b("textures/entity/sheep/sheep_fur.png");
   private final fxk<gvd> b;
   private final fxk<gvd> c;

   public gry(gpf<gvd, fza> $$0, gah $$1) {
      super($$0);
      this.b = new fyz($$1.a(gak.cf));
      this.c = new fyz($$1.a(gak.cg));
   }

   public void a(fde $$0, ghg $$1, int $$2, gvd $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fxk<gvd> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fdi $$7 = $$1.getBuffer(ghq.r(a));
               $$6.a($$0, $$7, $$2, gok.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azd.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cuj.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azd.h($$3.p)) / 25.0F;
               int $$15 = cgw.a(cuj.a($$12));
               int $$16 = cgw.a(cuj.a($$13));
               $$17 = axo.a($$14, $$15, $$16);
            } else {
               $$17 = cgw.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
