public class gtp extends gtn<gwv, gaq> {
   private static final all a = all.b("textures/entity/sheep/sheep_fur.png");
   private final fza<gwv> b;
   private final fza<gwv> c;

   public gtp(gqw<gwv, gaq> $$0, gby $$1) {
      super($$0);
      this.b = new gap($$1.a(gcb.cf));
      this.c = new gap($$1.a(gcb.cg));
   }

   public void a(fek $$0, gix $$1, int $$2, gwv $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fza<gwv> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               feo $$7 = $$1.getBuffer(gjh.r(a));
               $$6.a($$0, $$7, $$2, gqb.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azn.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cvc.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azn.i($$3.p)) / 25.0F;
               int $$15 = chr.a(cvc.a($$12));
               int $$16 = chr.a(cvc.a($$13));
               $$17 = axy.a($$14, $$15, $$16);
            } else {
               $$17 = chr.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
