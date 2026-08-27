public record wy(ht b, int c, String d, int e) implements wu {
   public static final afw a = new afw("debug/game_test_add_marker");

   public wy(tl $$0) {
      this($$0.e(), $$0.readInt(), $$0.s(), $$0.readInt());
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public afw a() {
      return a;
   }
}
