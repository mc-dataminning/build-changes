import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jl implements azy {
   a("down_east", jj.a, jj.f),
   b("down_north", jj.a, jj.c),
   c("down_south", jj.a, jj.d),
   d("down_west", jj.a, jj.e),
   e("up_east", jj.b, jj.f),
   f("up_north", jj.b, jj.c),
   g("up_south", jj.b, jj.d),
   h("up_west", jj.b, jj.e),
   i("west_up", jj.e, jj.b),
   j("east_up", jj.f, jj.b),
   k("north_up", jj.c, jj.b),
   l("south_up", jj.d, jj.b);

   private static final Int2ObjectMap<jl> m = ad.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jl $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final jj o;
   private final jj p;

   private static int b(jj $$0, jj $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jl(final String $$0, final jj $$1, final jj $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jl a(jj $$0, jj $$1) {
      int $$2 = b($$0, $$1);
      return (jl)m.get($$2);
   }

   public jj a() {
      return this.p;
   }

   public jj b() {
      return this.o;
   }
}
