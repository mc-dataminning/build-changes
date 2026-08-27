import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum iv implements ayx {
   a("down_east", it.a, it.f),
   b("down_north", it.a, it.c),
   c("down_south", it.a, it.d),
   d("down_west", it.a, it.e),
   e("up_east", it.b, it.f),
   f("up_north", it.b, it.c),
   g("up_south", it.b, it.d),
   h("up_west", it.b, it.e),
   i("west_up", it.e, it.b),
   j("east_up", it.f, it.b),
   k("north_up", it.c, it.b),
   l("south_up", it.d, it.b);

   private static final Int2ObjectMap<iv> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (iv $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final it o;
   private final it p;

   private static int b(it $$0, it $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private iv(String $$0, it $$1, it $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static iv a(it $$0, it $$1) {
      int $$2 = b($$0, $$1);
      return (iv)m.get($$2);
   }

   public it a() {
      return this.p;
   }

   public it b() {
      return this.o;
   }
}
