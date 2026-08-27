public record xk(ht b, float c, float d, float e, float f, float g) implements wu {
   public static final afw a = new afw("debug/worldgen_attempt");

   public xk(tl $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public afw a() {
      return a;
   }
}
