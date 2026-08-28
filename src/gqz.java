public class gqz extends goz<cpn, gww> {
   private static final all a = all.b("textures/entity/shulker/spark.png");
   private static final gjh b = gjh.i(a);
   private final gas h;

   public gqz(gpa.a $$0) {
      super($$0);
      this.h = new gas($$0.a(gcb.ck));
   }

   protected int a(cpn $$0, jh $$1) {
      return 15;
   }

   public void a(gww $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azn.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azn.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azn.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      feo $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gyk.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      feo $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gyk.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gww a() {
      return new gww();
   }

   public void a(cpn $$0, gww $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
