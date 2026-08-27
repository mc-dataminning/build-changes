public record zl(int c, ejc d, float e) implements zc {
   public static final xs<uu, zl> a = zc.a(zl::a, zl::new);
   public static final zc.b<zl> b = zc.a("debug/path");

   private zl(uu $$0) {
      this($$0.readInt(), ejc.b($$0), $$0.readFloat());
   }

   private void a(uu $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public zc.b<zl> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ejc c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
