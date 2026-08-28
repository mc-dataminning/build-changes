public class glz extends gln<chm, gsk, fwm> {
   private static final alb a = alb.b("textures/entity/camel/camel.png");

   public glz(gms.a $$0) {
      super($$0, new fwm($$0.a(gaa.H)), new fwm($$0.a(gaa.I)), 0.7F);
   }

   public alb a(gsk $$0) {
      return a;
   }

   public gsk a() {
      return new gsk();
   }

   public void a(chm $$0, gsk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.bX();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.cf);
      $$1.e.a($$0.cg);
      $$1.f.a($$0.ch);
      $$1.g.a($$0.ci);
      $$1.h.a($$0.cj);
   }
}
