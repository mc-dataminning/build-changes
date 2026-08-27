import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gdw<T extends bmo & cff, M extends fkj<T> & fmt> extends gdl<T, M> {
   private static final Int2ObjectMap<ahh> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ahh("stone"));
      $$0.put(2, new ahh("iron"));
      $$0.put(3, new ahh("gold"));
      $$0.put(4, new ahh("emerald"));
      $$0.put(5, new ahh("diamond"));
   });
   private final Object2ObjectMap<cfi, ggo.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cfg, ggo.a> c = new Object2ObjectOpenHashMap();
   private final aqj d;
   private final String e;

   public gdw(gav<T, M> $$0, aqj $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cfe $$10 = $$3.gq();
         cfi $$11 = $$10.a();
         cfg $$12 = $$10.b();
         ggo.a $$13 = this.a(this.b, "type", kd.y, $$11);
         ggo.a $$14 = this.a(this.c, "profession", kd.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == ggo.a.a || $$14 == ggo.a.b && $$13 != ggo.a.c);
         ahh $$16 = this.a("type", kd.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cfg.b && !$$3.o_()) {
            ahh $$17 = this.a("profession", kd.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cfg.m) {
               ahh $$18 = this.a("profession_level", (ahh)a.get(aup.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ahh a(String $$0, ahh $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> ggo.a a(Object2ObjectMap<K, ggo.a> $$0, String $$1, ib<K> $$2, K $$3) {
      return (ggo.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(ggo.a).map(ggo::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(ggo.a.a));
   }
}
