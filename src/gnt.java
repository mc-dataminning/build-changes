import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gnt<T extends bto & cml, M extends ftz<T> & fwj> extends gni<T, M> {
   private static final Int2ObjectMap<ale> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ale("stone"));
      $$0.put(2, new ale("iron"));
      $$0.put(3, new ale("gold"));
      $$0.put(4, new ale("emerald"));
      $$0.put(5, new ale("diamond"));
   });
   private final Object2ObjectMap<cmo, gqm.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cmm, gqm.a> c = new Object2ObjectOpenHashMap();
   private final auo d;
   private final String e;

   public gnt(gks<T, M> $$0, auo $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         cmk $$10 = $$3.gB();
         cmo $$11 = $$10.a();
         cmm $$12 = $$10.b();
         gqm.a $$13 = this.a(this.b, "type", lp.y, $$11);
         gqm.a $$14 = this.a(this.c, "profession", lp.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gqm.a.a || $$14 == gqm.a.b && $$13 != gqm.a.c);
         ale $$16 = this.a("type", lp.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cmm.b && !$$3.p_()) {
            ale $$17 = this.a("profession", lp.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cmm.m) {
               ale $$18 = this.a("profession_level", (ale)a.get(ayy.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ale a(String $$0, ale $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gqm.a a(Object2ObjectMap<K, gqm.a> $$0, String $$1, jd<K> $$2, K $$3) {
      return (gqm.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gqm.a).map(gqm::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gqm.a.a));
   }
}
