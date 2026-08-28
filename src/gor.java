public class gor extends gmr<col, gun> {
   private static final alb a = alb.b("textures/entity/shulker/spark.png");
   private static final ghe b = ghe.j(a);
   private final fys h;

   public gor(gms.a $$0) {
      super($$0);
      this.h = new fys($$0.a(gaa.cj));
   }

   protected int a(col $$0, je $$1) {
      return 15;
   }

   public void a(gun $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azc.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azc.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azc.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fcy $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gwb.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fcy $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gwb.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(gun $$0) {
      return a;
   }

   public gun a() {
      return new gun();
   }

   public void a(col $$0, gun $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
