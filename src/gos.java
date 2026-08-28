import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gos {
   private final gmj a;
   private final gnq b;

   public gos(gmj $$0, gnq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gos.a a(kj $$0, goq $$1, fgt $$2, glt $$3) {
      gos.a $$4 = new gos.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      gou $$7 = new gou();
      fgl $$8 = new fgl();
      gml.a();
      Map<glq, fgg> $$9 = new Reference2ObjectArrayMap(glq.Q().size());
      bac $$10 = bac.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dxo $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            duq $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         etq $$14 = $$12.y();
         if (!$$14.c()) {
            glq $$15 = gky.a($$14);
            fgg $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dqo.c) {
            glq $$17 = gky.a($$12);
            fgg $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<glq, fgg> $$19 : $$9.entrySet()) {
         glq $$20 = $$19.getKey();
         fgk $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == glq.f()) {
               $$4.e = $$21.a($$3.a(glq.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gml.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fgg a(Map<glq, fgg> $$0, glt $$1, glq $$2) {
      fgg $$3 = $$0.get($$2);
      if ($$3 == null) {
         fgi $$4 = $$1.a($$2);
         $$3 = new fgg($$4, fgq.c.h, fgj.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends duq> void a(gos.a $$0, E $$1) {
      gnr<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<duq> a = new ArrayList<>();
      public final List<duq> b = new ArrayList<>();
      public final Map<glq, fgk> c = new Reference2ObjectArrayMap();
      public gov d = new gov();
      @Nullable
      public fgk.b e;

      public void a() {
         this.c.values().forEach(fgk::close);
      }
   }
}
