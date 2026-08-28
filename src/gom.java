public class gom extends gni<com, gul> {
   private static final alc a = alc.b("textures/entity/llama/spit.png");
   private final fyd b;

   public gom(gnj.a $$0) {
      super($$0);
      this.b = new fyd($$0.a(gak.bg));
   }

   public void a(gul $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fdi $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gws.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gul $$0) {
      return a;
   }

   public gul a() {
      return new gul();
   }

   public void a(com $$0, gul $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
