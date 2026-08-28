import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hbf<S extends hdn & hew, M extends gfy<S> & gik> extends hav<S, M> {
   private static final Int2ObjectMap<alg> a = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alg.b("stone"));
      $$0.put(2, alg.b("iron"));
      $$0.put(3, alg.b("gold"));
      $$0.put(4, alg.b("emerald"));
      $$0.put(5, alg.b("diamond"));
   });
   private final Object2ObjectMap<alf<cqt>, hkl.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<alf<cqr>, hkl.a> c = new Object2ObjectOpenHashMap();
   private final avd d;
   private final String e;

   public hbf(gye<S, M> $$0, avd $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fjj $$0, gqa $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         cqp $$6 = $$3.a();
         if ($$6 != null) {
            je<cqt> $$7 = $$6.a();
            je<cqr> $$8 = $$6.b();
            hkl.a $$9 = this.a(this.b, "type", $$7);
            hkl.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hkl.a.a || $$10 == hkl.a.b && $$9 != hkl.a.c);
            alg $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(cqr.b) && !$$3.aj) {
               alg $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(cqr.m)) {
                  alg $$14 = this.a("profession_level", (alg)a.get(azm.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private alg a(String $$0, alg $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private alg a(String $$0, je<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(him.c());
   }

   public <K> hkl.a a(Object2ObjectMap<alf<K>, hkl.a> $$0, String $$1, je<K> $$2) {
      alf<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hkl.a.a : (hkl.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hkl.b).map(hkl::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hkl.a.a));
   }
}
