import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gck<T extends blv & ceg, M extends fiy<T> & fli> extends gbz<T, M> {
   private static final Int2ObjectMap<agt> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new agt("stone"));
      $$0.put(2, new agt("iron"));
      $$0.put(3, new agt("gold"));
      $$0.put(4, new agt("emerald"));
      $$0.put(5, new agt("diamond"));
   });
   private final Object2ObjectMap<cej, gfc.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<ceh, gfc.a> c = new Object2ObjectOpenHashMap();
   private final aps d;
   private final String e;

   public gck(fzj<T, M> $$0, aps $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cef $$10 = $$3.gp();
         cej $$11 = $$10.a();
         ceh $$12 = $$10.b();
         gfc.a $$13 = this.a(this.b, "type", kb.y, $$11);
         gfc.a $$14 = this.a(this.c, "profession", kb.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gfc.a.a || $$14 == gfc.a.b && $$13 != gfc.a.c);
         agt $$16 = this.a("type", kb.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != ceh.b && !$$3.o_()) {
            agt $$17 = this.a("profession", kb.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != ceh.m) {
               agt $$18 = this.a("profession_level", (agt)a.get(aty.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private agt a(String $$0, agt $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gfc.a a(Object2ObjectMap<K, gfc.a> $$0, String $$1, hz<K> $$2, K $$3) {
      return (gfc.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gfc.a).map(gfc::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gfc.a.a));
   }
}
