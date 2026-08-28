import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gov {
   private final gmm a;
   private final gnt b;

   public gov(gmm $$0, gnt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gov.a a(kj $$0, got $$1, fgy $$2, glw $$3) {
      gov.a $$4 = new gov.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      gox $$7 = new gox();
      fgq $$8 = new fgq();
      gmo.a();
      Map<glt, fgl> $$9 = new Reference2ObjectArrayMap(glt.M().size());
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
            glt $$15 = glb.a($$14);
            fgl $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dqu.c) {
            glt $$17 = glb.a($$12);
            fgl $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<glt, fgl> $$19 : $$9.entrySet()) {
         glt $$20 = $$19.getKey();
         fgp $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == glt.f()) {
               $$4.e = $$21.a($$3.a(glt.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gmo.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fgl a(Map<glt, fgl> $$0, glw $$1, glt $$2) {
      fgl $$3 = $$0.get($$2);
      if ($$3 == null) {
         fgn $$4 = $$1.a($$2);
         $$3 = new fgl($$4, fgv.c.h, fgo.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends duw> void a(gov.a $$0, E $$1) {
      gnu<E> $$2 = this.b.a($$1);
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
      public final Map<glt, fgp> c = new Reference2ObjectArrayMap();
      public goy d = new goy();
      @Nullable
      public fgp.b e;

      public void a() {
         this.c.values().forEach(fgp::close);
      }
   }
}
