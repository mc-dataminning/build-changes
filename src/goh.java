public class goh extends gnv<cim, gut, fym> {
   private static final all a = all.b("textures/entity/camel/camel.png");

   public goh(gpa.a $$0) {
      super($$0, new fym($$0.a(gcb.H)), new fym($$0.a(gcb.I)), 0.7F);
   }

   public all a(gut $$0) {
      return a;
   }

   public gut a() {
      return new gut();
   }

   public void a(cim $$0, gut $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.cc();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.ce);
      $$1.e.a($$0.cf);
      $$1.f.a($$0.cg);
      $$1.g.a($$0.ch);
      $$1.h.a($$0.ci);
   }
}
