import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gpk {
   private final gnb a;
   private final goi b;

   public gpk(gnb $$0, goi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gpk.a a(kk $$0, gpi $$1, fgb $$2, gmk $$3) {
      gpk.a $$4 = new gpk.a();
      ji $$5 = $$0.j();
      ji $$6 = $$5.b(15, 15, 15);
      gpm $$7 = new gpm();
      fft $$8 = new fft();
      gnd.a();
      Map<gmh, ffo> $$9 = new Reference2ObjectArrayMap(gmh.Q().size());
      azh $$10 = azh.a();

      for (ji $$11 : ji.c($$5, $$6)) {
         dww $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dty $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         esy $$14 = $$12.y();
         if (!$$14.c()) {
            gmh $$15 = glq.a($$14);
            ffo $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dpw.b) {
            gmh $$17 = glq.a($$12);
            ffo $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kk.b($$11.u()), (float)kk.b($$11.v()), (float)kk.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gmh, ffo> $$19 : $$9.entrySet()) {
         gmh $$20 = $$19.getKey();
         ffs $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gmh.f()) {
               $$4.e = $$21.a($$3.a(gmh.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gnd.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private ffo a(Map<gmh, ffo> $$0, gmk $$1, gmh $$2) {
      ffo $$3 = $$0.get($$2);
      if ($$3 == null) {
         ffq $$4 = $$1.a($$2);
         $$3 = new ffo($$4, ffy.c.h, ffr.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dty> void a(gpk.a $$0, E $$1) {
      goj<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dty> a = new ArrayList<>();
      public final List<dty> b = new ArrayList<>();
      public final Map<gmh, ffs> c = new Reference2ObjectArrayMap();
      public gpn d = new gpn();
      @Nullable
      public ffs.b e;

      public void a() {
         this.c.values().forEach(ffs::close);
      }
   }
}
