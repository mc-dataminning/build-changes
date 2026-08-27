import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gav<T extends bll & cdo, M extends fhu<T> & fke> extends gak<T, M> {
   private static final Int2ObjectMap<agm> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new agm("stone"));
      $$0.put(2, new agm("iron"));
      $$0.put(3, new agm("gold"));
      $$0.put(4, new agm("emerald"));
      $$0.put(5, new agm("diamond"));
   });
   private final Object2ObjectMap<cdr, gdn.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cdp, gdn.a> c = new Object2ObjectOpenHashMap();
   private final apl d;
   private final String e;

   public gav(fxx<T, M> $$0, apl $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cdn $$10 = $$3.gq();
         cdr $$11 = $$10.a();
         cdp $$12 = $$10.b();
         gdn.a $$13 = this.a(this.b, "type", kc.z, $$11);
         gdn.a $$14 = this.a(this.c, "profession", kc.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gdn.a.a || $$14 == gdn.a.b && $$13 != gdn.a.c);
         agm $$16 = this.a("type", kc.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cdp.b && !$$3.o_()) {
            agm $$17 = this.a("profession", kc.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cdp.m) {
               agm $$18 = this.a("profession_level", (agm)a.get(atq.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private agm a(String $$0, agm $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gdn.a a(Object2ObjectMap<K, gdn.a> $$0, String $$1, ia<K> $$2, K $$3) {
      return (gdn.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gdn.a).map(gdn::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gdn.a.a));
   }
}
