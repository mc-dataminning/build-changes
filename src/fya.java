import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fya<T extends bjg & cbj, M extends ffd<T> & fhn> extends fxp<T, M> {
   private static final Int2ObjectMap<aex> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aex("stone"));
      $$0.put(2, new aex("iron"));
      $$0.put(3, new aex("gold"));
      $$0.put(4, new aex("emerald"));
      $$0.put(5, new aex("diamond"));
   });
   private final Object2ObjectMap<cbm, gas.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbk, gas.a> c = new Object2ObjectOpenHashMap();
   private final anu d;
   private final String e;

   public fya(fvc<T, M> $$0, anu $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cbi $$10 = $$3.go();
         cbm $$11 = $$10.a();
         cbk $$12 = $$10.b();
         gas.a $$13 = this.a(this.b, "type", jd.z, $$11);
         gas.a $$14 = this.a(this.c, "profession", jd.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gas.a.a || $$14 == gas.a.b && $$13 != gas.a.c);
         aex $$16 = this.a("type", jd.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbk.b && !$$3.m_()) {
            aex $$17 = this.a("profession", jd.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbk.m) {
               aex $$18 = this.a("profession_level", (aex)a.get(arx.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aex a(String $$0, aex $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gas.a a(Object2ObjectMap<K, gas.a> $$0, String $$1, hb<K> $$2, K $$3) {
      return (gas.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gas.a).map(gas::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gas.a.a));
   }
}
