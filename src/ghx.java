import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ghx {
   private final gfr a;
   private final ggw b;

   public ghx(gfr $$0, ggw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ghx.a a(kf $$0, ghv $$1, fbo $$2, gfi $$3) {
      ghx.a $$4 = new ghx.a();
      jd $$5 = $$0.j();
      jd $$6 = $$5.b(15, 15, 15);
      ghz $$7 = new ghz();
      fbg $$8 = new fbg();
      gft.a();
      Map<gff, fbb> $$9 = new Reference2ObjectArrayMap(gff.H().size());
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

         epc $$14 = $$12.u();
         if (!$$14.c()) {
            gff $$15 = ges.a($$14);
            fbb $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.l() == dmf.c) {
            gff $$17 = ges.a($$12);
            fbb $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kf.b($$11.u()), (float)kf.b($$11.v()), (float)kf.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gff, fbb> $$19 : $$9.entrySet()) {
         gff $$20 = $$19.getKey();
         fbf $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gff.f()) {
               $$4.e = $$21.a($$3.a(gff.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gft.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fbb a(Map<gff, fbb> $$0, gfi $$1, gff $$2) {
      fbb $$3 = $$0.get($$2);
      if ($$3 == null) {
         fbd $$4 = $$1.a($$2);
         $$3 = new fbb($$4, fbl.c.h, fbe.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dqh> void a(ghx.a $$0, E $$1) {
      ggx<E> $$2 = this.b.a($$1);
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
      public final Map<gff, fbf> c = new Reference2ObjectArrayMap();
      public gia d = new gia();
      @Nullable
      public fbf.b e;

      public void a() {
         this.c.values().forEach(fbf::close);
      }
   }
}
