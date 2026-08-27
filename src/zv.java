public record zv(zv.a c) implements zo {
   public static final ye<vg, zv> a = zo.a(zv::a, zv::new);
   public static final zo.b<zv> b = zo.a("debug/hive");

   private zv(vg $$0) {
      this(new zv.a($$0));
   }

   private void a(vg $$0) {
      this.c.a($$0);
   }

   @Override
   public zo.b<zv> a() {
      return b;
   }

   public zv.a b() {
      return this.c;
   }

   public static record a(ib a, String b, int c, int d, boolean e) {
      public a(vg $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
