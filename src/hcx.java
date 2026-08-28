public class hcx extends hcw<hgh, gjr> {
   private static final ali a = ali.b("textures/entity/sheep/sheep_wool.png");
   private final gia<hgh> b;
   private final gia<hgh> c;

   public hcx(haf<hgh, gjr> $$0, gla $$1) {
      super($$0);
      this.b = new gjq($$1.a(gld.cQ));
      this.c = new gjq($$1.a(gld.cP));
   }

   public void a(flo $$0, gsa $$1, int $$2, hgh $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gia<hgh> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               flr $$7 = $$1.getBuffer(gsl.s(a));
               $$6.a($$0, $$7, $$2, gzj.a($$3, 0.0F), -16777216);
            }
         } else {
            a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
         }
      }
   }
}
