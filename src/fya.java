import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fya<T extends bjg & cbj, M extends ffd<T> & fhn> extends fxp<T, M> {
   private static final Int2ObjectMap<aew> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aew("stone"));
      $$0.put(2, new aew("iron"));
      $$0.put(3, new aew("gold"));
      $$0.put(4, new aew("emerald"));
      $$0.put(5, new aew("diamond"));
   });
   private final Object2ObjectMap<cbm, gas.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbk, gas.a> c = new Object2ObjectOpenHashMap();
   private final ant d;
   private final String e;

   public fya(fvc<T, M> $$0, ant $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cbi $$10 = $$3.go();
         cbm $$11 = $$10.a();
         cbk $$12 = $$10.b();
         gas.a $$13 = this.a(this.b, "type", jb.z, $$11);
         gas.a $$14 = this.a(this.c, "profession", jb.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gas.a.a || $$14 == gas.a.b && $$13 != gas.a.c);
         aew $$16 = this.a("type", jb.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbk.b && !$$3.m_()) {
            aew $$17 = this.a("profession", jb.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbk.m) {
               aew $$18 = this.a("profession_level", (aew)a.get(arw.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aew a(String $$0, aew $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gas.a a(Object2ObjectMap<K, gas.a> $$0, String $$1, gz<K> $$2, K $$3) {
      return (gas.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gas.a).map(gas::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gas.a.a));
   }
}
