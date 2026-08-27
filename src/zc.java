public record zc(hz c, int d, String e, int f) implements yy {
   public static final xo<uq, zc> a = yy.a(zc::a, zc::new);
   public static final yy.b<zc> b = yy.a("debug/game_test_add_marker");

   private zc(uq $$0) {
      this($$0.e(), $$0.readInt(), $$0.r(), $$0.readInt());
   }

   private void a(uq $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public yy.b<zc> a() {
      return b;
   }

   public hz b() {
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
