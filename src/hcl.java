public class hcl extends hcj<hfx, gje> {
   private static final alr a = alr.b("textures/entity/sheep/sheep_wool_undercoat.png");
   private final ghn<hfx> b;
   private final ghn<hfx> c;

   public hcl(gzs<hfx, gje> $$0, gkn $$1) {
      super($$0);
      this.b = new gjd($$1.a(gkq.cR));
      this.c = new gjd($$1.a(gkq.cS));
   }

   public void a(fld $$0, grn $$1, int $$2, hfx $$3, float $$4, float $$5) {
      if (!$$3.A && ($$3.b() || $$3.d != czi.a)) {
         ghn<hfx> $$6 = $$3.am ? this.c : this.b;
         a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
      }
   }
}
