public enum jp implements azu {
   a("down_east", jn.a, jn.f),
   b("down_north", jn.a, jn.c),
   c("down_south", jn.a, jn.d),
   d("down_west", jn.a, jn.e),
   e("up_east", jn.b, jn.f),
   f("up_north", jn.b, jn.c),
   g("up_south", jn.b, jn.d),
   h("up_west", jn.b, jn.e),
   i("west_up", jn.e, jn.b),
   j("east_up", jn.f, jn.b),
   k("north_up", jn.c, jn.b),
   l("south_up", jn.d, jn.b);

   private static final int m = jn.values().length;
   private static final jp[] n = af.a(new jp[m * m], $$0 -> {
      for (jp $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final jn p;
   private final jn q;

   private static int b(jn $$0, jn $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private jp(final String $$0, final jn $$1, final jn $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static jp a(jn $$0, jn $$1) {
      return n[b($$0, $$1)];
   }

   public jn a() {
      return this.q;
   }

   public jn b() {
      return this.p;
   }
}
