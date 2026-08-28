import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class glt {
   private final gjk a;
   private final gkr b;

   public glt(gjk $$0, gkr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public glt.a a(kj $$0, glr $$1, fej $$2, giu $$3) {
      glt.a $$4 = new glt.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      glv $$7 = new glv();
      feb $$8 = new feb();
      gjm.a();
      Map<gir, fdw> $$9 = new Reference2ObjectArrayMap(gir.L().size());
      azs $$10 = azs.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dvj $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dsm $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         erk $$14 = $$12.y();
         if (!$$14.c()) {
            gir $$15 = ghz.a($$14);
            fdw $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dok.c) {
            gir $$17 = ghz.a($$12);
            fdw $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gir, fdw> $$19 : $$9.entrySet()) {
         gir $$20 = $$19.getKey();
         fea $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gir.f()) {
               $$4.e = $$21.a($$3.a(gir.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gjm.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fdw a(Map<gir, fdw> $$0, giu $$1, gir $$2) {
      fdw $$3 = $$0.get($$2);
      if ($$3 == null) {
         fdy $$4 = $$1.a($$2);
         $$3 = new fdw($$4, feg.c.h, fdz.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dsm> void a(glt.a $$0, E $$1) {
      gks<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dsm> a = new ArrayList<>();
      public final List<dsm> b = new ArrayList<>();
      public final Map<gir, fea> c = new Reference2ObjectArrayMap();
      public glw d = new glw();
      @Nullable
      public fea.b e;

      public void a() {
         this.c.values().forEach(fea::close);
      }
   }
}
