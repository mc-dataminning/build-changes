import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class glt<T extends bsa & ckw, M extends fsb<T> & ful> extends gli<T, M> {
   private static final Int2ObjectMap<akh> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new akh("stone"));
      $$0.put(2, new akh("iron"));
      $$0.put(3, new akh("gold"));
      $$0.put(4, new akh("emerald"));
      $$0.put(5, new akh("diamond"));
   });
   private final Object2ObjectMap<ckz, gom.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<ckx, gom.a> c = new Object2ObjectOpenHashMap();
   private final atr d;
   private final String e;

   public glt(gis<T, M> $$0, atr $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf()) {
         ckv $$10 = $$3.gA();
         ckz $$11 = $$10.a();
         ckx $$12 = $$10.b();
         gom.a $$13 = this.a(this.b, "type", ld.y, $$11);
         gom.a $$14 = this.a(this.c, "profession", ld.z, $$12);
         M $$15 = this.c();
         $$15.a($$14 == gom.a.a || $$14 == gom.a.b && $$13 != gom.a.c);
         akh $$16 = this.a("type", ld.y.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != ckx.b && !$$3.p_()) {
            akh $$17 = this.a("profession", ld.z.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != ckx.m) {
               akh $$18 = this.a("profession_level", (akh)a.get(axz.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private akh a(String $$0, akh $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gom.a a(Object2ObjectMap<K, gom.a> $$0, String $$1, ir<K> $$2, K $$3) {
      return (gom.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gom.a).map(gom::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gom.a.a));
   }
}
