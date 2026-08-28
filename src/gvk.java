import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gvk {
   private static final int a = 0;
   private final hdn b;
   private final Function<gvk.a, alp> c;
   private final Function<gvk.b, hbg> d;

   public gvk(hdn $$0, hbf $$1) {
      this.b = $$0;
      this.c = ae.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ae.b($$1x -> {
         alp $$2 = $$1x.a.a($$1x.b, $$1x.c);
         return $$1.a($$2);
      });
   }

   public void a(dfj.d $$0, alp $$1, gcc $$2, cxg $$3, fgl $$4, glg $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(dfj.d $$0, alp $$1, gcc $$2, cxg $$3, fgl $$4, glg $$5, int $$6, @Nullable alp $$7) {
      List<dfj.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(axt.bR) ? czu.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (dfj.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alp $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gvk.a($$0, $$11));
               fgp $$14 = gsj.a($$5, glq.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hax.d, $$12);
               $$10 = false;
            }
         }

         dfn $$15 = $$3.a(ku.U);
         if ($$15 != null) {
            hbg $$16 = this.d.apply(new gvk.b($$15, $$0, $$1));
            fgp $$17 = $$16.a($$5.getBuffer(gmb.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hax.d);
         }
      }
   }

   private static int a(dfj.c $$0, int $$1) {
      Optional<dfj.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(ayf::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(dfj.d a, dfj.c b) {
   }

   static record b(dfn a, dfj.d b, alp c) {
   }
}
