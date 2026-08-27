import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gke<T extends bqo & cji, M extends fqm<T> & fsw> extends gjt<T, M> {
   private static final Int2ObjectMap<ajt> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ajt("stone"));
      $$0.put(2, new ajt("iron"));
      $$0.put(3, new ajt("gold"));
      $$0.put(4, new ajt("emerald"));
      $$0.put(5, new ajt("diamond"));
   });
   private final Object2ObjectMap<cjl, gmw.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cjj, gmw.a> c = new Object2ObjectOpenHashMap();
   private final atc d;
   private final String e;

   public gke(ghd<T, M> $$0, atc $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cjh $$10 = $$3.gy();
         cjl $$11 = $$10.a();
         cjj $$12 = $$10.b();
         gmw.a $$13 = this.a(this.b, "type", kr.y, $$11);
         gmw.a $$14 = this.a(this.c, "profession", kr.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gmw.a.a || $$14 == gmw.a.b && $$13 != gmw.a.c);
         ajt $$16 = this.a("type", kr.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cjj.b && !$$3.p_()) {
            ajt $$17 = this.a("profession", kr.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cjj.m) {
               ajt $$18 = this.a("profession_level", (ajt)a.get(axk.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ajt a(String $$0, ajt $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gmw.a a(Object2ObjectMap<K, gmw.a> $$0, String $$1, ig<K> $$2, K $$3) {
      return (gmw.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gmw.a).map(gmw::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gmw.a.a));
   }
}
