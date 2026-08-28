import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gxa<S extends gzh & har, M extends gby<S> & gej> extends gwq<S, M> {
   private static final Int2ObjectMap<aku> a = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aku.b("stone"));
      $$0.put(2, aku.b("iron"));
      $$0.put(3, aku.b("gold"));
      $$0.put(4, aku.b("emerald"));
      $$0.put(5, aku.b("diamond"));
   });
   private final Object2ObjectMap<col, hgb.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<coj, hgb.a> c = new Object2ObjectOpenHashMap();
   private final auo d;
   private final String e;

   public gxa(gty<S, M> $$0, auo $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(ffs $$0, glv $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         coh $$6 = $$3.a();
         col $$7 = $$6.a();
         coj $$8 = $$6.b();
         hgb.a $$9 = this.a(this.b, "type", mb.w, $$7);
         hgb.a $$10 = this.a(this.c, "profession", mb.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hgb.a.a || $$10 == hgb.a.b && $$9 != hgb.a.c);
         aku $$12 = this.a("type", mb.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != coj.b && !$$3.aj) {
            aku $$13 = this.a("profession", mb.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != coj.m) {
               aku $$14 = this.a("profession_level", (aku)a.get(ayy.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private aku a(String $$0, aku $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hgb.a a(Object2ObjectMap<K, hgb.a> $$0, String $$1, jm<K> $$2, K $$3) {
      return (hgb.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hgb.b).map(hgb::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hgb.a.a));
   }
}
