import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fxc<T extends biw & cba, M extends fek<T> & fgu> extends fwr<T, M> {
   private static final Int2ObjectMap<aep> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aep("stone"));
      $$0.put(2, new aep("iron"));
      $$0.put(3, new aep("gold"));
      $$0.put(4, new aep("emerald"));
      $$0.put(5, new aep("diamond"));
   });
   private final Object2ObjectMap<cbd, fzu.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbb, fzu.a> c = new Object2ObjectOpenHashMap();
   private final ank d;
   private final String e;

   public fxc(fue<T, M> $$0, ank $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         caz $$10 = $$3.gk();
         cbd $$11 = $$10.a();
         cbb $$12 = $$10.b();
         fzu.a $$13 = this.a(this.b, "type", jc.z, $$11);
         fzu.a $$14 = this.a(this.c, "profession", jc.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == fzu.a.a || $$14 == fzu.a.b && $$13 != fzu.a.c);
         aep $$16 = this.a("type", jc.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbb.b && !$$3.i_()) {
            aep $$17 = this.a("profession", jc.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbb.m) {
               aep $$18 = this.a("profession_level", (aep)a.get(aro.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aep a(String $$0, aep $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> fzu.a a(Object2ObjectMap<K, fzu.a> $$0, String $$1, ha<K> $$2, K $$3) {
      return (fzu.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(fzu.a).map(fzu::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(fzu.a.a));
   }
}
