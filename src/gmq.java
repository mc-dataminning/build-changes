import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gmq<T extends bsq & cln, M extends fsw<T> & fvg> extends gmf<T, M> {
   private static final Int2ObjectMap<akn> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new akn("stone"));
      $$0.put(2, new akn("iron"));
      $$0.put(3, new akn("gold"));
      $$0.put(4, new akn("emerald"));
      $$0.put(5, new akn("diamond"));
   });
   private final Object2ObjectMap<clq, gpj.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<clo, gpj.a> c = new Object2ObjectOpenHashMap();
   private final atx d;
   private final String e;

   public gmq(gjp<T, M> $$0, atx $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(eyu $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         clm $$10 = $$3.gA();
         clq $$11 = $$10.a();
         clo $$12 = $$10.b();
         gpj.a $$13 = this.a(this.b, "type", le.y, $$11);
         gpj.a $$14 = this.a(this.c, "profession", le.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gpj.a.a || $$14 == gpj.a.b && $$13 != gpj.a.c);
         akn $$16 = this.a("type", le.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != clo.b && !$$3.p_()) {
            akn $$17 = this.a("profession", le.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != clo.m) {
               akn $$18 = this.a("profession_level", (akn)a.get(ayf.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private akn a(String $$0, akn $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gpj.a a(Object2ObjectMap<K, gpj.a> $$0, String $$1, is<K> $$2, K $$3) {
      return (gpj.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gpj.a).map(gpj::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gpj.a.a));
   }
}
