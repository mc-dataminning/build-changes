import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum jk implements azk {
   a("down_east", ji.a, ji.f),
   b("down_north", ji.a, ji.c),
   c("down_south", ji.a, ji.d),
   d("down_west", ji.a, ji.e),
   e("up_east", ji.b, ji.f),
   f("up_north", ji.b, ji.c),
   g("up_south", ji.b, ji.d),
   h("up_west", ji.b, ji.e),
   i("west_up", ji.e, ji.b),
   j("east_up", ji.f, ji.b),
   k("north_up", ji.c, ji.b),
   l("south_up", ji.d, ji.b);

   private static final Int2ObjectMap<jk> m = ad.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (jk $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final ji o;
   private final ji p;

   private static int b(ji $$0, ji $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private jk(final String $$0, final ji $$1, final ji $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static jk a(ji $$0, ji $$1) {
      int $$2 = b($$0, $$1);
      return (jk)m.get($$2);
   }

   public ji a() {
      return this.p;
   }

   public ji b() {
      return this.o;
   }
}
