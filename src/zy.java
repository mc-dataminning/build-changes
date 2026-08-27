public record zy(ib c, String d, int e) implements zo {
   public static final ye<vg, zy> a = zo.a(zy::a, zy::new);
   public static final zo.b<zy> b = zo.a("debug/poi_added");

   private zy(vg $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public zo.b<zy> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
