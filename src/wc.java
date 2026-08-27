public record wc(gw b, int c, String d, int e) implements vy {
   public static final aey a = new aey("debug/game_test_add_marker");

   public wc(sq $$0) {
      this($$0.e(), $$0.readInt(), $$0.r(), $$0.readInt());
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aey a() {
      return a;
   }
}
