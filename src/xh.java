public record xh(ht b, int c, String d, int e) implements xd {
   public static final agi a = new agi("debug/game_test_add_marker");

   public xh(tu $$0) {
      this($$0.e(), $$0.readInt(), $$0.s(), $$0.readInt());
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public agi a() {
      return a;
   }
}
