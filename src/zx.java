public record zx(zx.a c) implements zq {
   public static final yg<vi, zx> a = zq.a(zx::a, zx::new);
   public static final zq.b<zx> b = zq.a("debug/hive");

   private zx(vi $$0) {
      this(new zx.a($$0));
   }

   private void a(vi $$0) {
      this.c.a($$0);
   }

   @Override
   public zq.b<zx> a() {
      return b;
   }

   public zx.a b() {
      return this.c;
   }

   public static record a(id a, String b, int c, int d, boolean e) {
      public a(vi $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vi $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
