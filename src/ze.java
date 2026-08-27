public record ze(ib c, int d, String e, int f) implements za {
   public static final xq<us, ze> a = za.a(ze::a, ze::new);
   public static final za.b<ze> b = za.a("debug/game_test_add_marker");

   private ze(us $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(us $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public za.b<ze> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }
}
