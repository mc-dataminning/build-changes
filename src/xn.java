public record xn(ht b, String c, int d) implements xd {
   public static final agg a = new agg("debug/poi_added");

   public xn(tu $$0) {
      this($$0.e(), $$0.s(), $$0.readInt());
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public agg a() {
      return a;
   }
}
