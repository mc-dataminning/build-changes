import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gwi<S extends gym & gzw, M extends gbf<S> & gdq> extends gvy<S, M> {
   private static final Int2ObjectMap<alz> a = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alz.b("stone"));
      $$0.put(2, alz.b("iron"));
      $$0.put(3, alz.b("gold"));
      $$0.put(4, alz.b("emerald"));
      $$0.put(5, alz.b("diamond"));
   });
   private final Object2ObjectMap<cpj, hct.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cph, hct.a> c = new Object2ObjectOpenHashMap();
   private final avv d;
   private final String e;

   public gwi(gtg<S, M> $$0, avv $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fgl $$0, gle $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cpf $$6 = $$3.a();
         cpj $$7 = $$6.a();
         cph $$8 = $$6.b();
         hct.a $$9 = this.a(this.b, "type", ma.w, $$7);
         hct.a $$10 = this.a(this.c, "profession", ma.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hct.a.a || $$10 == hct.a.b && $$9 != hct.a.c);
         alz $$12 = this.a("type", ma.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cph.b && !$$3.ae) {
            alz $$13 = this.a("profession", ma.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cph.m) {
               alz $$14 = this.a("profession_level", (alz)a.get(bae.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alz a(String $$0, alz $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hct.a a(Object2ObjectMap<K, hct.a> $$0, String $$1, jl<K> $$2, K $$3) {
      return (hct.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hct.a).map(hct::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hct.a.a));
   }
}
