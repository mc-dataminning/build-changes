public record vs(gv b, int c, String d, int e) implements vo {
   public static final aep a = new aep("debug/game_test_add_marker");

   public vs(sh $$0) {
      this($$0.e(), $$0.readInt(), $$0.r(), $$0.readInt());
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aep a() {
      return a;
   }
}
