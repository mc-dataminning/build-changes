import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fyw<T extends bkj & ccm, M extends ffx<T> & fih> extends fyl<T, M> {
   private static final Int2ObjectMap<afw> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new afw("stone"));
      $$0.put(2, new afw("iron"));
      $$0.put(3, new afw("gold"));
      $$0.put(4, new afw("emerald"));
      $$0.put(5, new afw("diamond"));
   });
   private final Object2ObjectMap<ccp, gbo.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<ccn, gbo.a> c = new Object2ObjectOpenHashMap();
   private final aot d;
   private final String e;

   public fyw(fvy<T, M> $$0, aot $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         ccl $$10 = $$3.gp();
         ccp $$11 = $$10.a();
         ccn $$12 = $$10.b();
         gbo.a $$13 = this.a(this.b, "type", jy.z, $$11);
         gbo.a $$14 = this.a(this.c, "profession", jy.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gbo.a.a || $$14 == gbo.a.b && $$13 != gbo.a.c);
         afw $$16 = this.a("type", jy.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != ccn.b && !$$3.n_()) {
            afw $$17 = this.a("profession", jy.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != ccn.m) {
               afw $$18 = this.a("profession_level", (afw)a.get(asy.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private afw a(String $$0, afw $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gbo.a a(Object2ObjectMap<K, gbo.a> $$0, String $$1, hw<K> $$2, K $$3) {
      return (gbo.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gbo.a).map(gbo::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gbo.a.a));
   }
}
