import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gxe<S extends gzl & hav, M extends gcc<S> & gen> extends gwu<S, M> {
   private static final Int2ObjectMap<akv> a = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, akv.b("stone"));
      $$0.put(2, akv.b("iron"));
      $$0.put(3, akv.b("gold"));
      $$0.put(4, akv.b("emerald"));
      $$0.put(5, akv.b("diamond"));
   });
   private final Object2ObjectMap<cop, hgi.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<com, hgi.a> c = new Object2ObjectOpenHashMap();
   private final aup d;
   private final String e;

   public gxe(guc<S, M> $$0, aup $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(ffv $$0, glz $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z) {
         cok $$6 = $$3.a();
         cop $$7 = $$6.a();
         com $$8 = $$6.b();
         hgi.a $$9 = this.a(this.b, "type", mb.w, $$7);
         hgi.a $$10 = this.a(this.c, "profession", mb.x, $$8);
         M $$11 = this.d();
         $$11.a($$10 == hgi.a.a || $$10 == hgi.a.b && $$9 != hgi.a.c);
         akv $$12 = this.a("type", mb.w.b($$7));
         b($$11, $$12, $$0, $$1, $$2, $$3, -1);
         $$11.a(true);
         if ($$8 != com.b && !$$3.aj) {
            akv $$13 = this.a("profession", mb.x.b($$8));
            b($$11, $$13, $$0, $$1, $$2, $$3, -1);
            if ($$8 != com.m) {
               akv $$14 = this.a("profession_level", (akv)a.get(ayz.a($$6.c(), 1, a.size())));
               b($$11, $$14, $$0, $$1, $$2, $$3, -1);
            }
         }
      }
   }

   private akv a(String $$0, akv $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> hgi.a a(Object2ObjectMap<K, hgi.a> $$0, String $$1, jm<K> $$2, K $$3) {
      return (hgi.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(hgi.b).map(hgi::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(hgi.a.a));
   }
}
