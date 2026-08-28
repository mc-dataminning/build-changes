import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class goq {
   private final gmh a;
   private final gno b;

   public goq(gmh $$0, gno $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public goq.a a(kj $$0, goo $$1, fgt $$2, glr $$3) {
      goq.a $$4 = new goq.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      gos $$7 = new gos();
      fgl $$8 = new fgl();
      gmj.a();
      Map<glo, fgg> $$9 = new Reference2ObjectArrayMap(glo.M().size());
      bam $$10 = bam.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dxn $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dup $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         etp $$14 = $$12.y();
         if (!$$14.c()) {
            glo $$15 = gkw.a($$14);
            fgg $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dqn.c) {
            glo $$17 = gkw.a($$12);
            fgg $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<glo, fgg> $$19 : $$9.entrySet()) {
         glo $$20 = $$19.getKey();
         fgk $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == glo.f()) {
               $$4.e = $$21.a($$3.a(glo.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gmj.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fgg a(Map<glo, fgg> $$0, glr $$1, glo $$2) {
      fgg $$3 = $$0.get($$2);
      if ($$3 == null) {
         fgi $$4 = $$1.a($$2);
         $$3 = new fgg($$4, fgq.c.h, fgj.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dup> void a(goq.a $$0, E $$1) {
      gnp<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dup> a = new ArrayList<>();
      public final List<dup> b = new ArrayList<>();
      public final Map<glo, fgk> c = new Reference2ObjectArrayMap();
      public got d = new got();
      @Nullable
      public fgk.b e;

      public void a() {
         this.c.values().forEach(fgk::close);
      }
   }
}
