import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gzj {
   private static final int a = 0;
   private final hke b;
   private final Function<gzj.a, ale> c;
   private final Function<gzj.b, hhz> d;

   public gzj(hke $$0, hhy $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hkf.d $$0, ald<dgz> $$1, gfz $$2, cys $$3, fiq $$4, gpd $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hkf.d $$0, ald<dgz> $$1, gfz $$2, cys $$3, fiq $$4, gpd $$5, int $$6, @Nullable ale $$7) {
      List<hkf.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(axi.bO) ? dbf.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hkf.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               ale $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gzj.a($$0, $$11));
               fiu $$14 = gwi.a($$5, gpn.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hhp.d, $$12);
               $$10 = false;
            }
         }

         dhd $$15 = $$3.a(kj.W);
         if ($$15 != null) {
            hhz $$16 = this.d.apply(new gzj.b($$15, $$0, $$1));
            fiu $$17 = $$16.a($$5.getBuffer(gpy.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hhp.d);
         }
      }
   }

   private static int a(hkf.c $$0, int $$1) {
      Optional<hkf.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axu::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hkf.d a, hkf.c b) {
   }

   static record b(dhd a, hkf.d b, ald<dgz> c) {
      public ale a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dhd b() {
         return this.a;
      }

      public hkf.d c() {
         return this.b;
      }

      public ald<dgz> d() {
         return this.c;
      }
   }
}
