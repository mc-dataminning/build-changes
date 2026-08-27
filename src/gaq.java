import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gaq<T extends blg & cdj, M extends fhp<T> & fjz> extends gaf<T, M> {
   private static final Int2ObjectMap<agi> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new agi("stone"));
      $$0.put(2, new agi("iron"));
      $$0.put(3, new agi("gold"));
      $$0.put(4, new agi("emerald"));
      $$0.put(5, new agi("diamond"));
   });
   private final Object2ObjectMap<cdm, gdi.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cdk, gdi.a> c = new Object2ObjectOpenHashMap();
   private final aph d;
   private final String e;

   public gaq(fxs<T, M> $$0, aph $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cdi $$10 = $$3.gq();
         cdm $$11 = $$10.a();
         cdk $$12 = $$10.b();
         gdi.a $$13 = this.a(this.b, "type", jy.z, $$11);
         gdi.a $$14 = this.a(this.c, "profession", jy.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gdi.a.a || $$14 == gdi.a.b && $$13 != gdi.a.c);
         agi $$16 = this.a("type", jy.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cdk.b && !$$3.n_()) {
            agi $$17 = this.a("profession", jy.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cdk.m) {
               agi $$18 = this.a("profession_level", (agi)a.get(atm.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private agi a(String $$0, agi $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gdi.a a(Object2ObjectMap<K, gdi.a> $$0, String $$1, hw<K> $$2, K $$3) {
      return (gdi.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gdi.a).map(gdi::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gdi.a.a));
   }
}
