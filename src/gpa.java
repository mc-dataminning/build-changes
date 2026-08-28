public class gpa<T extends cgu> extends gln<T, gus, fzc> {
   private static final alb a = alb.b("textures/entity/squid/squid.png");

   public gpa(gms.a $$0, fzc $$1, fzc $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alb a(gus $$0) {
      return a;
   }

   public gus c() {
      return new gus();
   }

   public void a(T $$0, gus $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azc.h($$2, $$0.cg, $$0.cf);
      $$1.b = azc.h($$2, $$0.ca, $$0.bZ);
      $$1.c = azc.h($$2, $$0.cc, $$0.cb);
   }

   protected void a(gus $$0, fcu $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
