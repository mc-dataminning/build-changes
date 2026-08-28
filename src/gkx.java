import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gkx {
   private final gio a;
   private final gjv b;

   public gkx(gio $$0, gjv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gkx.a a(kh $$0, gkv $$1, fdq $$2, ghy $$3) {
      gkx.a $$4 = new gkx.a();
      jf $$5 = $$0.j();
      jf $$6 = $$5.b(15, 15, 15);
      gkz $$7 = new gkz();
      fdi $$8 = new fdi();
      giq.a();
      Map<ghv, fdd> $$9 = new Reference2ObjectArrayMap(ghv.L().size());
      azn $$10 = azn.a();

      for (jf $$11 : jf.c($$5, $$6)) {
         dus $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            drv $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         eqt $$14 = $$12.y();
         if (!$$14.c()) {
            ghv $$15 = ghd.a($$14);
            fdd $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dnt.c) {
            ghv $$17 = ghd.a($$12);
            fdd $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kh.b($$11.u()), (float)kh.b($$11.v()), (float)kh.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<ghv, fdd> $$19 : $$9.entrySet()) {
         ghv $$20 = $$19.getKey();
         fdh $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == ghv.f()) {
               $$4.e = $$21.a($$3.a(ghv.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      giq.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fdd a(Map<ghv, fdd> $$0, ghy $$1, ghv $$2) {
      fdd $$3 = $$0.get($$2);
      if ($$3 == null) {
         fdf $$4 = $$1.a($$2);
         $$3 = new fdd($$4, fdn.c.h, fdg.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends drv> void a(gkx.a $$0, E $$1) {
      gjw<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<drv> a = new ArrayList<>();
      public final List<drv> b = new ArrayList<>();
      public final Map<ghv, fdh> c = new Reference2ObjectArrayMap();
      public gla d = new gla();
      @Nullable
      public fdh.b e;

      public void a() {
         this.c.values().forEach(fdh::close);
      }
   }
}
