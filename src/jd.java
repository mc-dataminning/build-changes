public enum jd implements bam {
   a("down_east", jb.a, jb.f),
   b("down_north", jb.a, jb.c),
   c("down_south", jb.a, jb.d),
   d("down_west", jb.a, jb.e),
   e("up_east", jb.b, jb.f),
   f("up_north", jb.b, jb.c),
   g("up_south", jb.b, jb.d),
   h("up_west", jb.b, jb.e),
   i("west_up", jb.e, jb.b),
   j("east_up", jb.f, jb.b),
   k("north_up", jb.c, jb.b),
   l("south_up", jb.d, jb.b);

   private static final int m = jb.values().length;
   private static final jd[] n = ag.a(new jd[m * m], $$0 -> {
      for (jd $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final jb p;
   private final jb q;

   private static int b(jb $$0, jb $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private jd(final String $$0, final jb $$1, final jb $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static jd a(jb $$0, jb $$1) {
      return n[b($$0, $$1)];
   }

   public jb a() {
      return this.q;
   }

   public jb b() {
      return this.p;
   }
}
