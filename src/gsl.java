import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gsl<S extends guo & gvy, M extends fxo<S> & fzz> extends gsb<S, M> {
   private static final Int2ObjectMap<ale> a = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ale.b("stone"));
      $$0.put(2, ale.b("iron"));
      $$0.put(3, ale.b("gold"));
      $$0.put(4, ale.b("emerald"));
      $$0.put(5, ale.b("diamond"));
   });
   private final Object2ObjectMap<cnp, gyv.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cnn, gyv.a> c = new Object2ObjectOpenHashMap();
   private final auv d;
   private final String e;

   public gsl(gpk<S, M> $$0, auv $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fdi $$0, ghl $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cnl $$6 = $$3.a();
         cnp $$7 = $$6.a();
         cnn $$8 = $$6.b();
         gyv.a $$9 = this.a(this.b, "type", lv.w, $$7);
         gyv.a $$10 = this.a(this.c, "profession", lv.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == gyv.a.a || $$10 == gyv.a.b && $$9 != gyv.a.c);
         ale $$12 = this.a("type", lv.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cnn.b && !$$3.ae) {
            ale $$13 = this.a("profession", lv.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cnn.m) {
               ale $$14 = this.a("profession_level", (ale)a.get(azf.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private ale a(String $$0, ale $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gyv.a a(Object2ObjectMap<K, gyv.a> $$0, String $$1, jj<K> $$2, K $$3) {
      return (gyv.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gyv.a).map(gyv::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gyv.a.a));
   }
}
