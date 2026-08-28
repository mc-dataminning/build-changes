public class gsr extends grn<cqo, gyt> {
   private static final alz a = alz.b("textures/entity/llama/spit.png");
   private final gcd b;

   public gsr(gro.a $$0) {
      super($$0);
      this.b = new gcd($$0.a(gel.bt));
   }

   public void a(gyt $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fgu $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hba.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyt a() {
      return new gyt();
   }

   public void a(cqo $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
