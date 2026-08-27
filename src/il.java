import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum il implements ayg {
   a("down_east", ij.a, ij.f),
   b("down_north", ij.a, ij.c),
   c("down_south", ij.a, ij.d),
   d("down_west", ij.a, ij.e),
   e("up_east", ij.b, ij.f),
   f("up_north", ij.b, ij.c),
   g("up_south", ij.b, ij.d),
   h("up_west", ij.b, ij.e),
   i("west_up", ij.e, ij.b),
   j("east_up", ij.f, ij.b),
   k("north_up", ij.c, ij.b),
   l("south_up", ij.d, ij.b);

   private static final Int2ObjectMap<il> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (il $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ij o;
   private final ij p;

   private static int b(ij $$0, ij $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private il(String $$0, ij $$1, ij $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static il a(ij $$0, ij $$1) {
      int $$2 = b($$0, $$1);
      return (il)m.get($$2);
   }

   public ij a() {
      return this.p;
   }

   public ij b() {
      return this.o;
   }
}
