import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gks {
   private final gij a;
   private final gjq b;

   public gks(gij $$0, gjq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gks.a a(kg $$0, gkq $$1, fdm $$2, ght $$3) {
      gks.a $$4 = new gks.a();
      je $$5 = $$0.j();
      je $$6 = $$5.b(15, 15, 15);
      gku $$7 = new gku();
      fde $$8 = new fde();
      gil.a();
      Map<ghq, fcz> $$9 = new Reference2ObjectArrayMap(ghq.L().size());
      azl $$10 = azl.a();

      for (je $$11 : je.c($$5, $$6)) {
         duo $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            drs $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         eqp $$14 = $$12.y();
         if (!$$14.c()) {
            ghq $$15 = ggy.a($$14);
            fcz $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dnq.c) {
            ghq $$17 = ggy.a($$12);
            fcz $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kg.b($$11.u()), (float)kg.b($$11.v()), (float)kg.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<ghq, fcz> $$19 : $$9.entrySet()) {
         ghq $$20 = $$19.getKey();
         fdd $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == ghq.f()) {
               $$4.e = $$21.a($$3.a(ghq.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gil.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fcz a(Map<ghq, fcz> $$0, ght $$1, ghq $$2) {
      fcz $$3 = $$0.get($$2);
      if ($$3 == null) {
         fdb $$4 = $$1.a($$2);
         $$3 = new fcz($$4, fdj.c.h, fdc.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends drs> void a(gks.a $$0, E $$1) {
      gjr<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<drs> a = new ArrayList<>();
      public final List<drs> b = new ArrayList<>();
      public final Map<ghq, fdd> c = new Reference2ObjectArrayMap();
      public gkv d = new gkv();
      @Nullable
      public fdd.b e;

      public void a() {
         this.c.values().forEach(fdd::close);
      }
   }
}
