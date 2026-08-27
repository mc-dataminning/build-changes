import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gfp<T extends bog & cgw, M extends fmb<T> & fol> extends gfe<T, M> {
   private static final Int2ObjectMap<aiy> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aiy("stone"));
      $$0.put(2, new aiy("iron"));
      $$0.put(3, new aiy("gold"));
      $$0.put(4, new aiy("emerald"));
      $$0.put(5, new aiy("diamond"));
   });
   private final Object2ObjectMap<cgz, gih.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cgx, gih.a> c = new Object2ObjectOpenHashMap();
   private final asa d;
   private final String e;

   public gfp(gco<T, M> $$0, asa $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         cgv $$10 = $$3.gr();
         cgz $$11 = $$10.a();
         cgx $$12 = $$10.b();
         gih.a $$13 = this.a(this.b, "type", kf.y, $$11);
         gih.a $$14 = this.a(this.c, "profession", kf.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gih.a.a || $$14 == gih.a.b && $$13 != gih.a.c);
         aiy $$16 = this.a("type", kf.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cgx.b && !$$3.o_()) {
            aiy $$17 = this.a("profession", kf.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cgx.m) {
               aiy $$18 = this.a("profession_level", (aiy)a.get(awh.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aiy a(String $$0, aiy $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gih.a a(Object2ObjectMap<K, gih.a> $$0, String $$1, id<K> $$2, K $$3) {
      return (gih.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gih.a).map(gih::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gih.a.a));
   }
}
