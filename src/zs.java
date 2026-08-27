public record zs(ib c, float d, float e, float f, float g, float h) implements zc {
   public static final xs<uu, zs> a = zc.a(zs::a, zs::new);
   public static final zc.b<zs> b = zc.a("debug/worldgen_attempt");

   private zs(uu $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(uu $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public zc.b<zs> a() {
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
