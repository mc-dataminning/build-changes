import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum hc implements ash {
   a("down_east", ha.a, ha.f),
   b("down_north", ha.a, ha.c),
   c("down_south", ha.a, ha.d),
   d("down_west", ha.a, ha.e),
   e("up_east", ha.b, ha.f),
   f("up_north", ha.b, ha.c),
   g("up_south", ha.b, ha.d),
   h("up_west", ha.b, ha.e),
   i("west_up", ha.e, ha.b),
   j("east_up", ha.f, ha.b),
   k("north_up", ha.c, ha.b),
   l("south_up", ha.d, ha.b);

   private static final Int2ObjectMap<hc> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (hc $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ha o;
   private final ha p;

   private static int b(ha $$0, ha $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private hc(String $$0, ha $$1, ha $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static hc a(ha $$0, ha $$1) {
      int $$2 = b($$0, $$1);
      return (hc)m.get($$2);
   }

   public ha a() {
      return this.p;
   }

   public ha b() {
      return this.o;
   }
}
