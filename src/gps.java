public class gps extends gny<cll, gvf, fzo> {
   private static final alb a = alb.b("textures/entity/witch.png");

   public gps(gms.a $$0) {
      super($$0, new fzo($$0.a(gaa.cX)), 0.5F);
      this.a(new grr(this, $$0.b()));
   }

   public alb a(gvf $$0) {
      return a;
   }

   public gvf c() {
      return new gvf();
   }

   public void a(cll $$0, gvf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ap();
      $$1.b = !$$0.eW().f();
   }
}
