public class hck extends hcj<hfx, gje> {
   private static final alr a = alr.b("textures/entity/sheep/sheep_wool.png");
   private final ghn<hfx> b;
   private final ghn<hfx> c;

   public hck(gzs<hfx, gje> $$0, gkn $$1) {
      super($$0);
      this.b = new gjd($$1.a(gkq.cQ));
      this.c = new gjd($$1.a(gkq.cP));
   }

   public void a(fld $$0, grn $$1, int $$2, hfx $$3, float $$4, float $$5) {
      if (!$$3.c) {
         ghn<hfx> $$6 = $$3.am ? this.c : this.b;
         if ($$3.A) {
            if ($$3.ar) {
               $$6.a($$3);
               flg $$7 = $$1.getBuffer(gry.s(a));
               $$6.a($$0, $$7, $$2, gyw.a($$3, 0.0F), -16777216);
            }
         } else {
            a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
         }
      }
   }
}
