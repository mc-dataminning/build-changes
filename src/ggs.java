public class ggs extends ggm<cgu> {
   private final gby a;

   public ggs(ggn.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cgu $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      dpy $$6 = $$0.u();
      if ($$6.l() == djb.c) {
         czu $$7 = $$0.dN();
         if ($$6 != $$7.a_($$0.dn()) && $$6.l() != djb.a) {
            $$3.a();
            im $$8 = im.a($$0.ds(), $$0.cI().e, $$0.dy());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gaz.b($$6)), false, ayd.a(), $$6.a($$0.p()), gmf.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akf a(cgu $$0) {
      return gmn.e;
   }
}
