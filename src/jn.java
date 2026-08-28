import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jn implements baf {
   a("down_east", jl.a, jl.f),
   b("down_north", jl.a, jl.c),
   c("down_south", jl.a, jl.d),
   d("down_west", jl.a, jl.e),
   e("up_east", jl.b, jl.f),
   f("up_north", jl.b, jl.c),
   g("up_south", jl.b, jl.d),
   h("up_west", jl.b, jl.e),
   i("west_up", jl.e, jl.b),
   j("east_up", jl.f, jl.b),
   k("north_up", jl.c, jl.b),
   l("south_up", jl.d, jl.b);

   private static final Int2ObjectMap<jn> m = ad.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jn $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final jl o;
   private final jl p;

   private static int b(jl $$0, jl $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jn(final String $$0, final jl $$1, final jl $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jn a(jl $$0, jl $$1) {
      int $$2 = b($$0, $$1);
      return (jn)m.get($$2);
   }

   public jl a() {
      return this.p;
   }

   public jl b() {
      return this.o;
   }
}
