import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class fxh<T extends biy & cbc, M extends feo<T> & fgy> extends fww<T, M> {
   private static final Int2ObjectMap<aer> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new aer("stone"));
      $$0.put(2, new aer("iron"));
      $$0.put(3, new aer("gold"));
      $$0.put(4, new aer("emerald"));
      $$0.put(5, new aer("diamond"));
   });
   private final Object2ObjectMap<cbf, fzz.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<cbd, fzz.a> c = new Object2ObjectOpenHashMap();
   private final anm d;
   private final String e;

   public fxh(fuj<T, M> $$0, anm $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(elg $$0, fnl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         cbb $$10 = $$3.gk();
         cbf $$11 = $$10.a();
         cbd $$12 = $$10.b();
         fzz.a $$13 = this.a(this.b, "type", jb.z, $$11);
         fzz.a $$14 = this.a(this.c, "profession", jb.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == fzz.a.a || $$14 == fzz.a.b && $$13 != fzz.a.c);
         aer $$16 = this.a("type", jb.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != cbd.b && !$$3.i_()) {
            aer $$17 = this.a("profession", jb.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != cbd.m) {
               aer $$18 = this.a("profession_level", (aer)a.get(arp.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private aer a(String $$0, aer $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> fzz.a a(Object2ObjectMap<K, fzz.a> $$0, String $$1, gz<K> $$2, K $$3) {
      return (fzz.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(fzz.a).map(fzz::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(fzz.a.a));
   }
}
