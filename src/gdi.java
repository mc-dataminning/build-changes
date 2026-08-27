import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gdi<T extends bmk & cew, M extends fjw<T> & fmg> extends gcx<T, M> {
   private static final Int2ObjectMap<ahg> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ahg("stone"));
      $$0.put(2, new ahg("iron"));
      $$0.put(3, new ahg("gold"));
      $$0.put(4, new ahg("emerald"));
      $$0.put(5, new ahg("diamond"));
   });
   private final Object2ObjectMap<cez, gfz.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cex, gfz.a> c = new Object2ObjectOpenHashMap();
   private final aqh d;
   private final String e;

   public gdi(gah<T, M> $$0, aqh $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(eqa $$0, ftg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cev $$10 = $$3.gp();
         cez $$11 = $$10.a();
         cex $$12 = $$10.b();
         gfz.a $$13 = this.a(this.b, "type", kd.y, $$11);
         gfz.a $$14 = this.a(this.c, "profession", kd.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gfz.a.a || $$14 == gfz.a.b && $$13 != gfz.a.c);
         ahg $$16 = this.a("type", kd.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cex.b && !$$3.o_()) {
            ahg $$17 = this.a("profession", kd.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cex.m) {
               ahg $$18 = this.a("profession_level", (ahg)a.get(aun.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ahg a(String $$0, ahg $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gfz.a a(Object2ObjectMap<K, gfz.a> $$0, String $$1, ib<K> $$2, K $$3) {
      return (gfz.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gfz.a).map(gfz::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gfz.a.a));
   }
}
