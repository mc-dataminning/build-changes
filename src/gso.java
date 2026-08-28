public class gso extends gpj<cqb, gyb> {
   private static final alj a = alj.b("textures/entity/wither/wither_invulnerable.png");
   private static final alj b = alj.b("textures/entity/wither/wither.png");
   private final gbf h;

   public gso(gpk.a $$0) {
      super($$0);
      this.h = new gbf($$0.a(gck.dx));
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("head", gcq.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gcn.a);
      return gcr.a($$0, 64, 64);
   }

   protected int a(cqb $$0, jh $$1) {
      return 15;
   }

   public void a(gyb $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fev $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, gyv.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alj a(gyb $$0) {
      return $$0.a ? a : b;
   }

   public gyb b() {
      return new gyb();
   }

   public void a(cqb $$0, gyb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
