import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum ij implements axg {
   a("down_east", ih.a, ih.f),
   b("down_north", ih.a, ih.c),
   c("down_south", ih.a, ih.d),
   d("down_west", ih.a, ih.e),
   e("up_east", ih.b, ih.f),
   f("up_north", ih.b, ih.c),
   g("up_south", ih.b, ih.d),
   h("up_west", ih.b, ih.e),
   i("west_up", ih.e, ih.b),
   j("east_up", ih.f, ih.b),
   k("north_up", ih.c, ih.b),
   l("south_up", ih.d, ih.b);

   private static final Int2ObjectMap<ij> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (ij $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ih o;
   private final ih p;

   private static int b(ih $$0, ih $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private ij(String $$0, ih $$1, ih $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static ij a(ih $$0, ih $$1) {
      int $$2 = b($$0, $$1);
      return (ij)m.get($$2);
   }

   public ih a() {
      return this.p;
   }

   public ih b() {
      return this.o;
   }
}
