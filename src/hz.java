import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum hz implements atr {
   a("down_east", hx.a, hx.f),
   b("down_north", hx.a, hx.c),
   c("down_south", hx.a, hx.d),
   d("down_west", hx.a, hx.e),
   e("up_east", hx.b, hx.f),
   f("up_north", hx.b, hx.c),
   g("up_south", hx.b, hx.d),
   h("up_west", hx.b, hx.e),
   i("west_up", hx.e, hx.b),
   j("east_up", hx.f, hx.b),
   k("north_up", hx.c, hx.b),
   l("south_up", hx.d, hx.b);

   private static final Int2ObjectMap<hz> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (hz $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final hx o;
   private final hx p;

   private static int b(hx $$0, hx $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private hz(String $$0, hx $$1, hx $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static hz a(hx $$0, hx $$1) {
      int $$2 = b($$0, $$1);
      return (hz)m.get($$2);
   }

   public hx a() {
      return this.p;
   }

   public hx b() {
      return this.o;
   }
}
