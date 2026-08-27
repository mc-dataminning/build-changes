public record zm(ib c, int d) implements za {
   public static final xq<us, zm> a = za.a(zm::a, zm::new);
   public static final za.b<zm> b = za.a("debug/poi_ticket_count");

   private zm(us $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(us $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public za.b<zm> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
