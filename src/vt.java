public record vt(gu b, int c, String d, int e) implements vp {
   public static final aer a = new aer("debug/game_test_add_marker");

   public vt(si $$0) {
      this($$0.e(), $$0.readInt(), $$0.r(), $$0.readInt());
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public aer a() {
      return a;
   }
}
