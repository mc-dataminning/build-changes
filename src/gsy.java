import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gsy {
   private static final int a = 0;
   private final hba b;
   private final Function<gsy.a, all> c;
   private final Function<gsy.b, gyt> d;

   public gsy(hba $$0, gys $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         all $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(ddp.d $$0, all $$1, fzv $$2, cwf $$3, Function<all, gjh> $$4, fek $$5, gix $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, null);
   }

   public void a(ddp.d $$0, all $$1, fzv $$2, cwf $$3, Function<all, gjh> $$4, fek $$5, gix $$6, int $$7, @Nullable all $$8) {
      List<ddp.c> $$9 = this.b.a($$1).a($$0);
      if (!$$9.isEmpty()) {
         int $$10 = $$3.a(axm.bQ) ? cyt.a($$3, 0) : 0;
         boolean $$11 = $$3.B();

         for (ddp.c $$12 : $$9) {
            int $$13 = a($$12, $$10);
            if ($$13 != 0) {
               all $$14 = $$12.c() && $$8 != null ? $$8 : this.c.apply(new gsy.a($$0, $$12));
               feo $$15 = gpy.a($$6, $$4.apply($$14), $$11);
               $$2.a($$5, $$15, $$7, gyk.d, $$13);
               $$11 = false;
            }
         }

         ddt $$16 = $$3.a(ku.U);
         if ($$16 != null) {
            gyt $$17 = this.d.apply(new gsy.b($$16, $$0, $$1));
            feo $$18 = $$17.a($$6.getBuffer(gjs.a($$16.b().a().d())));
            $$2.a($$5, $$18, $$7, gyk.d);
         }
      }
   }

   private static int a(ddp.c $$0, int $$1) {
      Optional<ddp.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axy::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(ddp.d a, ddp.c b) {
   }

   static record b(ddt a, ddp.d b, all c) {
   }
}
