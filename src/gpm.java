import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gpm {
   private final gnd a;
   private final gok b;

   public gpm(gnd $$0, gok $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gpm.a a(kk $$0, gpk $$1, fgd $$2, gmm $$3) {
      gpm.a $$4 = new gpm.a();
      ji $$5 = $$0.j();
      ji $$6 = $$5.b(15, 15, 15);
      gpo $$7 = new gpo();
      ffv $$8 = new ffv();
      gnf.a();
      Map<gmj, ffq> $$9 = new Reference2ObjectArrayMap(gmj.Q().size());
      azh $$10 = azh.a();

      for (ji $$11 : ji.c($$5, $$6)) {
         dwy $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dua $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         eta $$14 = $$12.y();
         if (!$$14.c()) {
            gmj $$15 = gls.a($$14);
            ffq $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dpy.b) {
            gmj $$17 = gls.a($$12);
            ffq $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kk.b($$11.u()), (float)kk.b($$11.v()), (float)kk.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gmj, ffq> $$19 : $$9.entrySet()) {
         gmj $$20 = $$19.getKey();
         ffu $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gmj.f()) {
               $$4.e = $$21.a($$3.a(gmj.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gnf.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private ffq a(Map<gmj, ffq> $$0, gmm $$1, gmj $$2) {
      ffq $$3 = $$0.get($$2);
      if ($$3 == null) {
         ffs $$4 = $$1.a($$2);
         $$3 = new ffq($$4, fga.c.h, fft.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dua> void a(gpm.a $$0, E $$1) {
      gol<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dua> a = new ArrayList<>();
      public final List<dua> b = new ArrayList<>();
      public final Map<gmj, ffu> c = new Reference2ObjectArrayMap();
      public gpp d = new gpp();
      @Nullable
      public ffu.b e;

      public void a() {
         this.c.values().forEach(ffu::close);
      }
   }
}
