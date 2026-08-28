import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hbx<S extends hef & hfo, M extends ggp<S> & gjb> extends hbm<S, M> {
   private static final Int2ObjectMap<alg> a = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alg.b("stone"));
      $$0.put(2, alg.b("iron"));
      $$0.put(3, alg.b("gold"));
      $$0.put(4, alg.b("emerald"));
      $$0.put(5, alg.b("diamond"));
   });
   private final Object2ObjectMap<alf<crd>, hlf.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<alf<crb>, hlf.a> c = new Object2ObjectOpenHashMap();
   private final avd d;
   private final String e;

   public hbx(gyv<S, M> $$0, avd $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fkd $$0, gqr $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         cqz $$6 = $$3.a();
         if ($$6 != null) {
            jf<crd> $$7 = $$6.a();
            jf<crb> $$8 = $$6.b();
            hlf.a $$9 = this.a(this.b, "type", $$7);
            hlf.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hlf.a.a || $$10 == hlf.a.b && $$9 != hlf.a.c);
            alg $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(crb.b) && !$$3.aj) {
               alg $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(crb.m)) {
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

   private alg a(String $$0, jf<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hjf.c());
   }

   public <K> hlf.a a(Object2ObjectMap<alf<K>, hlf.a> $$0, String $$1, jf<K> $$2) {
      alf<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hlf.a.a : (hlf.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hlf.b).map(hlf::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hlf.a.a));
   }
}
