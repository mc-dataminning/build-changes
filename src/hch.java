import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hch {
   private static final int a = 0;
   private final hnf b;
   private final Function<hch.a, ali> c;
   private final Function<hch.b, hla> d;

   public hch(hnf $$0, hkz $$1) {
      this.b = $$0;
      this.c = ag.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ag.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hng.d $$0, alh<dif> $$1, giw $$2, czy $$3, flo $$4, gsa $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hng.d $$0, alh<dif> $$1, giw $$2, czy $$3, flo $$4, gsa $$5, int $$6, @Nullable ali $$7) {
      List<hng.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = dcl.a($$3, 0);
         boolean $$10 = $$3.C();

         for (hng.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               ali $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new hch.a($$0, $$11));
               flr $$14 = gzg.a($$5, gsl.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hkq.d, $$12);
               $$10 = false;
            }
         }

         dij $$15 = $$3.a(kk.W);
         if ($$15 != null) {
            hla $$16 = this.d.apply(new hch.b($$15, $$0, $$1));
            flr $$17 = $$16.a($$5.getBuffer(gsu.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hkq.d);
         }
      }
   }

   private static int a(hng.c $$0, int $$1) {
      Optional<hng.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axy::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hng.d a, hng.c b) {
   }

   static record b(dij a, hng.d b, alh<dif> c) {
      public ali a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dij b() {
         return this.a;
      }

      public hng.d c() {
         return this.b;
      }

      public alh<dif> d() {
         return this.c;
      }
   }
}
