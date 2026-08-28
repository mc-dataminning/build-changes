import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gsw<S extends gva & gwk, M extends fxz<S> & gak> extends gsm<S, M> {
   private static final Int2ObjectMap<alh> a = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alh.b("stone"));
      $$0.put(2, alh.b("iron"));
      $$0.put(3, alh.b("gold"));
      $$0.put(4, alh.b("emerald"));
      $$0.put(5, alh.b("diamond"));
   });
   private final Object2ObjectMap<cny, gzh.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cnw, gzh.a> c = new Object2ObjectOpenHashMap();
   private final ava d;
   private final String e;

   public gsw(gpv<S, M> $$0, ava $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fdt $$0, ghw $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cnu $$6 = $$3.a();
         cny $$7 = $$6.a();
         cnw $$8 = $$6.b();
         gzh.a $$9 = this.a(this.b, "type", lx.w, $$7);
         gzh.a $$10 = this.a(this.c, "profession", lx.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == gzh.a.a || $$10 == gzh.a.b && $$9 != gzh.a.c);
         alh $$12 = this.a("type", lx.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cnw.b && !$$3.ae) {
            alh $$13 = this.a("profession", lx.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cnw.m) {
               alh $$14 = this.a("profession_level", (alh)a.get(azj.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alh a(String $$0, alh $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gzh.a a(Object2ObjectMap<K, gzh.a> $$0, String $$1, jk<K> $$2, K $$3) {
      return (gzh.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gzh.a).map(gzh::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gzh.a.a));
   }
}
