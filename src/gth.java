import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gth<S extends gvl & gwv, M extends fyk<S> & gav> extends gsx<S, M> {
   private static final Int2ObjectMap<ali> a = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ali.b("stone"));
      $$0.put(2, ali.b("iron"));
      $$0.put(3, ali.b("gold"));
      $$0.put(4, ali.b("emerald"));
      $$0.put(5, ali.b("diamond"));
   });
   private final Object2ObjectMap<cod, gzs.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cob, gzs.a> c = new Object2ObjectOpenHashMap();
   private final avb d;
   private final String e;

   public gth(gqg<S, M> $$0, avb $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cnz $$6 = $$3.a();
         cod $$7 = $$6.a();
         cob $$8 = $$6.b();
         gzs.a $$9 = this.a(this.b, "type", ly.w, $$7);
         gzs.a $$10 = this.a(this.c, "profession", ly.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == gzs.a.a || $$10 == gzs.a.b && $$9 != gzs.a.c);
         ali $$12 = this.a("type", ly.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cob.b && !$$3.ae) {
            ali $$13 = this.a("profession", ly.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cob.m) {
               ali $$14 = this.a("profession_level", (ali)a.get(azk.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private ali a(String $$0, ali $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gzs.a a(Object2ObjectMap<K, gzs.a> $$0, String $$1, jl<K> $$2, K $$3) {
      return (gzs.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gzs.a).map(gzs::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gzs.a.a));
   }
}
