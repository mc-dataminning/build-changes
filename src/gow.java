import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gow {
   private final gmn a;
   private final gnu b;

   public gow(gmn $$0, gnu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gow.a a(kj $$0, gou $$1, fgz $$2, glx $$3) {
      gow.a $$4 = new gow.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      goy $$7 = new goy();
      fgr $$8 = new fgr();
      gmp.a();
      Map<glu, fgm> $$9 = new Reference2ObjectArrayMap(glu.M().size());
      bam $$10 = bam.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dxu $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            duw $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         etw $$14 = $$12.y();
         if (!$$14.c()) {
            glu $$15 = glc.a($$14);
            fgm $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dqu.c) {
            glu $$17 = glc.a($$12);
            fgm $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<glu, fgm> $$19 : $$9.entrySet()) {
         glu $$20 = $$19.getKey();
         fgq $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == glu.f()) {
               $$4.e = $$21.a($$3.a(glu.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gmp.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fgm a(Map<glu, fgm> $$0, glx $$1, glu $$2) {
      fgm $$3 = $$0.get($$2);
      if ($$3 == null) {
         fgo $$4 = $$1.a($$2);
         $$3 = new fgm($$4, fgw.c.h, fgp.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends duw> void a(gow.a $$0, E $$1) {
      gnv<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<duw> a = new ArrayList<>();
      public final List<duw> b = new ArrayList<>();
      public final Map<glu, fgq> c = new Reference2ObjectArrayMap();
      public goz d = new goz();
      @Nullable
      public fgq.b e;

      public void a() {
         this.c.values().forEach(fgq::close);
      }
   }
}
