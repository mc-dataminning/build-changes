import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hax {
   private static final int a = 0;
   private final hlv b;
   private final Function<hax.a, alg> c;
   private final Function<hax.b, hjq> d;

   public hax(hlv $$0, hjp $$1) {
      this.b = $$0;
      this.c = ag.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ag.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hlw.d $$0, alf<dhu> $$1, ghl $$2, czn $$3, fkd $$4, gqr $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hlw.d $$0, alf<dhu> $$1, ghl $$2, czn $$3, fkd $$4, gqr $$5, int $$6, @Nullable alg $$7) {
      List<hlw.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = dca.a($$3, 0);
         boolean $$10 = $$3.C();

         for (hlw.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alg $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new hax.a($$0, $$11));
               fkh $$14 = gxw.a($$5, grc.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hjg.d, $$12);
               $$10 = false;
            }
         }

         dhy $$15 = $$3.a(kk.W);
         if ($$15 != null) {
            hjq $$16 = this.d.apply(new hax.b($$15, $$0, $$1));
            fkh $$17 = $$16.a($$5.getBuffer(grl.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hjg.d);
         }
      }
   }

   private static int a(hlw.c $$0, int $$1) {
      Optional<hlw.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axw::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hlw.d a, hlw.c b) {
   }

   static record b(dhy a, hlw.d b, alf<dhu> c) {
      public alg a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dhy b() {
         return this.a;
      }

      public hlw.d c() {
         return this.b;
      }

      public alf<dhu> d() {
         return this.c;
      }
   }
}
