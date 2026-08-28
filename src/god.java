import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class god<T extends bsy & clw, M extends fui<T> & fws> extends gns<T, M> {
   private static final Int2ObjectMap<akk> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new akk("stone"));
      $$0.put(2, new akk("iron"));
      $$0.put(3, new akk("gold"));
      $$0.put(4, new akk("emerald"));
      $$0.put(5, new akk("diamond"));
   });
   private final Object2ObjectMap<clz, gqw.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<clx, gqw.a> c = new Object2ObjectOpenHashMap();
   private final atu d;
   private final String e;

   public god(glc<T, M> $$0, atu $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         clv $$10 = $$3.gy();
         clz $$11 = $$10.a();
         clx $$12 = $$10.b();
         gqw.a $$13 = this.a(this.b, "type", lq.w, $$11);
         gqw.a $$14 = this.a(this.c, "profession", lq.x, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gqw.a.a || $$14 == gqw.a.b && $$13 != gqw.a.c);
         akk $$16 = this.a("type", lq.w.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != clx.b && !$$3.p_()) {
            akk $$17 = this.a("profession", lq.x.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != clx.m) {
               akk $$18 = this.a("profession_level", (akk)a.get(aye.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private akk a(String $$0, akk $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gqw.a a(Object2ObjectMap<K, gqw.a> $$0, String $$1, je<K> $$2, K $$3) {
      return (gqw.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gqw.a).map(gqw::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gqw.a.a));
   }
}
