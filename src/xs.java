public record xs(hv b, int c, String d, int e) implements xo {
   public static final agt a = new agt("debug/game_test_add_marker");

   public xs(ue $$0) {
      this($$0.e(), $$0.readInt(), $$0.s(), $$0.readInt());
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public agt a() {
      return a;
   }
}
