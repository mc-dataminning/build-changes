public class gno extends gni<cgc, fvz<cgc>> {
   private final geh a;
   private final gju b;

   public gno(gks<cgc, fvz<cgc>> $$0, geh $$1, gju $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ezx $$0, gdn $$1, int $$2, cgc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = ffe.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuo $$12 = new cuo(dfa.ee);
            if ($$10) {
               dsb $$13 = dfa.ee.o();
               gqz $$14 = this.a.a($$13);
               int $$15 = gjx.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gdv.r(gox.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cul.f, false, $$0, $$1, $$3.dP(), $$2, gjx.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
