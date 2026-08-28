public class gnn extends gnh<cgb, fvy<cgb>> {
   private final geg a;
   private final gjt b;

   public gnn(gkr<cgb, fvy<cgb>> $$0, geg $$1, gjt $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ezw $$0, gdm $$1, int $$2, cgb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = ffd.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cun $$12 = new cun(dez.ee);
            if ($$10) {
               dsa $$13 = dez.ee.o();
               gqy $$14 = this.a.a($$13);
               int $$15 = gjw.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gdu.r(gow.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cuk.f, false, $$0, $$1, $$3.dP(), $$2, gjw.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
