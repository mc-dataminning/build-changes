import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gmj {
   private final gka a;
   private final glh b;

   public gmj(gka $$0, glh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gmj.a a(kj $$0, gmh $$1, fes $$2, gjk $$3) {
      gmj.a $$4 = new gmj.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      gml $$7 = new gml();
      fek $$8 = new fek();
      gkc.a();
      Map<gjh, fef> $$9 = new Reference2ObjectArrayMap(gjh.L().size());
      azv $$10 = azv.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dvo $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dsr $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         ero $$14 = $$12.y();
         if (!$$14.c()) {
            gjh $$15 = gip.a($$14);
            fef $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dop.c) {
            gjh $$17 = gip.a($$12);
            fef $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gjh, fef> $$19 : $$9.entrySet()) {
         gjh $$20 = $$19.getKey();
         fej $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gjh.f()) {
               $$4.e = $$21.a($$3.a(gjh.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gkc.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fef a(Map<gjh, fef> $$0, gjk $$1, gjh $$2) {
      fef $$3 = $$0.get($$2);
      if ($$3 == null) {
         feh $$4 = $$1.a($$2);
         $$3 = new fef($$4, fep.c.h, fei.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dsr> void a(gmj.a $$0, E $$1) {
      gli<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dsr> a = new ArrayList<>();
      public final List<dsr> b = new ArrayList<>();
      public final Map<gjh, fej> c = new Reference2ObjectArrayMap();
      public gmm d = new gmm();
      @Nullable
      public fej.b e;

      public void a() {
         this.c.values().forEach(fej::close);
      }
   }
}
