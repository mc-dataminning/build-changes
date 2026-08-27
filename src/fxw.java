import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fxw<T extends bjm & cbp, M extends fey<T> & fhi> extends fxl<T, M> {
   private static final Int2ObjectMap<aez> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aez("stone"));
      $$0.put(2, new aez("iron"));
      $$0.put(3, new aez("gold"));
      $$0.put(4, new aez("emerald"));
      $$0.put(5, new aez("diamond"));
   });
   private final Object2ObjectMap<cbs, gao.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbq, gao.a> c = new Object2ObjectOpenHashMap();
   private final anw d;
   private final String e;

   public fxw(fuy<T, M> $$0, anw $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cbo $$10 = $$3.gp();
         cbs $$11 = $$10.a();
         cbq $$12 = $$10.b();
         gao.a $$13 = this.a(this.b, "type", jb.z, $$11);
         gao.a $$14 = this.a(this.c, "profession", jb.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gao.a.a || $$14 == gao.a.b && $$13 != gao.a.c);
         aez $$16 = this.a("type", jb.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbq.b && !$$3.m_()) {
            aez $$17 = this.a("profession", jb.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbq.m) {
               aez $$18 = this.a("profession_level", (aez)a.get(asb.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aez a(String $$0, aez $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gao.a a(Object2ObjectMap<K, gao.a> $$0, String $$1, gz<K> $$2, K $$3) {
      return (gao.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gao.a).map(gao::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gao.a.a));
   }
}
