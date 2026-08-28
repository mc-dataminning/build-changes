import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hag {
   private static final int a = 0;
   private final hlc b;
   private final Function<hag.a, alg> c;
   private final Function<hag.b, hix> d;

   public hag(hlc $$0, hiw $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hld.d $$0, alf<dhk> $$1, ggu $$2, czd $$3, fjj $$4, gqa $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hld.d $$0, alf<dhk> $$1, ggu $$2, czd $$3, fjj $$4, gqa $$5, int $$6, @Nullable alg $$7) {
      List<hld.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(axk.bP) ? dbq.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hld.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alg $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new hag.a($$0, $$11));
               fjn $$14 = gxf.a($$5, gqk.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hin.d, $$12);
               $$10 = false;
            }
         }

         dho $$15 = $$3.a(kj.W);
         if ($$15 != null) {
            hix $$16 = this.d.apply(new hag.b($$15, $$0, $$1));
            fjn $$17 = $$16.a($$5.getBuffer(gqv.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hin.d);
         }
      }
   }

   private static int a(hld.c $$0, int $$1) {
      Optional<hld.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axw::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hld.d a, hld.c b) {
   }

   static record b(dho a, hld.d b, alf<dhk> c) {
      public alg a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dho b() {
         return this.a;
      }

      public hld.d c() {
         return this.b;
      }

      public alf<dhk> d() {
         return this.c;
      }
   }
}
