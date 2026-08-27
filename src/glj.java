import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class glj<T extends bre & cka, M extends frr<T> & fub> extends gky<T, M> {
   private static final Int2ObjectMap<akf> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new akf("stone"));
      $$0.put(2, new akf("iron"));
      $$0.put(3, new akf("gold"));
      $$0.put(4, new akf("emerald"));
      $$0.put(5, new akf("diamond"));
   });
   private final Object2ObjectMap<ckd, gob.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<ckb, gob.a> c = new Object2ObjectOpenHashMap();
   private final ato d;
   private final String e;

   public glj(gii<T, M> $$0, ato $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf()) {
         cjz $$10 = $$3.gA();
         ckd $$11 = $$10.a();
         ckb $$12 = $$10.b();
         gob.a $$13 = this.a(this.b, "type", lc.y, $$11);
         gob.a $$14 = this.a(this.c, "profession", lc.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gob.a.a || $$14 == gob.a.b && $$13 != gob.a.c);
         akf $$16 = this.a("type", lc.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != ckb.b && !$$3.p_()) {
            akf $$17 = this.a("profession", lc.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != ckb.m) {
               akf $$18 = this.a("profession_level", (akf)a.get(axw.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private akf a(String $$0, akf $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gob.a a(Object2ObjectMap<K, gob.a> $$0, String $$1, iq<K> $$2, K $$3) {
      return (gob.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gob.a).map(gob::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gob.a.a));
   }
}
