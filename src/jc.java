public enum jc implements bak {
   a("down_east", ja.a, ja.f),
   b("down_north", ja.a, ja.c),
   c("down_south", ja.a, ja.d),
   d("down_west", ja.a, ja.e),
   e("up_east", ja.b, ja.f),
   f("up_north", ja.b, ja.c),
   g("up_south", ja.b, ja.d),
   h("up_west", ja.b, ja.e),
   i("west_up", ja.e, ja.b),
   j("east_up", ja.f, ja.b),
   k("north_up", ja.c, ja.b),
   l("south_up", ja.d, ja.b);

   private static final int m = ja.values().length;
   private static final jc[] n = af.a(new jc[m * m], $$0 -> {
      for (jc $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final ja p;
   private final ja q;

   private static int b(ja $$0, ja $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private jc(final String $$0, final ja $$1, final ja $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static jc a(ja $$0, ja $$1) {
      return n[b($$0, $$1)];
   }

   public ja a() {
      return this.q;
   }

   public ja b() {
      return this.p;
   }
}
