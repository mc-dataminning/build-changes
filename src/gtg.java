import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gtg {
   private final gqw a;
   private final gsd b;

   public gtg(gqw $$0, gsd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gtg.a a(jx $$0, gte $$1, fjk $$2, gqf $$3) {
      gtg.a $$4 = new gtg.a();
      iu $$5 = $$0.j();
      iu $$6 = $$5.b(15, 15, 15);
      gti $$7 = new gti();
      fjc $$8 = new fjc();
      gqy.a();
      Map<gqc, fix> $$9 = new Reference2ObjectArrayMap(gqc.Q().size());
      azv $$10 = azv.a();

      for (iu $$11 : iu.c($$5, $$6)) {
         dzz $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dwx $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         ewg $$14 = $$12.y();
         if (!$$14.c()) {
            gqc $$15 = gpk.a($$14);
            fix $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dsm.b) {
            gqc $$17 = gpk.a($$12);
            fix $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)jx.b($$11.u()), (float)jx.b($$11.v()), (float)jx.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gqc, fix> $$19 : $$9.entrySet()) {
         gqc $$20 = $$19.getKey();
         fjb $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gqc.f()) {
               $$4.e = $$21.a($$3.a(gqc.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gqy.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fix a(Map<gqc, fix> $$0, gqf $$1, gqc $$2) {
      fix $$3 = $$0.get($$2);
      if ($$3 == null) {
         fiz $$4 = $$1.a($$2);
         $$3 = new fix($$4, fjh.c.h, fja.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dwx> void a(gtg.a $$0, E $$1) {
      gse<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dwx> a = new ArrayList<>();
      public final List<dwx> b = new ArrayList<>();
      public final Map<gqc, fjb> c = new Reference2ObjectArrayMap();
      public gtj d = new gtj();
      @Nullable
      public fjb.b e;

      public void a() {
         this.c.values().forEach(fjb::close);
      }
   }
}
