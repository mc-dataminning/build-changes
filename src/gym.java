public class gym<T extends bwd & crp> extends gvy<T, heh> {
   private final hfg a;
   private final float g;
   private final boolean h;

   public gym(gvz.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.g = $$1;
      this.h = $$2;
   }

   public gym(gvz.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, iu $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(heh $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.b(this.g, this.g, this.g);
      $$1.a(this.d.b());
      $$0.a.a($$1, $$2, $$3, hif.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public heh a() {
      return new heh();
   }

   public void a(T $$0, heh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.f(), cyw.h, $$0);
   }
}
