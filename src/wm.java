public record wm(gw b, float c, float d, float e, float f, float g) implements vw {
   public static final aex a = new aex("debug/worldgen_attempt");

   public wm(so $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public aex a() {
      return a;
   }
}
