import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum iy implements azg {
   a("down_east", iw.a, iw.f),
   b("down_north", iw.a, iw.c),
   c("down_south", iw.a, iw.d),
   d("down_west", iw.a, iw.e),
   e("up_east", iw.b, iw.f),
   f("up_north", iw.b, iw.c),
   g("up_south", iw.b, iw.d),
   h("up_west", iw.b, iw.e),
   i("west_up", iw.e, iw.b),
   j("east_up", iw.f, iw.b),
   k("north_up", iw.c, iw.b),
   l("south_up", iw.d, iw.b);

   private static final Int2ObjectMap<iy> m = ad.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (iy $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final iw o;
   private final iw p;

   private static int b(iw $$0, iw $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private iy(String $$0, iw $$1, iw $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static iy a(iw $$0, iw $$1) {
      int $$2 = b($$0, $$1);
      return (iy)m.get($$2);
   }

   public iw a() {
      return this.p;
   }

   public iw b() {
      return this.o;
   }
}
