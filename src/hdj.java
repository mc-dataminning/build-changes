import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hdj<S extends hfr & hha, M extends gic<S> & gko> extends hcy<S, M> {
   private static final Int2ObjectMap<alk> a = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alk.b("stone"));
      $$0.put(2, alk.b("iron"));
      $$0.put(3, alk.b("gold"));
      $$0.put(4, alk.b("emerald"));
      $$0.put(5, alk.b("diamond"));
   });
   private final Object2ObjectMap<alj<crq>, hmr.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<alj<cro>, hmr.a> c = new Object2ObjectOpenHashMap();
   private final avh d;
   private final String e;

   public hdj(hah<S, M> $$0, avh $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(flq $$0, gsc $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         crm $$6 = $$3.a();
         if ($$6 != null) {
            jg<crq> $$7 = $$6.a();
            jg<cro> $$8 = $$6.b();
            hmr.a $$9 = this.a(this.b, "type", $$7);
            hmr.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hmr.a.a || $$10 == hmr.a.b && $$9 != hmr.a.c);
            alk $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(cro.b) && !$$3.aj) {
               alk $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(cro.m)) {
                  alk $$14 = this.a("profession_level", (alk)a.get(azq.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private alk a(String $$0, alk $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private alk a(String $$0, jg<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hkr.c());
   }

   public <K> hmr.a a(Object2ObjectMap<alj<K>, hmr.a> $$0, String $$1, jg<K> $$2) {
      alj<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hmr.a.a : (hmr.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hmr.b).map(hmr::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hmr.a.a));
   }
}
