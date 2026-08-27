public record zu(id c, int d, String e, int f) implements zq {
   public static final yg<vi, zu> a = zq.a(zu::a, zu::new);
   public static final zq.b<zu> b = zq.a("debug/game_test_add_marker");

   private zu(vi $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public zq.b<zu> a() {
      return b;
   }

   public id b() {
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
