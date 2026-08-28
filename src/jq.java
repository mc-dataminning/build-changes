public enum jq implements bag {
   a("down_east", jo.a, jo.f),
   b("down_north", jo.a, jo.c),
   c("down_south", jo.a, jo.d),
   d("down_west", jo.a, jo.e),
   e("up_east", jo.b, jo.f),
   f("up_north", jo.b, jo.c),
   g("up_south", jo.b, jo.d),
   h("up_west", jo.b, jo.e),
   i("west_up", jo.e, jo.b),
   j("east_up", jo.f, jo.b),
   k("north_up", jo.c, jo.b),
   l("south_up", jo.d, jo.b);

   private static final int m = jo.values().length;
   private static final jq[] n = af.a(new jq[m * m], $$0 -> {
      for (jq $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final jo p;
   private final jo q;

   private static int b(jo $$0, jo $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private jq(final String $$0, final jo $$1, final jo $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static jq a(jo $$0, jo $$1) {
      return n[b($$0, $$1)];
   }

   public jo a() {
      return this.q;
   }

   public jo b() {
      return this.p;
   }
}
