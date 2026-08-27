public record zj(zj.a c) implements zc {
   public static final xs<uu, zj> a = zc.a(zj::a, zj::new);
   public static final zc.b<zj> b = zc.a("debug/hive");

   private zj(uu $$0) {
      this(new zj.a($$0));
   }

   private void a(uu $$0) {
      this.c.a($$0);
   }

   @Override
   public zc.b<zj> a() {
      return b;
   }

   public zj.a b() {
      return this.c;
   }

   public static record a(ib a, String b, int c, int d, boolean e) {
      public a(uu $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(uu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
