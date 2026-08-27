import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum ie implements ave {
   a("down_east", ic.a, ic.f),
   b("down_north", ic.a, ic.c),
   c("down_south", ic.a, ic.d),
   d("down_west", ic.a, ic.e),
   e("up_east", ic.b, ic.f),
   f("up_north", ic.b, ic.c),
   g("up_south", ic.b, ic.d),
   h("up_west", ic.b, ic.e),
   i("west_up", ic.e, ic.b),
   j("east_up", ic.f, ic.b),
   k("north_up", ic.c, ic.b),
   l("south_up", ic.d, ic.b);

   private static final Int2ObjectMap<ie> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (ie $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ic o;
   private final ic p;

   private static int b(ic $$0, ic $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private ie(String $$0, ic $$1, ic $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static ie a(ic $$0, ic $$1) {
      int $$2 = b($$0, $$1);
      return (ie)m.get($$2);
   }

   public ic a() {
      return this.p;
   }

   public ic b() {
      return this.o;
   }
}
