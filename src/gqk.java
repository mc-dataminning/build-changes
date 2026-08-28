import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gqk {
   private final gob a;
   private final gpi b;

   public gqk(gob $$0, gpi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gqk.a a(kk $$0, gqi $$1, fgz $$2, gnk $$3) {
      gqk.a $$4 = new gqk.a();
      ji $$5 = $$0.j();
      ji $$6 = $$5.b(15, 15, 15);
      gqm $$7 = new gqm();
      fgr $$8 = new fgr();
      god.a();
      Map<gnh, fgm> $$9 = new Reference2ObjectArrayMap(gnh.Q().size());
      azh $$10 = azh.a();

      for (ji $$11 : ji.c($$5, $$6)) {
         dxq $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dus $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         etw $$14 = $$12.y();
         if (!$$14.c()) {
            gnh $$15 = gmq.a($$14);
            fgm $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dqp.b) {
            gnh $$17 = gmq.a($$12);
            fgm $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kk.b($$11.u()), (float)kk.b($$11.v()), (float)kk.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gnh, fgm> $$19 : $$9.entrySet()) {
         gnh $$20 = $$19.getKey();
         fgq $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gnh.f()) {
               $$4.e = $$21.a($$3.a(gnh.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      god.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fgm a(Map<gnh, fgm> $$0, gnk $$1, gnh $$2) {
      fgm $$3 = $$0.get($$2);
      if ($$3 == null) {
         fgo $$4 = $$1.a($$2);
         $$3 = new fgm($$4, fgw.c.h, fgp.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dus> void a(gqk.a $$0, E $$1) {
      gpj<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dus> a = new ArrayList<>();
      public final List<dus> b = new ArrayList<>();
      public final Map<gnh, fgq> c = new Reference2ObjectArrayMap();
      public gqn d = new gqn();
      @Nullable
      public fgq.b e;

      public void a() {
         this.c.values().forEach(fgq::close);
      }
   }
}
