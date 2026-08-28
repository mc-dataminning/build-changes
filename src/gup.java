public class gup extends gsa<cqb, hal> {
   public static final aku a = aku.b("textures/entity/trident.png");
   private final gee b;

   public gup(gsb.a $$0) {
      super($$0);
      this.b = new gee($$0.a(gez.dl));
   }

   public void a(hal $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      ffw $$4 = gsz.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hec.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hal a() {
      return new hal();
   }

   public void a(cqb $$0, hal $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
