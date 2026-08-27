public record xp(ht b, int c) implements xd {
   public static final agg a = new agg("debug/poi_ticket_count");

   public xp(tu $$0) {
      this($$0.e(), $$0.readInt());
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.b);
      $$0.p(this.c);
   }

   @Override
   public agg a() {
      return a;
   }
}
