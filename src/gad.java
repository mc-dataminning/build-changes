import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gad<T extends bky & cdb, M extends fhc<T> & fjm> extends fzs<T, M> {
   private static final Int2ObjectMap<agg> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new agg("stone"));
      $$0.put(2, new agg("iron"));
      $$0.put(3, new agg("gold"));
      $$0.put(4, new agg("emerald"));
      $$0.put(5, new agg("diamond"));
   });
   private final Object2ObjectMap<cde, gcv.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cdc, gcv.a> c = new Object2ObjectOpenHashMap();
   private final apd d;
   private final String e;

   public gad(fxf<T, M> $$0, apd $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cda $$10 = $$3.gp();
         cde $$11 = $$10.a();
         cdc $$12 = $$10.b();
         gcv.a $$13 = this.a(this.b, "type", jy.z, $$11);
         gcv.a $$14 = this.a(this.c, "profession", jy.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gcv.a.a || $$14 == gcv.a.b && $$13 != gcv.a.c);
         agg $$16 = this.a("type", jy.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cdc.b && !$$3.n_()) {
            agg $$17 = this.a("profession", jy.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cdc.m) {
               agg $$18 = this.a("profession_level", (agg)a.get(ati.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private agg a(String $$0, agg $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gcv.a a(Object2ObjectMap<K, gcv.a> $$0, String $$1, hw<K> $$2, K $$3) {
      return (gcv.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gcv.a).map(gcv::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gcv.a.a));
   }
}
