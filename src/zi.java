public record zi(hz c, String d, int e) implements yy {
   public static final xo<uq, zi> a = yy.a(zi::a, zi::new);
   public static final yy.b<zi> b = yy.a("debug/poi_added");

   private zi(uq $$0) {
      this($$0.e(), $$0.r(), $$0.readInt());
   }

   private void a(uq $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public yy.b<zi> a() {
      return b;
   }

   public hz b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
