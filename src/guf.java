import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class guf {
   private final gru a;
   private final gtc b;

   public guf(gru $$0, gtc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public guf.a a(jy $$0, gud $$1, fkl $$2, grf $$3) {
      guf.a $$4 = new guf.a();
      iv $$5 = $$0.j();
      iv $$6 = $$5.b(15, 15, 15);
      guh $$7 = new guh();
      fkd $$8 = new fkd();
      grw.a();
      Map<grc, fjz> $$9 = new Reference2ObjectArrayMap(grc.U().size());
      azv $$10 = azv.a();

      for (iv $$11 : iv.c($$5, $$6)) {
         eat $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dxr $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         exa $$14 = $$12.y();
         if (!$$14.c()) {
            grc $$15 = gqj.a($$14);
            fjz $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dte.b) {
            grc $$17 = gqj.a($$12);
            fjz $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)jy.b($$11.u()), (float)jy.b($$11.v()), (float)jy.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<grc, fjz> $$19 : $$9.entrySet()) {
         grc $$20 = $$19.getKey();
         fkc $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == grc.f()) {
               $$4.e = $$21.a($$3.a(grc.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      grw.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fjz a(Map<grc, fjz> $$0, grf $$1, grc $$2) {
      fjz $$3 = $$0.get($$2);
      if ($$3 == null) {
         fka $$4 = $$1.a($$2);
         $$3 = new fjz($$4, fki.c.h, fkb.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dxr> void a(guf.a $$0, E $$1) {
      gtd<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dxr> a = new ArrayList<>();
      public final List<dxr> b = new ArrayList<>();
      public final Map<grc, fkc> c = new Reference2ObjectArrayMap();
      public gui d = new gui();
      @Nullable
      public fkc.b e;

      public void a() {
         this.c.values().forEach(fkc::close);
      }
   }
}
