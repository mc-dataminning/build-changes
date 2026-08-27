import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum hd implements asf {
   a("down_east", hb.a, hb.f),
   b("down_north", hb.a, hb.c),
   c("down_south", hb.a, hb.d),
   d("down_west", hb.a, hb.e),
   e("up_east", hb.b, hb.f),
   f("up_north", hb.b, hb.c),
   g("up_south", hb.b, hb.d),
   h("up_west", hb.b, hb.e),
   i("west_up", hb.e, hb.b),
   j("east_up", hb.f, hb.b),
   k("north_up", hb.c, hb.b),
   l("south_up", hb.d, hb.b);

   private static final Int2ObjectMap<hd> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (hd $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final hb o;
   private final hb p;

   private static int b(hb $$0, hb $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private hd(String $$0, hb $$1, hb $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static hd a(hb $$0, hb $$1) {
      int $$2 = b($$0, $$1);
      return (hd)m.get($$2);
   }

   public hb a() {
      return this.p;
   }

   public hb b() {
      return this.o;
   }
}
