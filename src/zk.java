public record zk(ib c, String d, int e) implements za {
   public static final xq<us, zk> a = za.a(zk::a, zk::new);
   public static final za.b<zk> b = za.a("debug/poi_added");

   private zk(us $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(us $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public za.b<zk> a() {
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
