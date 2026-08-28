public class gui extends gqx<cjo, hah, gdz> {
   private static final akv a = akv.b("textures/entity/sniffer/sniffer.png");

   public gui(gsd.a $$0) {
      super($$0, new gdz($$0.a(gfb.cQ)), new gdz($$0.a(gfb.cR)), 1.1F);
   }

   public akv a(hah $$0) {
      return a;
   }

   public hah b() {
      return new hah();
   }

   public void a(cjo $$0, hah $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b.a($$0.cc);
      $$1.c.a($$0.ca);
      $$1.d.a($$0.cd);
      $$1.e.a($$0.bY);
      $$1.f.a($$0.bZ);
   }

   protected fau a(cjo $$0) {
      return super.a($$0).g(0.6F);
   }
}
