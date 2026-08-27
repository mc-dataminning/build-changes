public record zq(ib c, float d, float e, float f, float g, float h) implements za {
   public static final xq<us, zq> a = za.a(zq::a, zq::new);
   public static final za.b<zq> b = za.a("debug/worldgen_attempt");

   private zq(us $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(us $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public za.b<zq> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }
}
