import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gnw<T extends btr & cmo, M extends fuc<T> & fwm> extends gnl<T, M> {
   private static final Int2ObjectMap<alf> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new alf("stone"));
      $$0.put(2, new alf("iron"));
      $$0.put(3, new alf("gold"));
      $$0.put(4, new alf("emerald"));
      $$0.put(5, new alf("diamond"));
   });
   private final Object2ObjectMap<cmr, gqp.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cmp, gqp.a> c = new Object2ObjectOpenHashMap();
   private final aup d;
   private final String e;

   public gnw(gkv<T, M> $$0, aup $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         cmn $$10 = $$3.gB();
         cmr $$11 = $$10.a();
         cmp $$12 = $$10.b();
         gqp.a $$13 = this.a(this.b, "type", lp.y, $$11);
         gqp.a $$14 = this.a(this.c, "profession", lp.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gqp.a.a || $$14 == gqp.a.b && $$13 != gqp.a.c);
         alf $$16 = this.a("type", lp.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cmp.b && !$$3.p_()) {
            alf $$17 = this.a("profession", lp.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cmp.m) {
               alf $$18 = this.a("profession_level", (alf)a.get(ayz.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private alf a(String $$0, alf $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gqp.a a(Object2ObjectMap<K, gqp.a> $$0, String $$1, jd<K> $$2, K $$3) {
      return (gqp.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gqp.a).map(gqp::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gqp.a.a));
   }
}
