import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gzy {
   private static final int a = 0;
   private final hku b;
   private final Function<gzy.a, alg> c;
   private final Function<gzy.b, hip> d;

   public gzy(hku $$0, hio $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hkv.d $$0, alf<dhf> $$1, ggm $$2, cyy $$3, fjc $$4, gps $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hkv.d $$0, alf<dhf> $$1, ggm $$2, cyy $$3, fjc $$4, gps $$5, int $$6, @Nullable alg $$7) {
      List<hkv.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(axk.bO) ? dbl.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hkv.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alg $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gzy.a($$0, $$11));
               fjg $$14 = gwx.a($$5, gqc.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hif.d, $$12);
               $$10 = false;
            }
         }

         dhj $$15 = $$3.a(kj.W);
         if ($$15 != null) {
            hip $$16 = this.d.apply(new gzy.b($$15, $$0, $$1));
            fjg $$17 = $$16.a($$5.getBuffer(gqn.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hif.d);
         }
      }
   }

   private static int a(hkv.c $$0, int $$1) {
      Optional<hkv.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axw::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hkv.d a, hkv.c b) {
   }

   static record b(dhj a, hkv.d b, alf<dhf> c) {
      public alg a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dhj b() {
         return this.a;
      }

      public hkv.d c() {
         return this.b;
      }

      public alf<dhf> d() {
         return this.c;
      }
   }
}
