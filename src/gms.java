import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gms {
   private final gkj a;
   private final glq b;

   public gms(gkj $$0, glq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gms.a a(kj $$0, gmq $$1, fez $$2, gjt $$3) {
      gms.a $$4 = new gms.a();
      jh $$5 = $$0.j();
      jh $$6 = $$5.b(15, 15, 15);
      gmu $$7 = new gmu();
      fer $$8 = new fer();
      gkl.a();
      Map<gjq, fem> $$9 = new Reference2ObjectArrayMap(gjq.L().size());
      azu $$10 = azu.a();

      for (jh $$11 : jh.c($$5, $$6)) {
         dvv $$12 = $$1.a_($$11);
         if ($$12.s()) {
            $$7.a($$11);
         }

         if ($$12.x()) {
            dsy $$13 = $$1.c_($$11);
            if ($$13 != null) {
               this.a($$4, $$13);
            }
         }

         erv $$14 = $$12.y();
         if (!$$14.c()) {
            gjq $$15 = giy.a($$14);
            fem $$16 = this.a($$9, $$3, $$15);
            this.a.a($$11, $$1, $$16, $$12, $$14);
         }

         if ($$12.o() == dow.c) {
            gjq $$17 = giy.a($$12);
            fem $$18 = this.a($$9, $$3, $$17);
            $$8.a();
            $$8.a((float)kj.b($$11.u()), (float)kj.b($$11.v()), (float)kj.b($$11.w()));
            this.a.a($$12, $$11, $$1, $$8, $$18, true, $$10);
            $$8.b();
         }
      }

      for (Entry<gjq, fem> $$19 : $$9.entrySet()) {
         gjq $$20 = $$19.getKey();
         feq $$21 = $$19.getValue().a();
         if ($$21 != null) {
            if ($$20 == gjq.f()) {
               $$4.e = $$21.a($$3.a(gjq.f()), $$2);
            }

            $$4.c.put($$20, $$21);
         }
      }

      gkl.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fem a(Map<gjq, fem> $$0, gjt $$1, gjq $$2) {
      fem $$3 = $$0.get($$2);
      if ($$3 == null) {
         feo $$4 = $$1.a($$2);
         $$3 = new fem($$4, few.c.h, fep.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dsy> void a(gms.a $$0, E $$1) {
      glr<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dsy> a = new ArrayList<>();
      public final List<dsy> b = new ArrayList<>();
      public final Map<gjq, feq> c = new Reference2ObjectArrayMap();
      public gmv d = new gmv();
      @Nullable
      public feq.b e;

      public void a() {
         this.c.values().forEach(feq::close);
      }
   }
}
