import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jo implements bai {
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

   private static final Int2ObjectMap<jo> m = ae.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jo $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final jm o;
   private final jm p;

   private static int b(jm $$0, jm $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jo(final String $$0, final jm $$1, final jm $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jo a(jm $$0, jm $$1) {
      int $$2 = b($$0, $$1);
      return (jo)m.get($$2);
   }

   public jm a() {
      return this.p;
   }

   public jm b() {
      return this.o;
   }
}
