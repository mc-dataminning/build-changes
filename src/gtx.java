import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gtx<S extends gwb & gxl, M extends fza<S> & gbl> extends gtn<S, M> {
   private static final Int2ObjectMap<all> a = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, all.b("stone"));
      $$0.put(2, all.b("iron"));
      $$0.put(3, all.b("gold"));
      $$0.put(4, all.b("emerald"));
      $$0.put(5, all.b("diamond"));
   });
   private final Object2ObjectMap<coh, hai.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cof, hai.a> c = new Object2ObjectOpenHashMap();
   private final ave d;
   private final String e;

   public gtx(gqw<S, M> $$0, ave $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cod $$6 = $$3.a();
         coh $$7 = $$6.a();
         cof $$8 = $$6.b();
         hai.a $$9 = this.a(this.b, "type", lz.w, $$7);
         hai.a $$10 = this.a(this.c, "profession", lz.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hai.a.a || $$10 == hai.a.b && $$9 != hai.a.c);
         all $$12 = this.a("type", lz.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cof.b && !$$3.ae) {
            all $$13 = this.a("profession", lz.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cof.m) {
               all $$14 = this.a("profession_level", (all)a.get(azn.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private all a(String $$0, all $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hai.a a(Object2ObjectMap<K, hai.a> $$0, String $$1, jl<K> $$2, K $$3) {
      return (hai.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hai.a).map(hai::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hai.a.a));
   }
}
