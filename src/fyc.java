import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fyc<T extends bji & cbl, M extends fff<T> & fhp> extends fxr<T, M> {
   private static final Int2ObjectMap<aey> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aey("stone"));
      $$0.put(2, new aey("iron"));
      $$0.put(3, new aey("gold"));
      $$0.put(4, new aey("emerald"));
      $$0.put(5, new aey("diamond"));
   });
   private final Object2ObjectMap<cbo, gau.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbm, gau.a> c = new Object2ObjectOpenHashMap();
   private final anv d;
   private final String e;

   public fyc(fve<T, M> $$0, anv $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cbk $$10 = $$3.go();
         cbo $$11 = $$10.a();
         cbm $$12 = $$10.b();
         gau.a $$13 = this.a(this.b, "type", jd.z, $$11);
         gau.a $$14 = this.a(this.c, "profession", jd.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gau.a.a || $$14 == gau.a.b && $$13 != gau.a.c);
         aey $$16 = this.a("type", jd.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbm.b && !$$3.m_()) {
            aey $$17 = this.a("profession", jd.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbm.m) {
               aey $$18 = this.a("profession_level", (aey)a.get(ary.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aey a(String $$0, aey $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gau.a a(Object2ObjectMap<K, gau.a> $$0, String $$1, hb<K> $$2, K $$3) {
      return (gau.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gau.a).map(gau::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gau.a.a));
   }
}
