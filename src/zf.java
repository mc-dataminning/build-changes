public record zf(zf.a c) implements yy {
   public static final xo<uq, zf> a = yy.a(zf::a, zf::new);
   public static final yy.b<zf> b = yy.a("debug/hive");

   private zf(uq $$0) {
      this(new zf.a($$0));
   }

   private void a(uq $$0) {
      this.c.a($$0);
   }

   @Override
   public yy.b<zf> a() {
      return b;
   }

   public zf.a b() {
      return this.c;
   }

   public static record a(hz a, String b, int c, int d, boolean e) {
      public a(uq $$0) {
         this($$0.e(), $$0.r(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
