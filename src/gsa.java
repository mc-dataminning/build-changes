public class gsa extends gsm<gur, fyk> {
   private final fyk a;
   private final fyk b;
   private final grx c;

   public gsa(gpv<gur, fyk> $$0, gax $$1, grx $$2) {
      super($$0);
      this.c = $$2;
      this.a = new fyk($$1.a(gba.aR));
      this.b = new fyk($$1.a(gba.aS));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gur $$3, float $$4, float $$5) {
      cvx $$6 = $$3.i;
      ddh $$7 = $$6.a(kt.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         fyk $$8 = $$3.ae ? this.b : this.a;
         alh $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddf.d.e, $$9, $$8, $$6, gig::a, $$0, $$1, $$2);
      }
   }
}
