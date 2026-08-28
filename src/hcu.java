import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hcu<S extends hfe & hgo, M extends ghn<S> & gjz> extends hcj<S, M> {
   private static final Int2ObjectMap<alr> a = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alr.b("stone"));
      $$0.put(2, alr.b("iron"));
      $$0.put(3, alr.b("gold"));
      $$0.put(4, alr.b("emerald"));
      $$0.put(5, alr.b("diamond"));
   });
   private final Object2ObjectMap<alq<crz>, hmf.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<alq<crx>, hmf.a> c = new Object2ObjectOpenHashMap();
   private final avo d;
   private final String e;

   public hcu(gzs<S, M> $$0, avo $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.A) {
         crv $$6 = $$3.a();
         if ($$6 != null) {
            jg<crz> $$7 = $$6.a();
            jg<crx> $$8 = $$6.b();
            hmf.a $$9 = this.a(this.b, "type", $$7);
            hmf.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hmf.a.a || $$10 == hmf.a.b && $$9 != hmf.a.c);
            alr $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(crx.b) && !$$3.am) {
               alr $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(crx.m)) {
                  alr $$14 = this.a("profession_level", (alr)a.get(azz.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private alr a(String $$0, alr $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private alr a(String $$0, jg<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hkf.c());
   }

   public <K> hmf.a a(Object2ObjectMap<alq<K>, hmf.a> $$0, String $$1, jg<K> $$2) {
      alq<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hmf.a.a : (hmf.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hmf.b).map(hmf::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hmf.a.a));
   }
}
