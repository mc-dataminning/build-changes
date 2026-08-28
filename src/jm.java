import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jm implements bab {
   a("down_east", jk.a, jk.f),
   b("down_north", jk.a, jk.c),
   c("down_south", jk.a, jk.d),
   d("down_west", jk.a, jk.e),
   e("up_east", jk.b, jk.f),
   f("up_north", jk.b, jk.c),
   g("up_south", jk.b, jk.d),
   h("up_west", jk.b, jk.e),
   i("west_up", jk.e, jk.b),
   j("east_up", jk.f, jk.b),
   k("north_up", jk.c, jk.b),
   l("south_up", jk.d, jk.b);

   private static final Int2ObjectMap<jm> m = ad.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jm $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final jk o;
   private final jk p;

   private static int b(jk $$0, jk $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jm(final String $$0, final jk $$1, final jk $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jm a(jk $$0, jk $$1) {
      int $$2 = b($$0, $$1);
      return (jm)m.get($$2);
   }

   public jk a() {
      return this.p;
   }

   public jk b() {
      return this.o;
   }
}
