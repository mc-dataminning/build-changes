public class gpw extends gni<cpb, gvn> {
   public static final alc a = alc.b("textures/entity/trident.png");
   private final fzp b;

   public gpw(gnj.a $$0) {
      super($$0);
      this.b = new fzp($$0.a(gak.cL));
   }

   public void a(gvn $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fdi $$4 = goh.a($$2, this.b.a(this.a($$0)), false, $$0.c);
      this.b.a($$1, $$4, $$3, gws.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gvn $$0) {
      return a;
   }

   public gvn a() {
      return new gvn();
   }

   public void a(cpb $$0, gvn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.E();
   }
}
