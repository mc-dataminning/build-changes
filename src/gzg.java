public class gzg<T extends bwi & csb> extends gws<T, hfb> {
   private final hga a;
   private final float g;
   private final boolean h;

   public gzg(gwt.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.g = $$1;
      this.h = $$2;
   }

   public gzg(gwt.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, iv $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(hfb $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.b(this.g, this.g, this.g);
      $$1.a(this.d.b());
      $$0.a.a($$1, $$2, $$3, hja.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfb a() {
      return new hfb();
   }

   public void a(T $$0, hfb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.f(), czi.h, $$0);
   }
}
