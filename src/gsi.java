import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gsi {
   private static final int a = 0;
   private final hak b;
   private final Function<gsi.a, ali> c;
   private final Function<gsi.b, gyd> d;

   public gsi(hak $$0, gyc $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         ali $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(ddl.d $$0, ali $$1, fzf $$2, cwb $$3, Function<ali, gir> $$4, feb $$5, gih $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, null);
   }

   public void a(ddl.d $$0, ali $$1, fzf $$2, cwb $$3, Function<ali, gir> $$4, feb $$5, gih $$6, int $$7, @Nullable ali $$8) {
      List<ddl.c> $$9 = this.b.a($$1).a($$0);
      if (!$$9.isEmpty()) {
         int $$10 = $$3.a(axj.bP) ? cyp.a($$3, 0) : 0;
         boolean $$11 = $$3.B();

         for (ddl.c $$12 : $$9) {
            int $$13 = a($$12, $$10);
            if ($$13 != 0) {
               ali $$14 = $$12.c() && $$8 != null ? $$8 : this.c.apply(new gsi.a($$0, $$12));
               fef $$15 = gpi.a($$6, $$4.apply($$14), $$11);
               $$2.a($$5, $$15, $$7, gxu.d, $$13);
               $$11 = false;
            }
         }

         ddp $$16 = $$3.a(ku.U);
         if ($$16 != null) {
            gyd $$17 = this.d.apply(new gsi.b($$16, $$0, $$1));
            fef $$18 = $$17.a($$6.getBuffer(gjc.a($$16.b().a().d())));
            $$2.a($$5, $$18, $$7, gxu.d);
         }
      }
   }

   private static int a(ddl.c $$0, int $$1) {
      Optional<ddl.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axv::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(ddl.d a, ddl.c b) {
   }

   static record b(ddp a, ddl.d b, ali c) {
   }
}
