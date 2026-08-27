public record zw(long c, ib d) implements zo {
   public static final ye<vg, zw> a = zo.a(zw::a, zw::new);
   public static final zo.b<zw> b = zo.a("debug/neighbors_update");

   private zw(vg $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zo.b<zw> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public ib c() {
      return this.d;
   }
}
