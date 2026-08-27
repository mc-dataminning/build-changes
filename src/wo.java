public record wo(gw b, float c, float d, float e, float f, float g) implements vy {
   public static final aey a = new aey("debug/worldgen_attempt");

   public wo(sq $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public aey a() {
      return a;
   }
}
