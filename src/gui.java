import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gui<S extends gwm & gxw, M extends fzj<S> & gbu> extends gty<S, M> {
   private static final Int2ObjectMap<alj> a = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, alj.b("stone"));
      $$0.put(2, alj.b("iron"));
      $$0.put(3, alj.b("gold"));
      $$0.put(4, alj.b("emerald"));
      $$0.put(5, alj.b("diamond"));
   });
   private final Object2ObjectMap<cok, hat.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<coi, hat.a> c = new Object2ObjectOpenHashMap();
   private final avd d;
   private final String e;

   public gui(grh<S, M> $$0, avd $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         cog $$6 = $$3.a();
         cok $$7 = $$6.a();
         coi $$8 = $$6.b();
         hat.a $$9 = this.a(this.b, "type", lz.w, $$7);
         hat.a $$10 = this.a(this.c, "profession", lz.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hat.a.a || $$10 == hat.a.b && $$9 != hat.a.c);
         alj $$12 = this.a("type", lz.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != coi.b && !$$3.ae) {
            alj $$13 = this.a("profession", lz.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != coi.m) {
               alj $$14 = this.a("profession_level", (alj)a.get(azm.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private alj a(String $$0, alj $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hat.a a(Object2ObjectMap<K, hat.a> $$0, String $$1, jl<K> $$2, K $$3) {
      return (hat.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hat.a).map(hat::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hat.a.a));
   }
}
