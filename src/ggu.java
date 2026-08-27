import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class ggu<T extends box & chp, M extends fne<T> & fpp> extends ggj<T, M> {
   private static final Int2ObjectMap<ajc> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ajc("stone"));
      $$0.put(2, new ajc("iron"));
      $$0.put(3, new ajc("gold"));
      $$0.put(4, new ajc("emerald"));
      $$0.put(5, new ajc("diamond"));
   });
   private final Object2ObjectMap<chs, gjm.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<chq, gjm.a> c = new Object2ObjectOpenHashMap();
   private final asf d;
   private final String e;

   public ggu(gdt<T, M> $$0, asf $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb()) {
         cho $$10 = $$3.gw();
         chs $$11 = $$10.a();
         chq $$12 = $$10.b();
         gjm.a $$13 = this.a(this.b, "type", kh.y, $$11);
         gjm.a $$14 = this.a(this.c, "profession", kh.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gjm.a.a || $$14 == gjm.a.b && $$13 != gjm.a.c);
         ajc $$16 = this.a("type", kh.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != chq.b && !$$3.o_()) {
            ajc $$17 = this.a("profession", kh.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != chq.m) {
               ajc $$18 = this.a("profession_level", (ajc)a.get(awm.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ajc a(String $$0, ajc $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gjm.a a(Object2ObjectMap<K, gjm.a> $$0, String $$1, ig<K> $$2, K $$3) {
      return (gjm.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gjm.a).map(gjm::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gjm.a.a));
   }
}
