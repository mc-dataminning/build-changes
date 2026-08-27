import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class gpt<T extends bso & cln, M extends fvq<T> & fyc> extends gpi<T, M> {
   private static final Int2ObjectMap<akt> a = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new akt("stone"));
      $$0.put(2, new akt("iron"));
      $$0.put(3, new akt("gold"));
      $$0.put(4, new akt("emerald"));
      $$0.put(5, new akt("diamond"));
   });
   private final Object2ObjectMap<clq, gsm.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<clo, gsm.a> c = new Object2ObjectOpenHashMap();
   private final aud d;
   private final String e;

   public gpt(gmp<T, M> $$0, aud $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cm()) {
         clm $$10 = $$3.gL();
         clq $$11 = $$10.a();
         clo $$12 = $$10.b();
         boolean $$13 = $$3.dV();
         gsm.a $$14 = this.a(this.b, "type", lh.y, $$11);
         gsm.a $$15 = this.a(this.c, "profession", lh.z, $$12);
         M $$16 = this.c();
         $$16.a($$15 == gsm.a.a || $$15 == gsm.a.b && $$14 != gsm.a.c);
         akt $$17 = this.a("type", lh.y.b($$11));
         a($$16, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$16.a(true);
         if ($$12 != clo.b && !$$3.o_()) {
            akt $$18 = this.a("profession", lh.z.b($$12));
            if ($$13) {
               $$18 = glt.a($$18);
            }

            a($$16, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != clo.m) {
               akt $$19 = this.a("profession_level", (akt)a.get(aym.a($$10.c(), 1, a.size())));
               a($$16, $$19, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private akt a(String $$0, akt $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> gsm.a a(Object2ObjectMap<K, gsm.a> $$0, String $$1, iv<K> $$2, K $$3) {
      return (gsm.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(gsm.a).map(gsm::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(gsm.a.a));
   }
}
