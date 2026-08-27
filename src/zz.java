public record zz(int c, elp d, float e) implements zq {
   public static final yg<vi, zz> a = zq.a(zz::a, zz::new);
   public static final zq.b<zz> b = zq.a("debug/path");

   private zz(vi $$0) {
      this($$0.readInt(), elp.b($$0), $$0.readFloat());
   }

   private void a(vi $$0) {
      $$0.p(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public zq.b<zz> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public elp c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
