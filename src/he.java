import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum he implements ask {
   a("down_east", hc.a, hc.f),
   b("down_north", hc.a, hc.c),
   c("down_south", hc.a, hc.d),
   d("down_west", hc.a, hc.e),
   e("up_east", hc.b, hc.f),
   f("up_north", hc.b, hc.c),
   g("up_south", hc.b, hc.d),
   h("up_west", hc.b, hc.e),
   i("west_up", hc.e, hc.b),
   j("east_up", hc.f, hc.b),
   k("north_up", hc.c, hc.b),
   l("south_up", hc.d, hc.b);

   private static final Int2ObjectMap<he> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (he $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final hc o;
   private final hc p;

   private static int b(hc $$0, hc $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private he(String $$0, hc $$1, hc $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static he a(hc $$0, hc $$1) {
      int $$2 = b($$0, $$1);
      return (he)m.get($$2);
   }

   public hc a() {
      return this.p;
   }

   public hc b() {
      return this.o;
   }
}
