public class gyx extends gvs<clv, hex, gig> {
   private static final alg a = alg.b("textures/entity/sheep/sheep.png");

   public gyx(gwy.a $$0) {
      super($$0, new gig($$0.a(gjs.cN)), new gig($$0.a(gjs.cO)), 0.7F);
      this.a(new hbo(this, $$0.f()));
      this.a(new hbn(this, $$0.f()));
   }

   public alg a(hex $$0) {
      return a;
   }

   public hex b() {
      return new hex();
   }

   public void a(clv $$0, hex $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.x();
      $$1.d = $$0.t();
      $$1.e = $$0.ao();
   }
}
