import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gdb<T extends bmf & ceq, M extends fjp<T> & flz> extends gcq<T, M> {
   private static final Int2ObjectMap<ahd> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new ahd("stone"));
      $$0.put(2, new ahd("iron"));
      $$0.put(3, new ahd("gold"));
      $$0.put(4, new ahd("emerald"));
      $$0.put(5, new ahd("diamond"));
   });
   private final Object2ObjectMap<cet, gft.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cer, gft.a> c = new Object2ObjectOpenHashMap();
   private final aqc d;
   private final String e;

   public gdb(gaa<T, M> $$0, aqc $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cep $$10 = $$3.gp();
         cet $$11 = $$10.a();
         cer $$12 = $$10.b();
         gft.a $$13 = this.a(this.b, "type", kd.y, $$11);
         gft.a $$14 = this.a(this.c, "profession", kd.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gft.a.a || $$14 == gft.a.b && $$13 != gft.a.c);
         ahd $$16 = this.a("type", kd.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cer.b && !$$3.o_()) {
            ahd $$17 = this.a("profession", kd.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cer.m) {
               ahd $$18 = this.a("profession_level", (ahd)a.get(aui.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ahd a(String $$0, ahd $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gft.a a(Object2ObjectMap<K, gft.a> $$0, String $$1, ib<K> $$2, K $$3) {
      return (gft.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gft.a).map(gft::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gft.a.a));
   }
}
