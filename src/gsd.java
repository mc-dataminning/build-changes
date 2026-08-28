public class gsd extends goz<cpy, gxq> {
   private static final all a = all.b("textures/entity/wither/wither_invulnerable.png");
   private static final all b = all.b("textures/entity/wither/wither.png");
   private final gaw h;

   public gsd(gpa.a $$0) {
      super($$0);
      this.h = new gaw($$0.a(gcb.df));
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("head", gch.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gce.a);
      return gci.a($$0, 64, 64);
   }

   protected int a(cpy $$0, jh $$1) {
      return 15;
   }

   public void a(gxq $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      feo $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, gyk.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private all a(gxq $$0) {
      return $$0.a ? a : b;
   }

   public gxq c() {
      return new gxq();
   }

   public void a(cpy $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.w();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
