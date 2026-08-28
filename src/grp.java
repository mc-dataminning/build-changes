import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class grp<S extends gts & gvc, M extends fxa<S> & fzk> extends grf<S, M> {
   private static final Int2ObjectMap<alb> a = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alb.b("stone"));
      $$0.put(2, alb.b("iron"));
      $$0.put(3, alb.b("gold"));
      $$0.put(4, alb.b("emerald"));
      $$0.put(5, alb.b("diamond"));
   });
   private final Object2ObjectMap<cnh, gxz.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cnf, gxz.a> c = new Object2ObjectOpenHashMap();
   private final aus d;
   private final String e;

   public grp(goo<S, M> $$0, aus $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cnd $$6 = $$3.a();
         cnh $$7 = $$6.a();
         cnf $$8 = $$6.b();
         gxz.a $$9 = this.a(this.b, "type", lu.w, $$7);
         gxz.a $$10 = this.a(this.c, "profession", lu.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == gxz.a.a || $$10 == gxz.a.b && $$9 != gxz.a.c);
         alb $$12 = this.a("type", lu.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cnf.b && !$$3.ae) {
            alb $$13 = this.a("profession", lu.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cnf.m) {
               alb $$14 = this.a("profession_level", (alb)a.get(azc.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alb a(String $$0, alb $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gxz.a a(Object2ObjectMap<K, gxz.a> $$0, String $$1, ji<K> $$2, K $$3) {
      return (gxz.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gxz.a).map(gxz::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gxz.a.a));
   }
}
