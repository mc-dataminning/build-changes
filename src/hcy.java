public class hcy extends hcw<hgh, gjr> {
   private static final ali a = ali.b("textures/entity/sheep/sheep_wool_undercoat.png");
   private final gia<hgh> b;
   private final gia<hgh> c;

   public hcy(haf<hgh, gjr> $$0, gla $$1) {
      super($$0);
      this.b = new gjq($$1.a(gld.cR));
      this.c = new gjq($$1.a(gld.cS));
   }

   public void a(flo $$0, gsa $$1, int $$2, hgh $$3, float $$4, float $$5) {
      if (!$$3.z && ($$3.b() || $$3.d != cyw.a)) {
         gia<hgh> $$6 = $$3.aj ? this.c : this.b;
         a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
      }
   }
}
