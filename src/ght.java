import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ght {
   private final gfn a;
   private final ggs b;

   public ght(gfn $$0, ggs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ght.a a(kf $$0, ghr $$1, fbk $$2, gfe $$3) {
      ght.a $$4 = new ght.a();
      jd $$5 = $$0.j();
      jd $$6 = $$5.b(15, 15, 15);
      ghv $$7 = new ghv();
      fbc $$8 = new fbc();
      gfp.a();
      Map<gfb, fax> $$9 = new Reference2ObjectArrayMap(gfb.F().size());
      ayv $$10 = ayv.a();

      for (jd $$11 : jd.c($$5, $$6)) {
         dta $$12 = $$1.a_($$11);
         if ($$12.i($$1, $$11)) {
            $$7.a($$11);
         }

         if ($$12.t()) {
            dqf $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         eoy $$14 = $$12.u();
         if (!$$14.c()) {
            gfb $$15 = geo.a($$14);
            fax $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.l() == dmd.c) {
            gfb $$17 = geo.a($$12);
            fax $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kf.b($$11.u()), (float)kf.b($$11.v()), (float)kf.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gfb, fax> $$19 : $$9.entrySet()) {
         gfb $$20 = $$19.getKey();
         fbb $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gfb.f()) {
               $$4.e = $$21.a($$3.a(gfb.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gfp.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fax a(Map<gfb, fax> $$0, gfe $$1, gfb $$2) {
      fax $$3 = $$0.get($$2);
      if ($$3 == null) {
         faz $$4 = $$1.a($$2);
         $$3 = new fax($$4, fbh.c.h, fba.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dqf> void a(ght.a $$0, E $$1) {
      ggt<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dqf> a = new ArrayList<>();
      public final List<dqf> b = new ArrayList<>();
      public final Map<gfb, fbb> c = new Reference2ObjectArrayMap();
      public ghw d = new ghw();
      @Nullable
      public fbb.b e;

      public void a() {
         this.c.values().forEach(fbb::close);
      }
   }
}
