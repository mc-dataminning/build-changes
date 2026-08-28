public enum jo implements bba {
   a("down_east", jm.a, jm.f),
   b("down_north", jm.a, jm.c),
   c("down_south", jm.a, jm.d),
   d("down_west", jm.a, jm.e),
   e("up_east", jm.b, jm.f),
   f("up_north", jm.b, jm.c),
   g("up_south", jm.b, jm.d),
   h("up_west", jm.b, jm.e),
   i("west_up", jm.e, jm.b),
   j("east_up", jm.f, jm.b),
   k("north_up", jm.c, jm.b),
   l("south_up", jm.d, jm.b);

   private static final int m = jm.values().length;
   private static final jo[] n = ae.a(new jo[m * m], $$0 -> {
      for (jo $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final jm p;
   private final jm q;

   private static int b(jm $$0, jm $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private jo(final String $$0, final jm $$1, final jm $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static jo a(jm $$0, jm $$1) {
      return n[b($$0, $$1)];
   }

   public jm a() {
      return this.q;
   }

   public jm b() {
      return this.p;
   }
}
