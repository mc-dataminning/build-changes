import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum iu implements ayt {
   a("down_east", is.a, is.f),
   b("down_north", is.a, is.c),
   c("down_south", is.a, is.d),
   d("down_west", is.a, is.e),
   e("up_east", is.b, is.f),
   f("up_north", is.b, is.c),
   g("up_south", is.b, is.d),
   h("up_west", is.b, is.e),
   i("west_up", is.e, is.b),
   j("east_up", is.f, is.b),
   k("north_up", is.c, is.b),
   l("south_up", is.d, is.b);

   private static final Int2ObjectMap<iu> m = ac.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for (iu $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }
   });
   private final String n;
   private final is o;
   private final is p;

   private static int b(is $$0, is $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private iu(String $$0, is $$1, is $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static iu a(is $$0, is $$1) {
      int $$2 = b($$0, $$1);
      return (iu)m.get($$2);
   }

   public is a() {
      return this.p;
   }

   public is b() {
      return this.o;
   }
}
