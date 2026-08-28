import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gsr {
   private final gqh a;
   private final gro b;

   public gsr(gqh $$0, gro $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gsr.a a(jx $$0, gsp $$1, fiy $$2, gpq $$3) {
      gsr.a $$4 = new gsr.a();
      iu $$5 = $$0.j();
      iu $$6 = $$5.b(15, 15, 15);
      gst $$7 = new gst();
      fiq $$8 = new fiq();
      gqj.a();
      Map<gpn, fil> $$9 = new Reference2ObjectArrayMap(gpn.Q().size());
      azt $$10 = azt.a();

      for (iu $$11 : iu.c($$5, $$6)) {
         dzo $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dwn $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         evv $$14 = $$12.y();
         if (!$$14.c()) {
            gpn $$15 = gov.a($$14);
            fil $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dsf.b) {
            gpn $$17 = gov.a($$12);
            fil $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)jx.b($$11.u()), (float)jx.b($$11.v()), (float)jx.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gpn, fil> $$19 : $$9.entrySet()) {
         gpn $$20 = $$19.getKey();
         fip $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gpn.f()) {
               $$4.e = $$21.a($$3.a(gpn.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gqj.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fil a(Map<gpn, fil> $$0, gpq $$1, gpn $$2) {
      fil $$3 = $$0.get($$2);
      if ($$3 == null) {
         fin $$4 = $$1.a($$2);
         $$3 = new fil($$4, fiv.c.h, fio.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dwn> void a(gsr.a $$0, E $$1) {
      grp<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dwn> a = new ArrayList<>();
      public final List<dwn> b = new ArrayList<>();
      public final Map<gpn, fip> c = new Reference2ObjectArrayMap();
      public gsu d = new gsu();
      @Nullable
      public fip.b e;

      public void a() {
         this.c.values().forEach(fip::close);
      }
   }
}
