import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ghz {
   private final gft a;
   private final ggy b;

   public ghz(gft $$0, ggy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ghz.a a(kf $$0, ghx $$1, fbq $$2, gfk $$3) {
      ghz.a $$4 = new ghz.a();
      jd $$5 = $$0.j();
      jd $$6 = $$5.b(15, 15, 15);
      gib $$7 = new gib();
      fbi $$8 = new fbi();
      gfv.a();
      Map<gfh, fbd> $$9 = new Reference2ObjectArrayMap(gfh.I().size());
      ayw $$10 = ayw.a();

      for (jd $$11 : jd.c($$5, $$6)) {
         dtc $$12 = $$1.a_($$11);
         if ($$12.i($$1, $$11)) {
            $$7.a($$11);
         }

         if ($$12.t()) {
            dqh $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         epe $$14 = $$12.u();
         if (!$$14.c()) {
            gfh $$15 = geu.a($$14);
            fbd $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.l() == dmf.c) {
            gfh $$17 = geu.a($$12);
            fbd $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kf.b($$11.u()), (float)kf.b($$11.v()), (float)kf.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gfh, fbd> $$19 : $$9.entrySet()) {
         gfh $$20 = $$19.getKey();
         fbh $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gfh.f()) {
               $$4.e = $$21.a($$3.a(gfh.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gfv.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fbd a(Map<gfh, fbd> $$0, gfk $$1, gfh $$2) {
      fbd $$3 = $$0.get($$2);
      if ($$3 == null) {
         fbf $$4 = $$1.a($$2);
         $$3 = new fbd($$4, fbn.c.h, fbg.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dqh> void a(ghz.a $$0, E $$1) {
      ggz<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dqh> a = new ArrayList<>();
      public final List<dqh> b = new ArrayList<>();
      public final Map<gfh, fbh> c = new Reference2ObjectArrayMap();
      public gic d = new gic();
      @Nullable
      public fbh.b e;

      public void a() {
         this.c.values().forEach(fbh::close);
      }
   }
}
