import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum id implements auk {
   a("down_east", ib.a, ib.f),
   b("down_north", ib.a, ib.c),
   c("down_south", ib.a, ib.d),
   d("down_west", ib.a, ib.e),
   e("up_east", ib.b, ib.f),
   f("up_north", ib.b, ib.c),
   g("up_south", ib.b, ib.d),
   h("up_west", ib.b, ib.e),
   i("west_up", ib.e, ib.b),
   j("east_up", ib.f, ib.b),
   k("north_up", ib.c, ib.b),
   l("south_up", ib.d, ib.b);

   private static final Int2ObjectMap<id> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (id $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ib o;
   private final ib p;

   private static int b(ib $$0, ib $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private id(String $$0, ib $$1, ib $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static id a(ib $$0, ib $$1) {
      int $$2 = b($$0, $$1);
      return (id)m.get($$2);
   }

   public ib a() {
      return this.p;
   }

   public ib b() {
      return this.o;
   }
}
