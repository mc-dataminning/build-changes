import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gkc {
   private final ghu a;
   private final gjb b;

   public gkc(ghu $$0, gjb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gkc.a a(kg $$0, gka $$1, fdc $$2, ghh $$3) {
      gkc.a $$4 = new gkc.a();
      je $$5 = $$0.j();
      je $$6 = $$5.b(15, 15, 15);
      gke $$7 = new gke();
      fcu $$8 = new fcu();
      ghw.a();
      Map<ghe, fcp> $$9 = new Reference2ObjectArrayMap(ghe.M().size());
      azk $$10 = azk.a();

      for (je $$11 : je.c($$5, $$6)) {
         dua $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dre $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         eqb $$14 = $$12.y();
         if (!$$14.c()) {
            ghe $$15 = ggn.a($$14);
            fcp $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dnc.c) {
            ghe $$17 = ggn.a($$12);
            fcp $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kg.b($$11.u()), (float)kg.b($$11.v()), (float)kg.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<ghe, fcp> $$19 : $$9.entrySet()) {
         ghe $$20 = $$19.getKey();
         fct $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == ghe.f()) {
               $$4.e = $$21.a($$3.a(ghe.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      ghw.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fcp a(Map<ghe, fcp> $$0, ghh $$1, ghe $$2) {
      fcp $$3 = $$0.get($$2);
      if ($$3 == null) {
         fcr $$4 = $$1.a($$2);
         $$3 = new fcp($$4, fcz.c.h, fcs.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dre> void a(gkc.a $$0, E $$1) {
      gjc<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dre> a = new ArrayList<>();
      public final List<dre> b = new ArrayList<>();
      public final Map<ghe, fct> c = new Reference2ObjectArrayMap();
      public gkf d = new gkf();
      @Nullable
      public fct.b e;

      public void a() {
         this.c.values().forEach(fct::close);
      }
   }
}
