import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class ghu<T extends bpo & cih, M extends foc<T> & fqn> extends ghj<T, M> {
   private static final Int2ObjectMap<ajh> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ajh("stone"));
      $$0.put(2, new ajh("iron"));
      $$0.put(3, new ajh("gold"));
      $$0.put(4, new ajh("emerald"));
      $$0.put(5, new ajh("diamond"));
   });
   private final Object2ObjectMap<cik, gkm.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cii, gkm.a> c = new Object2ObjectOpenHashMap();
   private final aso d;
   private final String e;

   public ghu(get<T, M> $$0, aso $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cig $$10 = $$3.gy();
         cik $$11 = $$10.a();
         cii $$12 = $$10.b();
         gkm.a $$13 = this.a(this.b, "type", ki.y, $$11);
         gkm.a $$14 = this.a(this.c, "profession", ki.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gkm.a.a || $$14 == gkm.a.b && $$13 != gkm.a.c);
         ajh $$16 = this.a("type", ki.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cii.b && !$$3.o_()) {
            ajh $$17 = this.a("profession", ki.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cii.m) {
               ajh $$18 = this.a("profession_level", (ajh)a.get(aww.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ajh a(String $$0, ajh $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gkm.a a(Object2ObjectMap<K, gkm.a> $$0, String $$1, ig<K> $$2, K $$3) {
      return (gkm.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gkm.a).map(gkm::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gkm.a.a));
   }
}
