public class gnr extends gmr<cjt, gsu> {
   private static final alb a = alb.b("textures/entity/lead_knot.png");
   private final fxr b;

   public gnr(gms.a $$0) {
      super($$0);
      this.b = new fxr($$0.a(gaa.bb));
   }

   @Override
   public void a(gsu $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fcy $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gwb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public alb a(gsu $$0) {
      return a;
   }

   @Override
   public gsu b() {
      return new gsu();
   }
}
