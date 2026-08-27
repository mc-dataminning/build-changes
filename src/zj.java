public record zj(int c, eig d, float e) implements za {
   public static final xq<us, zj> a = za.a(zj::a, zj::new);
   public static final za.b<zj> b = za.a("debug/path");

   private zj(us $$0) {
      this($$0.readInt(), eig.b($$0), $$0.readFloat());
   }

   private void a(us $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public za.b<zj> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eig c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
