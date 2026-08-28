public class gpf extends gmr<cow, guw> {
   public static final alb a = alb.b("textures/entity/trident.png");
   private final fzf b;

   public gpf(gms.a $$0) {
      super($$0);
      this.b = new fzf($$0.a(gaa.cK));
   }

   public void a(guw $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fcy $$4 = gnq.b($$2, this.b.a(this.a($$0)), false, $$0.c);
      this.b.a($$1, $$4, $$3, gwb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(guw $$0) {
      return a;
   }

   public guw a() {
      return new guw();
   }

   public void a(cow $$0, guw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
