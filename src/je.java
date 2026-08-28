public enum je implements bax {
   a("down_east", jc.a, jc.f),
   b("down_north", jc.a, jc.c),
   c("down_south", jc.a, jc.d),
   d("down_west", jc.a, jc.e),
   e("up_east", jc.b, jc.f),
   f("up_north", jc.b, jc.c),
   g("up_south", jc.b, jc.d),
   h("up_west", jc.b, jc.e),
   i("west_up", jc.e, jc.b),
   j("east_up", jc.f, jc.b),
   k("north_up", jc.c, jc.b),
   l("south_up", jc.d, jc.b);

   private static final int m = jc.values().length;
   private static final je[] n = ag.a(new je[m * m], $$0 -> {
      for (je $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final jc p;
   private final jc q;

   private static int b(jc $$0, jc $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private je(final String $$0, final jc $$1, final jc $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static je a(jc $$0, jc $$1) {
      return n[b($$0, $$1)];
   }

   public jc a() {
      return this.q;
   }

   public jc b() {
      return this.p;
   }
}
