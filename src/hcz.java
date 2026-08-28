public class hcz extends hcy<hgj, gjt> {
   private static final alk a = alk.b("textures/entity/sheep/sheep_wool.png");
   private final gic<hgj> b;
   private final gic<hgj> c;

   public hcz(hah<hgj, gjt> $$0, glc $$1) {
      super($$0);
      this.b = new gjs($$1.a(glf.cQ));
      this.c = new gjs($$1.a(glf.cP));
   }

   public void a(flq $$0, gsc $$1, int $$2, hgj $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gic<hgj> $$6 = $$3.aj ? this.c : this.b;
         if ($$3.z) {
            if ($$3.ao) {
               $$6.a($$3);
               flt $$7 = $$1.getBuffer(gsn.s(a));
               $$6.a($$0, $$7, $$2, gzl.a($$3, 0.0F), -16777216);
            }
         } else {
            a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
         }
      }
   }
}
