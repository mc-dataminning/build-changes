public record we(gv b, float c, float d, float e, float f, float g) implements vo {
   public static final aep a = new aep("debug/worldgen_attempt");

   public we(sh $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public aep a() {
      return a;
   }
}
