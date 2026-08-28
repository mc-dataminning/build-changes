import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gzd<S extends hbk & hct, M extends gea<S> & ggm> extends gyt<S, M> {
   private static final Int2ObjectMap<ald> a = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ald.b("stone"));
      $$0.put(2, ald.b("iron"));
      $$0.put(3, ald.b("gold"));
      $$0.put(4, ald.b("emerald"));
      $$0.put(5, ald.b("diamond"));
   });
   private final Object2ObjectMap<alc<cpz>, hih.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<alc<cpx>, hih.a> c = new Object2ObjectOpenHashMap();
   private final ava d;
   private final String e;

   public gzd(gwc<S, M> $$0, ava $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fho $$0, gny $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         cpv $$6 = $$3.a();
         if ($$6 != null) {
            js<cpz> $$7 = $$6.a();
            js<cpx> $$8 = $$6.b();
            hih.a $$9 = this.a(this.b, "type", $$7);
            hih.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hih.a.a || $$10 == hih.a.b && $$9 != hih.a.c);
            ald $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(cpx.b) && !$$3.aj) {
               ald $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(cpx.m)) {
                  ald $$14 = this.a("profession_level", (ald)a.get(azk.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private ald a(String $$0, ald $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private ald a(String $$0, js<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hgh.c());
   }

   public <K> hih.a a(Object2ObjectMap<alc<K>, hih.a> $$0, String $$1, js<K> $$2) {
      alc<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hih.a.a : (hih.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hih.b).map(hih::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hih.a.a));
   }
}
