import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class grx {
   private static final int a = 0;
   private final gzz b;
   private final Function<grx.a, alh> c;
   private final Function<grx.b, gxs> d;

   public grx(gzz $$0, gxr $$1) {
      this.b = $$0;
      this.c = ad.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ad.b($$1x -> {
         alh $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(ddf.d $$0, alh $$1, fyu $$2, cvx $$3, Function<alh, gig> $$4, fdt $$5, ghw $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, null);
   }

   public void a(ddf.d $$0, alh $$1, fyu $$2, cvx $$3, Function<alh, gig> $$4, fdt $$5, ghw $$6, int $$7, @Nullable alh $$8) {
      List<ddf.c> $$9 = this.b.a($$1).a($$0);
      if (!$$9.isEmpty()) {
         int $$10 = $$3.a(axi.bM) ? cyj.a($$3, 0) : 0;
         boolean $$11 = $$3.B();

         for (ddf.c $$12 : $$9) {
            int $$13 = a($$12, $$10);
            if ($$13 != 0) {
               alh $$14 = $$12.c() && $$8 != null ? $$8 : this.c.apply(new grx.a($$0, $$12));
               fdx $$15 = gox.a($$6, $$4.apply($$14), $$11);
               $$2.a($$5, $$15, $$7, gxj.d, $$13);
               $$11 = false;
            }
         }

         ddj $$16 = $$3.a(kt.T);
         if ($$16 != null) {
            gxs $$17 = this.d.apply(new grx.b($$16, $$0, $$1));
            fdx $$18 = $$17.a($$6.getBuffer(gir.a($$16.b().a().d())));
            $$2.a($$5, $$18, $$7, gxj.d);
         }
      }
   }

   private static int a(ddf.c $$0, int $$1) {
      Optional<ddf.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axu::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(ddf.d a, ddf.c b) {
   }

   static record b(ddj a, ddf.d b, alh c) {
   }
}
