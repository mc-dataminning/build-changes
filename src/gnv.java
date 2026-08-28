public class gnv extends gmr<coh, gtu> {
   private static final alb a = alb.b("textures/entity/llama/spit.png");
   private final fxt b;

   public gnv(gms.a $$0) {
      super($$0);
      this.b = new fxt($$0.a(gaa.bg));
   }

   public void a(gtu $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fcy $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gwb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(gtu $$0) {
      return a;
   }

   public gtu a() {
      return new gtu();
   }

   public void a(coh $$0, gtu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
