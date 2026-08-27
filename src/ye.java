public record ye(hx b, int c, String d, int e) implements ya {
   public static final ahg a = new ahg("debug/game_test_add_marker");

   public ye(ui $$0) {
      this($$0.e(), $$0.readInt(), $$0.s(), $$0.readInt());
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public ahg a() {
      return a;
   }
}
