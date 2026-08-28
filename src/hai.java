import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hai<S extends hcp & hdy, M extends gfd<S> & ghp> extends gzy<S, M> {
   private static final Int2ObjectMap<ale> a = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ale.b("stone"));
      $$0.put(2, ale.b("iron"));
      $$0.put(3, ale.b("gold"));
      $$0.put(4, ale.b("emerald"));
      $$0.put(5, ale.b("diamond"));
   });
   private final Object2ObjectMap<ald<cqj>, hjn.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<ald<cqh>, hjn.a> c = new Object2ObjectOpenHashMap();
   private final avb d;
   private final String e;

   public hai(gxh<S, M> $$0, avb $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fiq $$0, gpd $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         cqf $$6 = $$3.a();
         if ($$6 != null) {
            je<cqj> $$7 = $$6.a();
            je<cqh> $$8 = $$6.b();
            hjn.a $$9 = this.a(this.b, "type", $$7);
            hjn.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hjn.a.a || $$10 == hjn.a.b && $$9 != hjn.a.c);
            ale $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(cqh.b) && !$$3.aj) {
               ale $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(cqh.m)) {
                  ale $$14 = this.a("profession_level", (ale)a.get(azk.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private ale a(String $$0, ale $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private ale a(String $$0, je<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hho.c());
   }

   public <K> hjn.a a(Object2ObjectMap<ald<K>, hjn.a> $$0, String $$1, je<K> $$2) {
      ald<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hjn.a.a : (hjn.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hjn.b).map(hjn::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hjn.a.a));
   }
}
