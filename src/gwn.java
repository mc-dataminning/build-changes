import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gwn<S extends gyr & hab, M extends gbk<S> & gdv> extends gwd<S, M> {
   private static final Int2ObjectMap<alz> a = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alz.b("stone"));
      $$0.put(2, alz.b("iron"));
      $$0.put(3, alz.b("gold"));
      $$0.put(4, alz.b("emerald"));
      $$0.put(5, alz.b("diamond"));
   });
   private final Object2ObjectMap<cpn, hcy.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cpl, hcy.a> c = new Object2ObjectOpenHashMap();
   private final avv d;
   private final String e;

   public gwn(gtl<S, M> $$0, avv $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fgq $$0, glj $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cpj $$6 = $$3.a();
         cpn $$7 = $$6.a();
         cpl $$8 = $$6.b();
         hcy.a $$9 = this.a(this.b, "type", ma.w, $$7);
         hcy.a $$10 = this.a(this.c, "profession", ma.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hcy.a.a || $$10 == hcy.a.b && $$9 != hcy.a.c);
         alz $$12 = this.a("type", ma.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cpl.b && !$$3.ae) {
            alz $$13 = this.a("profession", ma.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cpl.m) {
               alz $$14 = this.a("profession_level", (alz)a.get(bae.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alz a(String $$0, alz $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hcy.a a(Object2ObjectMap<K, hcy.a> $$0, String $$1, jl<K> $$2, K $$3) {
      return (hcy.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hcy.a).map(hcy::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hcy.a.a));
   }
}
