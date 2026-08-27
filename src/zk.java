public record zk(hz c, int d) implements yy {
   public static final xo<uq, zk> a = yy.a(zk::a, zk::new);
   public static final yy.b<zk> b = yy.a("debug/poi_ticket_count");

   private zk(uq $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(uq $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public yy.b<zk> a() {
      return b;
   }

   public hz b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
