import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jg implements azt {
   a("down_east", je.a, je.f),
   b("down_north", je.a, je.c),
   c("down_south", je.a, je.d),
   d("down_west", je.a, je.e),
   e("up_east", je.b, je.f),
   f("up_north", je.b, je.c),
   g("up_south", je.b, je.d),
   h("up_west", je.b, je.e),
   i("west_up", je.e, je.b),
   j("east_up", je.f, je.b),
   k("north_up", je.c, je.b),
   l("south_up", je.d, je.b);

   private static final Int2ObjectMap<jg> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jg $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final je o;
   private final je p;

   private static int b(je $$0, je $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jg(final String $$0, final je $$1, final je $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jg a(je $$0, je $$1) {
      int $$2 = b($$0, $$1);
      return (jg)m.get($$2);
   }

   public je a() {
      return this.p;
   }

   public je b() {
      return this.o;
   }
}
