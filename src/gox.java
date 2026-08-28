import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gox {
   private final gmo a;
   private final gnv b;

   public gox(gmo $$0, gnv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gox.a a(kj $$0, gov $$1, fha $$2, gly $$3) {
      gox.a $$4 = new gox.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      goz $$7 = new goz();
      fgs $$8 = new fgs();
      gmq.a();
      Map<glv, fgn> $$9 = new Reference2ObjectArrayMap(glv.M().size());
      bam $$10 = bam.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dxv $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dux $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         etx $$14 = $$12.y();
         if (!$$14.c()) {
            glv $$15 = gld.a($$14);
            fgn $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dqv.c) {
            glv $$17 = gld.a($$12);
            fgn $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<glv, fgn> $$19 : $$9.entrySet()) {
         glv $$20 = $$19.getKey();
         fgr $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == glv.f()) {
               $$4.e = $$21.a($$3.a(glv.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gmq.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fgn a(Map<glv, fgn> $$0, gly $$1, glv $$2) {
      fgn $$3 = $$0.get($$2);
      if ($$3 == null) {
         fgp $$4 = $$1.a($$2);
         $$3 = new fgn($$4, fgx.c.h, fgq.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dux> void a(gox.a $$0, E $$1) {
      gnw<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dux> a = new ArrayList<>();
      public final List<dux> b = new ArrayList<>();
      public final Map<glv, fgr> c = new Reference2ObjectArrayMap();
      public gpa d = new gpa();
      @Nullable
      public fgr.b e;

      public void a() {
         this.c.values().forEach(fgr::close);
      }
   }
}
