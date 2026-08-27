import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum ic implements aut {
   a("down_east", ia.a, ia.f),
   b("down_north", ia.a, ia.c),
   c("down_south", ia.a, ia.d),
   d("down_west", ia.a, ia.e),
   e("up_east", ia.b, ia.f),
   f("up_north", ia.b, ia.c),
   g("up_south", ia.b, ia.d),
   h("up_west", ia.b, ia.e),
   i("west_up", ia.e, ia.b),
   j("east_up", ia.f, ia.b),
   k("north_up", ia.c, ia.b),
   l("south_up", ia.d, ia.b);

   private static final Int2ObjectMap<ic> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (ic $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ia o;
   private final ia p;

   private static int b(ia $$0, ia $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private ic(String $$0, ia $$1, ia $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static ic a(ia $$0, ia $$1) {
      int $$2 = b($$0, $$1);
      return (ic)m.get($$2);
   }

   public ia a() {
      return this.p;
   }

   public ia b() {
      return this.o;
   }
}
