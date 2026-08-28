public class gmq extends gme<chr, gtb, fww> {
   private static final alc a = alc.b("textures/entity/camel/camel.png");

   public gmq(gnj.a $$0) {
      super($$0, new fww($$0.a(gak.H)), new fww($$0.a(gak.I)), 0.7F);
   }

   public alc a(gtb $$0) {
      return a;
   }

   public gtb a() {
      return new gtb();
   }

   public void a(chr $$0, gtb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.bX();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.ce);
      $$1.e.a($$0.cf);
      $$1.f.a($$0.cg);
      $$1.g.a($$0.ch);
      $$1.h.a($$0.ci);
   }
}
