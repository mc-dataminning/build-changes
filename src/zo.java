public record zo(ib c, int d) implements zc {
   public static final xs<uu, zo> a = zc.a(zo::a, zo::new);
   public static final zc.b<zo> b = zc.a("debug/poi_ticket_count");

   private zo(uu $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(uu $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public zc.b<zo> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
