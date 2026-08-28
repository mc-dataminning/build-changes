import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gpa<T extends btl & cmk, M extends fve<T> & fxo> extends gop<T, M> {
   private static final Int2ObjectMap<akq> a = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, akq.b("stone"));
      $$0.put(2, akq.b("iron"));
      $$0.put(3, akq.b("gold"));
      $$0.put(4, akq.b("emerald"));
      $$0.put(5, akq.b("diamond"));
   });
   private final Object2ObjectMap<cmn, grt.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cml, grt.a> c = new Object2ObjectOpenHashMap();
   private final aud d;
   private final String e;

   public gpa(glz<T, M> $$0, aud $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         cmj $$10 = $$3.gx();
         cmn $$11 = $$10.a();
         cml $$12 = $$10.b();
         grt.a $$13 = this.a(this.b, "type", lt.w, $$11);
         grt.a $$14 = this.a(this.c, "profession", lt.x, $$12);
         M $$15 = this.c();
         $$15.a($$14 == grt.a.a || $$14 == grt.a.b && $$13 != grt.a.c);
         akq $$16 = this.a("type", lt.w.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, -1);
         $$15.a(true);
         if ($$12 != cml.b && !$$3.o_()) {
            akq $$17 = this.a("profession", lt.x.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, -1);
            if ($$12 != cml.m) {
               akq $$18 = this.a("profession_level", (akq)a.get(ayn.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private akq a(String $$0, akq $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> grt.a a(Object2ObjectMap<K, grt.a> $$0, String $$1, jh<K> $$2, K $$3) {
      return (grt.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(grt.a).map(grt::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(grt.a.a));
   }
}
