public class haj extends gxe<cmi, hgj, gjt> {
   private static final alk a = alk.b("textures/entity/sheep/sheep.png");

   public haj(gyk.a $$0) {
      super($$0, new gjt($$0.a(glf.cN)), new gjt($$0.a(glf.cO)), 0.7F);
      this.a(new hda(this, $$0.f()));
      this.a(new hcz(this, $$0.f()));
   }

   public alk a(hgj $$0) {
      return a;
   }

   public hgj b() {
      return new hgj();
   }

   public void a(cmi $$0, hgj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.x();
      $$1.d = $$0.t();
      $$1.e = $$0.ao();
   }
}
