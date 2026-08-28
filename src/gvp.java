import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gvp {
   private final gtd a;
   private final gum b;

   public gvp(gtd $$0, gum $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gvp.a a(jy $$0, gvn $$1, flv $$2, gso $$3) {
      gvp.a $$4 = new gvp.a();
      iv $$5 = $$0.j();
      iv $$6 = $$5.b(15, 15, 15);
      gvr $$7 = new gvr();
      flo $$8 = new flo();
      gtf.a();
      Map<gsl, flk> $$9 = new Reference2ObjectArrayMap(gsl.N().size());
      azx $$10 = azx.a();
      List<gtm> $$11 = new ObjectArrayList();

      for (iv $$12 : iv.c($$5, $$6)) {
         ebe $$13 = $$1.a_($$12);
         if ($$13.s()) {
            $$7.a($$12);
         }

         if ($$13.x()) {
            dyc $$14 = $$1.c_($$12);
            if ($$14 != null) {
               this.a($$4, $$14);
            }
         }

         exo $$15 = $$13.y();
         if (!$$15.c()) {
            gsl $$16 = grs.a($$15);
            flk $$17 = this.a($$9, $$3, $$16);
            this.a.a($$12, $$1, $$17, $$13, $$15);
         }

         if ($$13.o() == dtp.b) {
            gsl $$18 = grs.a($$13);
            flk $$19 = this.a($$9, $$3, $$18);
            $$10.b($$13.b($$12));
            this.a.a($$13).a($$10, $$11);
            $$8.a();
            $$8.a((float)jy.b($$12.u()), (float)jy.b($$12.v()), (float)jy.b($$12.w()));
            this.a.a($$13, $$12, $$1, $$8, $$19, true, $$11);
            $$8.b();
            $$11.clear();
         }
      }

      for (Entry<gsl, flk> $$20 : $$9.entrySet()) {
         gsl $$21 = $$20.getKey();
         fln $$22 = $$20.getValue().a();
         if ($$22 != null) {
            if ($$21 == gsl.g()) {
               $$4.e = $$22.a($$3.a(gsl.g()), $$2);
            }

            $$4.c.put($$21, $$22);
         }
      }

      gtf.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private flk a(Map<gsl, flk> $$0, gso $$1, gsl $$2) {
      flk $$3 = $$0.get($$2);
      if ($$3 == null) {
         fll $$4 = $$1.a($$2);
         $$3 = new flk($$4, fls.c.h, flm.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dyc> void a(gvp.a $$0, E $$1) {
      gun<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dyc> a = new ArrayList<>();
      public final List<dyc> b = new ArrayList<>();
      public final Map<gsl, fln> c = new Reference2ObjectArrayMap();
      public gvs d = new gvs();
      @Nullable
      public fln.b e;

      public void a() {
         this.c.values().forEach(fln::close);
      }
   }
}
