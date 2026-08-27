public record zx(int c, elg d, float e) implements zo {
   public static final ye<vg, zx> a = zo.a(zx::a, zx::new);
   public static final zo.b<zx> b = zo.a("debug/path");

   private zx(vg $$0) {
      this($$0.readInt(), elg.b($$0), $$0.readFloat());
   }

   private void a(vg $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public zo.b<zx> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public elg c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
