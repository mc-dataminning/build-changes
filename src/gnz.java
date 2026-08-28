public class gnz extends gnj<cgi, fwr<cgi>> {
   private static final alf a = new alf("textures/entity/wolf/wolf_collar.png");

   public gnz(gkt<cgi, fwr<cgi>> $$0) {
      super($$0);
   }

   public void a(ezy $$0, gdo $$1, int $$2, cgi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s() && !$$3.ch()) {
         float[] $$10 = $$3.gB().d();
         fac $$11 = $$1.getBuffer(gdw.e(a));
         this.c().a($$0, $$11, $$2, goq.d, $$10[0], $$10[1], $$10[2], 1.0F);
      }
   }
}
