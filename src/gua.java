import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gua {
   private final grp a;
   private final gsx b;

   public gua(grp $$0, gsx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gua.a a(jy $$0, gty $$1, fkg $$2, gra $$3) {
      gua.a $$4 = new gua.a();
      iv $$5 = $$0.j();
      iv $$6 = $$5.b(15, 15, 15);
      guc $$7 = new guc();
      fjy $$8 = new fjy();
      grr.a();
      Map<gqx, fju> $$9 = new Reference2ObjectArrayMap(gqx.U().size());
      azv $$10 = azv.a();

      for (iv $$11 : iv.c($$5, $$6)) {
         eao $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dxm $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         ewv $$14 = $$12.y();
         if (!$$14.c()) {
            gqx $$15 = gqe.a($$14);
            fju $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dsz.b) {
            gqx $$17 = gqe.a($$12);
            fju $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)jy.b($$11.u()), (float)jy.b($$11.v()), (float)jy.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gqx, fju> $$19 : $$9.entrySet()) {
         gqx $$20 = $$19.getKey();
         fjx $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gqx.f()) {
               $$4.e = $$21.a($$3.a(gqx.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      grr.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fju a(Map<gqx, fju> $$0, gra $$1, gqx $$2) {
      fju $$3 = $$0.get($$2);
      if ($$3 == null) {
         fjv $$4 = $$1.a($$2);
         $$3 = new fju($$4, fkd.c.h, fjw.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dxm> void a(gua.a $$0, E $$1) {
      gsy<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dxm> a = new ArrayList<>();
      public final List<dxm> b = new ArrayList<>();
      public final Map<gqx, fjx> c = new Reference2ObjectArrayMap();
      public gud d = new gud();
      @Nullable
      public fjx.b e;

      public void a() {
         this.c.values().forEach(fjx::close);
      }
   }
}
