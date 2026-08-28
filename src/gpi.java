import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gpi {
   private final gmz a;
   private final gog b;

   public gpi(gmz $$0, gog $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gpi.a a(kk $$0, gpg $$1, fga $$2, gmi $$3) {
      gpi.a $$4 = new gpi.a();
      ji $$5 = $$0.j();
      ji $$6 = $$5.b(15, 15, 15);
      gpk $$7 = new gpk();
      ffs $$8 = new ffs();
      gnb.a();
      Map<gmf, ffn> $$9 = new Reference2ObjectArrayMap(gmf.Q().size());
      azg $$10 = azg.a();

      for (ji $$11 : ji.c($$5, $$6)) {
         dwv $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dtx $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         esx $$14 = $$12.y();
         if (!$$14.c()) {
            gmf $$15 = glo.a($$14);
            ffn $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dpv.b) {
            gmf $$17 = glo.a($$12);
            ffn $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kk.b($$11.u()), (float)kk.b($$11.v()), (float)kk.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gmf, ffn> $$19 : $$9.entrySet()) {
         gmf $$20 = $$19.getKey();
         ffr $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gmf.f()) {
               $$4.e = $$21.a($$3.a(gmf.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gnb.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private ffn a(Map<gmf, ffn> $$0, gmi $$1, gmf $$2) {
      ffn $$3 = $$0.get($$2);
      if ($$3 == null) {
         ffp $$4 = $$1.a($$2);
         $$3 = new ffn($$4, ffx.c.h, ffq.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dtx> void a(gpi.a $$0, E $$1) {
      goh<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dtx> a = new ArrayList<>();
      public final List<dtx> b = new ArrayList<>();
      public final Map<gmf, ffr> c = new Reference2ObjectArrayMap();
      public gpl d = new gpl();
      @Nullable
      public ffr.b e;

      public void a() {
         this.c.values().forEach(ffr::close);
      }
   }
}
