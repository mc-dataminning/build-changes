import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gfw<T extends boi & cha, M extends fmi<T> & fot> extends gfl<T, M> {
   private static final Int2ObjectMap<aiy> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aiy("stone"));
      $$0.put(2, new aiy("iron"));
      $$0.put(3, new aiy("gold"));
      $$0.put(4, new aiy("emerald"));
      $$0.put(5, new aiy("diamond"));
   });
   private final Object2ObjectMap<chd, gio.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<chb, gio.a> c = new Object2ObjectOpenHashMap();
   private final asb d;
   private final String e;

   public gfw(gcv<T, M> $$0, asb $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cgz $$10 = $$3.gr();
         chd $$11 = $$10.a();
         chb $$12 = $$10.b();
         gio.a $$13 = this.a(this.b, "type", kf.y, $$11);
         gio.a $$14 = this.a(this.c, "profession", kf.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gio.a.a || $$14 == gio.a.b && $$13 != gio.a.c);
         aiy $$16 = this.a("type", kf.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != chb.b && !$$3.o_()) {
            aiy $$17 = this.a("profession", kf.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != chb.m) {
               aiy $$18 = this.a("profession_level", (aiy)a.get(awi.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aiy a(String $$0, aiy $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gio.a a(Object2ObjectMap<K, gio.a> $$0, String $$1, id<K> $$2, K $$3) {
      return (gio.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gio.a).map(gio::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gio.a.a));
   }
}
