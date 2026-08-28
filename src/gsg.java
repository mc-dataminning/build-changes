import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gsg<S extends guj & gvt, M extends fxk<S> & fzu> extends grw<S, M> {
   private static final Int2ObjectMap<alc> a = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alc.b("stone"));
      $$0.put(2, alc.b("iron"));
      $$0.put(3, alc.b("gold"));
      $$0.put(4, alc.b("emerald"));
      $$0.put(5, alc.b("diamond"));
   });
   private final Object2ObjectMap<cnm, gyq.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cnk, gyq.a> c = new Object2ObjectOpenHashMap();
   private final aut d;
   private final String e;

   public gsg(gpf<S, M> $$0, aut $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cni $$6 = $$3.a();
         cnm $$7 = $$6.a();
         cnk $$8 = $$6.b();
         gyq.a $$9 = this.a(this.b, "type", lu.w, $$7);
         gyq.a $$10 = this.a(this.c, "profession", lu.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == gyq.a.a || $$10 == gyq.a.b && $$9 != gyq.a.c);
         alc $$12 = this.a("type", lu.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cnk.b && !$$3.ae) {
            alc $$13 = this.a("profession", lu.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cnk.m) {
               alc $$14 = this.a("profession_level", (alc)a.get(azd.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alc a(String $$0, alc $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gyq.a a(Object2ObjectMap<K, gyq.a> $$0, String $$1, ji<K> $$2, K $$3) {
      return (gyq.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gyq.a).map(gyq::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gyq.a.a));
   }
}
