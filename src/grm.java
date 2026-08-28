import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class grm {
   private final gpc a;
   private final gqj b;

   public grm(gpc $$0, gqj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public grm.a a(kl $$0, grk $$1, fhw $$2, gol $$3) {
      grm.a $$4 = new grm.a();
      jj $$5 = $$0.j();
      jj $$6 = $$5.b(15, 15, 15);
      gro $$7 = new gro();
      fho $$8 = new fho();
      gpe.a();
      Map<goi, fhj> $$9 = new Reference2ObjectArrayMap(goi.Q().size());
      azs $$10 = azs.a();

      for (jj $$11 : jj.c($$5, $$6)) {
         dym $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dvl $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         eut $$14 = $$12.y();
         if (!$$14.c()) {
            goi $$15 = gnr.a($$14);
            fhj $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == drf.b) {
            goi $$17 = gnr.a($$12);
            fhj $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kl.b($$11.u()), (float)kl.b($$11.v()), (float)kl.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<goi, fhj> $$19 : $$9.entrySet()) {
         goi $$20 = $$19.getKey();
         fhn $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == goi.f()) {
               $$4.e = $$21.a($$3.a(goi.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gpe.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fhj a(Map<goi, fhj> $$0, gol $$1, goi $$2) {
      fhj $$3 = $$0.get($$2);
      if ($$3 == null) {
         fhl $$4 = $$1.a($$2);
         $$3 = new fhj($$4, fht.c.h, fhm.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dvl> void a(grm.a $$0, E $$1) {
      gqk<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dvl> a = new ArrayList<>();
      public final List<dvl> b = new ArrayList<>();
      public final Map<goi, fhn> c = new Reference2ObjectArrayMap();
      public grp d = new grp();
      @Nullable
      public fhn.b e;

      public void a() {
         this.c.values().forEach(fhn::close);
      }
   }
}
