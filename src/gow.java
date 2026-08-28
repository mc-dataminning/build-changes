public class gow extends gln<cim, gur, fyz> {
   private static final alb a = alb.b("textures/entity/sniffer/sniffer.png");

   public gow(gms.a $$0) {
      super($$0, new fyz($$0.a(gaa.ct)), new fyz($$0.a(gaa.cu)), 1.1F);
   }

   public alb a(gur $$0) {
      return a;
   }

   public gur c() {
      return new gur();
   }

   public void a(cim $$0, gur $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b.a($$0.cd);
      $$1.c.a($$0.cb);
      $$1.d.a($$0.ce);
      $$1.e.a($$0.bZ);
      $$1.f.a($$0.ca);
   }

   protected exz a(cim $$0) {
      return super.a($$0).g(0.6F);
   }
}
