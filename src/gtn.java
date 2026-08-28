public class gtn extends gqi<cis, gzl, gda> {
   private static final alz a = alz.b("textures/entity/sheep/sheep.png");

   public gtn(gro.a $$0) {
      super($$0, new gda($$0.a(gel.cw)), new gda($$0.a(gel.cx)), 0.7F);
      this.a(new gwf(this, $$0.f()));
   }

   public alz a(gzl $$0) {
      return a;
   }

   public gzl b() {
      return new gzl();
   }

   public void a(cis $$0, gzl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.x();
      $$1.d = $$0.t();
      $$1.e = $$0.ar();
   }
}
