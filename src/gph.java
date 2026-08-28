public class gph extends gme<cgw, gvd, fza> {
   private static final alc a = alc.b("textures/entity/sheep/sheep.png");

   public gph(gnj.a $$0) {
      super($$0, new fza($$0.a(gak.cd)), new fza($$0.a(gak.ce)), 0.7F);
      this.a(new gry(this, $$0.f()));
   }

   public alc a(gvd $$0) {
      return a;
   }

   public gvd c() {
      return new gvd();
   }

   public void a(cgw $$0, gvd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.y();
      $$1.d = $$0.t();
      $$1.e = $$0.ap();
   }
}
