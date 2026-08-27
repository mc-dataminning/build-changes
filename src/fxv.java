import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fxv<T extends bjb & cbe, M extends fey<T> & fhi> extends fxk<T, M> {
   private static final Int2ObjectMap<aeu> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aeu("stone"));
      $$0.put(2, new aeu("iron"));
      $$0.put(3, new aeu("gold"));
      $$0.put(4, new aeu("emerald"));
      $$0.put(5, new aeu("diamond"));
   });
   private final Object2ObjectMap<cbh, gan.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbf, gan.a> c = new Object2ObjectOpenHashMap();
   private final anp d;
   private final String e;

   public fxv(fux<T, M> $$0, anp $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elk $$0, fnz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cbd $$10 = $$3.gl();
         cbh $$11 = $$10.a();
         cbf $$12 = $$10.b();
         gan.a $$13 = this.a(this.b, "type", jd.z, $$11);
         gan.a $$14 = this.a(this.c, "profession", jd.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gan.a.a || $$14 == gan.a.b && $$13 != gan.a.c);
         aeu $$16 = this.a("type", jd.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbf.b && !$$3.i_()) {
            aeu $$17 = this.a("profession", jd.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbf.m) {
               aeu $$18 = this.a("profession_level", (aeu)a.get(ars.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aeu a(String $$0, aeu $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gan.a a(Object2ObjectMap<K, gan.a> $$0, String $$1, hb<K> $$2, K $$3) {
      return (gan.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gan.a).map(gan::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gan.a.a));
   }
}
