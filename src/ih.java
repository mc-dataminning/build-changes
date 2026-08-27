import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum ih implements axc {
   a("down_east", ie.a, ie.f),
   b("down_north", ie.a, ie.c),
   c("down_south", ie.a, ie.d),
   d("down_west", ie.a, ie.e),
   e("up_east", ie.b, ie.f),
   f("up_north", ie.b, ie.c),
   g("up_south", ie.b, ie.d),
   h("up_west", ie.b, ie.e),
   i("west_up", ie.e, ie.b),
   j("east_up", ie.f, ie.b),
   k("north_up", ie.c, ie.b),
   l("south_up", ie.d, ie.b);

   private static final Int2ObjectMap<ih> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (ih $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ie o;
   private final ie p;

   private static int b(ie $$0, ie $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private ih(String $$0, ie $$1, ie $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static ih a(ie $$0, ie $$1) {
      int $$2 = b($$0, $$1);
      return (ih)m.get($$2);
   }

   public ie a() {
      return this.p;
   }

   public ie b() {
      return this.o;
   }
}
