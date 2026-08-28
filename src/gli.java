import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gli {
   private final giz a;
   private final gkg b;

   public gli(giz $$0, gkg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gli.a a(ki $$0, glg $$1, feb $$2, gij $$3) {
      gli.a $$4 = new gli.a();
      jg $$5 = $$0.j();
      jg $$6 = $$5.b(15, 15, 15);
      glk $$7 = new glk();
      fdt $$8 = new fdt();
      gjb.a();
      Map<gig, fdo> $$9 = new Reference2ObjectArrayMap(gig.L().size());
      azr $$10 = azr.a();

      for (jg $$11 : jg.c($$5, $$6)) {
         dvd $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dsg $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         ere $$14 = $$12.y();
         if (!$$14.c()) {
            gig $$15 = gho.a($$14);
            fdo $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == doe.c) {
            gig $$17 = gho.a($$12);
            fdo $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)ki.b($$11.u()), (float)ki.b($$11.v()), (float)ki.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gig, fdo> $$19 : $$9.entrySet()) {
         gig $$20 = $$19.getKey();
         fds $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gig.f()) {
               $$4.e = $$21.a($$3.a(gig.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gjb.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fdo a(Map<gig, fdo> $$0, gij $$1, gig $$2) {
      fdo $$3 = $$0.get($$2);
      if ($$3 == null) {
         fdq $$4 = $$1.a($$2);
         $$3 = new fdo($$4, fdy.c.h, fdr.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dsg> void a(gli.a $$0, E $$1) {
      gkh<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dsg> a = new ArrayList<>();
      public final List<dsg> b = new ArrayList<>();
      public final Map<gig, fds> c = new Reference2ObjectArrayMap();
      public gll d = new gll();
      @Nullable
      public fds.b e;

      public void a() {
         this.c.values().forEach(fds::close);
      }
   }
}
