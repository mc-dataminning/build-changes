public class gpv extends gmr<cox, gvh> {
   private static final alb a = alb.b("textures/entity/wither/wither_invulnerable.png");
   private static final alb b = alb.b("textures/entity/wither/wither.png");
   private final fyw h;

   public gpv(gms.a $$0) {
      super($$0);
      this.h = new fyw($$0.a(gaa.de));
   }

   public static gah a() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("head", gag.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gad.a);
      return gah.a($$0, 64, 64);
   }

   protected int a(cox $$0, je $$1) {
      return 15;
   }

   public void a(gvh $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fcy $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, gwb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(gvh $$0) {
      return $$0.a ? a : b;
   }

   public gvh c() {
      return new gvh();
   }

   public void a(cox $$0, gvh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.w();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
