import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gwk<S extends gyo & gzy, M extends gbh<S> & gds> extends gwa<S, M> {
   private static final Int2ObjectMap<alp> a = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alp.b("stone"));
      $$0.put(2, alp.b("iron"));
      $$0.put(3, alp.b("gold"));
      $$0.put(4, alp.b("emerald"));
      $$0.put(5, alp.b("diamond"));
   });
   private final Object2ObjectMap<cpf, hcv.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cpd, hcv.a> c = new Object2ObjectOpenHashMap();
   private final avl d;
   private final String e;

   public gwk(gti<S, M> $$0, avl $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cpb $$6 = $$3.a();
         cpf $$7 = $$6.a();
         cpd $$8 = $$6.b();
         hcv.a $$9 = this.a(this.b, "type", ma.w, $$7);
         hcv.a $$10 = this.a(this.c, "profession", ma.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hcv.a.a || $$10 == hcv.a.b && $$9 != hcv.a.c);
         alp $$12 = this.a("type", ma.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != cpd.b && !$$3.ae) {
            alp $$13 = this.a("profession", ma.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != cpd.m) {
               alp $$14 = this.a("profession_level", (alp)a.get(azu.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alp a(String $$0, alp $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hcv.a a(Object2ObjectMap<K, hcv.a> $$0, String $$1, jl<K> $$2, K $$3) {
      return (hcv.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hcv.a).map(hcv::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hcv.a.a));
   }
}
