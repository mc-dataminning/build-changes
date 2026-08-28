import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gpj {
   private final gnb a;
   private final goh b;

   public gpj(gnb $$0, goh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gpj.a a(kk $$0, gph $$1, fgc $$2, gmk $$3) {
      gpj.a $$4 = new gpj.a();
      ji $$5 = $$0.j();
      ji $$6 = $$5.b(15, 15, 15);
      gpl $$7 = new gpl();
      ffu $$8 = new ffu();
      gnd.a();
      Map<gmh, ffp> $$9 = new Reference2ObjectArrayMap(gmh.Q().size());
      azh $$10 = azh.a();

      for (ji $$11 : ji.c($$5, $$6)) {
         dwx $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dtz $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         esz $$14 = $$12.y();
         if (!$$14.c()) {
            gmh $$15 = glq.a($$14);
            ffp $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dpx.c) {
            gmh $$17 = glq.a($$12);
            ffp $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kk.b($$11.u()), (float)kk.b($$11.v()), (float)kk.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gmh, ffp> $$19 : $$9.entrySet()) {
         gmh $$20 = $$19.getKey();
         fft $$21 = $$19.getValue().a();
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

   private ffp a(Map<gmh, ffp> $$0, gmk $$1, gmh $$2) {
      ffp $$3 = $$0.get($$2);
      if ($$3 == null) {
         ffr $$4 = $$1.a($$2);
         $$3 = new ffp($$4, ffz.c.h, ffs.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dtz> void a(gpj.a $$0, E $$1) {
      goi<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dtz> a = new ArrayList<>();
      public final List<dtz> b = new ArrayList<>();
      public final Map<gmh, fft> c = new Reference2ObjectArrayMap();
      public gpm d = new gpm();
      @Nullable
      public fft.b e;

      public void a() {
         this.c.values().forEach(fft::close);
      }
   }
}
