import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum it implements ayq {
   a("down_east", ir.a, ir.f),
   b("down_north", ir.a, ir.c),
   c("down_south", ir.a, ir.d),
   d("down_west", ir.a, ir.e),
   e("up_east", ir.b, ir.f),
   f("up_north", ir.b, ir.c),
   g("up_south", ir.b, ir.d),
   h("up_west", ir.b, ir.e),
   i("west_up", ir.e, ir.b),
   j("east_up", ir.f, ir.b),
   k("north_up", ir.c, ir.b),
   l("south_up", ir.d, ir.b);

   private static final Int2ObjectMap<it> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (it $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ir o;
   private final ir p;

   private static int b(ir $$0, ir $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private it(String $$0, ir $$1, ir $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static it a(ir $$0, ir $$1) {
      int $$2 = b($$0, $$1);
      return (it)m.get($$2);
   }

   public ir a() {
      return this.p;
   }

   public ir b() {
      return this.o;
   }
}
