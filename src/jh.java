import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jh implements azc {
   a("down_east", jf.a, jf.f),
   b("down_north", jf.a, jf.c),
   c("down_south", jf.a, jf.d),
   d("down_west", jf.a, jf.e),
   e("up_east", jf.b, jf.f),
   f("up_north", jf.b, jf.c),
   g("up_south", jf.b, jf.d),
   h("up_west", jf.b, jf.e),
   i("west_up", jf.e, jf.b),
   j("east_up", jf.f, jf.b),
   k("north_up", jf.c, jf.b),
   l("south_up", jf.d, jf.b);

   private static final Int2ObjectMap<jh> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jh $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final jf o;
   private final jf p;

   private static int b(jf $$0, jf $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jh(final String $$0, final jf $$1, final jf $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jh a(jf $$0, jf $$1) {
      int $$2 = b($$0, $$1);
      return (jh)m.get($$2);
   }

   public jf a() {
      return this.p;
   }

   public jf b() {
      return this.o;
   }
}
