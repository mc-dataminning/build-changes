import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gkn<T extends bqt & cjp, M extends fqv<T> & ftf> extends gkc<T, M> {
   private static final Int2ObjectMap<ajv> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ajv("stone"));
      $$0.put(2, new ajv("iron"));
      $$0.put(3, new ajv("gold"));
      $$0.put(4, new ajv("emerald"));
      $$0.put(5, new ajv("diamond"));
   });
   private final Object2ObjectMap<cjs, gnf.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cjq, gnf.a> c = new Object2ObjectOpenHashMap();
   private final ate d;
   private final String e;

   public gkn(ghm<T, M> $$0, ate $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cjo $$10 = $$3.gy();
         cjs $$11 = $$10.a();
         cjq $$12 = $$10.b();
         gnf.a $$13 = this.a(this.b, "type", kt.y, $$11);
         gnf.a $$14 = this.a(this.c, "profession", kt.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gnf.a.a || $$14 == gnf.a.b && $$13 != gnf.a.c);
         ajv $$16 = this.a("type", kt.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cjq.b && !$$3.p_()) {
            ajv $$17 = this.a("profession", kt.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cjq.m) {
               ajv $$18 = this.a("profession_level", (ajv)a.get(axm.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ajv a(String $$0, ajv $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gnf.a a(Object2ObjectMap<K, gnf.a> $$0, String $$1, ii<K> $$2, K $$3) {
      return (gnf.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gnf.a).map(gnf::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gnf.a.a));
   }
}
