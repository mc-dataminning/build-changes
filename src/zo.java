public record zo(hz c, float d, float e, float f, float g, float h) implements yy {
   public static final xo<uq, zo> a = yy.a(zo::a, zo::new);
   public static final yy.b<zo> b = yy.a("debug/worldgen_attempt");

   private zo(uq $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(uq $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public yy.b<zo> a() {
      return b;
   }

   public hz b() {
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
