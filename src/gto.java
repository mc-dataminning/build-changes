import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gto {
   private final gre a;
   private final gsl b;

   public gto(gre $$0, gsl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gto.a a(jx $$0, gtm $$1, fjr $$2, gqn $$3) {
      gto.a $$4 = new gto.a();
      iu $$5 = $$0.j();
      iu $$6 = $$5.b(15, 15, 15);
      gtq $$7 = new gtq();
      fjj $$8 = new fjj();
      grg.a();
      Map<gqk, fjf> $$9 = new Reference2ObjectArrayMap(gqk.R().size());
      azv $$10 = azv.a();

      for (iu $$11 : iu.c($$5, $$6)) {
         eah $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dxf $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         ewo $$14 = $$12.y();
         if (!$$14.c()) {
            gqk $$15 = gps.a($$14);
            fjf $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dss.b) {
            gqk $$17 = gps.a($$12);
            fjf $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)jx.b($$11.u()), (float)jx.b($$11.v()), (float)jx.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gqk, fjf> $$19 : $$9.entrySet()) {
         gqk $$20 = $$19.getKey();
         fji $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gqk.f()) {
               $$4.e = $$21.a($$3.a(gqk.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      grg.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fjf a(Map<gqk, fjf> $$0, gqn $$1, gqk $$2) {
      fjf $$3 = $$0.get($$2);
      if ($$3 == null) {
         fjg $$4 = $$1.a($$2);
         $$3 = new fjf($$4, fjo.c.h, fjh.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dxf> void a(gto.a $$0, E $$1) {
      gsm<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dxf> a = new ArrayList<>();
      public final List<dxf> b = new ArrayList<>();
      public final Map<gqk, fji> c = new Reference2ObjectArrayMap();
      public gtr d = new gtr();
      @Nullable
      public fji.b e;

      public void a() {
         this.c.values().forEach(fji::close);
      }
   }
}
