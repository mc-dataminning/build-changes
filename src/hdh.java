import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hdh<S extends hfp & hgy, M extends gia<S> & gkm> extends hcw<S, M> {
   private static final Int2ObjectMap<ali> a = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ali.b("stone"));
      $$0.put(2, ali.b("iron"));
      $$0.put(3, ali.b("gold"));
      $$0.put(4, ali.b("emerald"));
      $$0.put(5, ali.b("diamond"));
   });
   private final Object2ObjectMap<alh<cro>, hmp.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<alh<crm>, hmp.a> c = new Object2ObjectOpenHashMap();
   private final avf d;
   private final String e;

   public hdh(haf<S, M> $$0, avf $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(flo $$0, gsa $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         crk $$6 = $$3.a();
         if ($$6 != null) {
            jf<cro> $$7 = $$6.a();
            jf<crm> $$8 = $$6.b();
            hmp.a $$9 = this.a(this.b, "type", $$7);
            hmp.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hmp.a.a || $$10 == hmp.a.b && $$9 != hmp.a.c);
            ali $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(crm.b) && !$$3.aj) {
               ali $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(crm.m)) {
                  ali $$14 = this.a("profession_level", (ali)a.get(azo.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private ali a(String $$0, ali $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private ali a(String $$0, jf<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hkp.c());
   }

   public <K> hmp.a a(Object2ObjectMap<alh<K>, hmp.a> $$0, String $$1, jf<K> $$2) {
      alh<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hmp.a.a : (hmp.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hmp.b).map(hmp::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hmp.a.a));
   }
}
