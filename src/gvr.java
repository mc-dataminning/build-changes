import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gvr {
   private final gtf a;
   private final guo b;

   public gvr(gtf $$0, guo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gvr.a a(jz $$0, gvp $$1, flx $$2, gsq $$3) {
      gvr.a $$4 = new gvr.a();
      iw $$5 = $$0.j();
      iw $$6 = $$5.b(15, 15, 15);
      gvt $$7 = new gvt();
      flq $$8 = new flq();
      gth.a();
      Map<gsn, flm> $$9 = new Reference2ObjectArrayMap(gsn.N().size());
      azz $$10 = azz.a();
      List<gto> $$11 = new ObjectArrayList();

      for (iw $$12 : iw.c($$5, $$6)) {
         ebg $$13 = $$1.a_($$12);
         if ($$13.s()) {
            $$7.a($$12);
         }

         if ($$13.x()) {
            dye $$14 = $$1.c_($$12);
            if ($$14 != null) {
               this.a($$4, $$14);
            }
         }

         exq $$15 = $$13.y();
         if (!$$15.c()) {
            gsn $$16 = gru.a($$15);
            flm $$17 = this.a($$9, $$3, $$16);
            this.a.a($$12, $$1, $$17, $$13, $$15);
         }

         if ($$13.o() == dtr.b) {
            gsn $$18 = gru.a($$13);
            flm $$19 = this.a($$9, $$3, $$18);
            $$10.b($$13.b($$12));
            this.a.a($$13).a($$10, $$11);
            $$8.a();
            $$8.a((float)jz.b($$12.u()), (float)jz.b($$12.v()), (float)jz.b($$12.w()));
            this.a.a($$13, $$12, $$1, $$8, $$19, true, $$11);
            $$8.b();
            $$11.clear();
         }
      }

      for (Entry<gsn, flm> $$20 : $$9.entrySet()) {
         gsn $$21 = $$20.getKey();
         flp $$22 = $$20.getValue().a();
         if ($$22 != null) {
            if ($$21 == gsn.g()) {
               $$4.e = $$22.a($$3.a(gsn.g()), $$2);
            }

            $$4.c.put($$21, $$22);
         }
      }

      gth.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private flm a(Map<gsn, flm> $$0, gsq $$1, gsn $$2) {
      flm $$3 = $$0.get($$2);
      if ($$3 == null) {
         fln $$4 = $$1.a($$2);
         $$3 = new flm($$4, flu.c.h, flo.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dye> void a(gvr.a $$0, E $$1) {
      gup<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dye> a = new ArrayList<>();
      public final List<dye> b = new ArrayList<>();
      public final Map<gsn, flp> c = new Reference2ObjectArrayMap();
      public gvu d = new gvu();
      @Nullable
      public flp.b e;

      public void a() {
         this.c.values().forEach(flp::close);
      }
   }
}
