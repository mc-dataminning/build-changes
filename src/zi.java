public record zi(long c, ib d) implements za {
   public static final xq<us, zi> a = za.a(zi::a, zi::new);
   public static final za.b<zi> b = za.a("debug/neighbors_update");

   private zi(us $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(us $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public za.b<zi> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public ib c() {
      return this.d;
   }
}
