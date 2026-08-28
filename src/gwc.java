import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gwc {
   private static final int a = 0;
   private final hgw b;
   private final Function<gwc.a, akv> c;
   private final Function<gwc.b, her> d;

   public gwc(hgw $$0, heq $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hgx.d $$0, aku<der> $$1, gcv $$2, cwo $$3, fft $$4, glx $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hgx.d $$0, aku<der> $$1, gcv $$2, cwo $$3, fft $$4, glx $$5, int $$6, @Nullable akv $$7) {
      List<hgx.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(awy.bO) ? czc.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hgx.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               akv $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gwc.a($$0, $$11));
               ffx $$14 = gtb.a($$5, gmh.a($$13), $$10);
               $$2.a($$4, $$14, $$6, heh.d, $$12);
               $$10 = false;
            }
         }

         dev $$15 = $$3.a(kv.U);
         if ($$15 != null) {
            her $$16 = this.d.apply(new gwc.b($$15, $$0, $$1));
            ffx $$17 = $$16.a($$5.getBuffer(gms.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, heh.d);
         }
      }
   }

   private static int a(hgx.c $$0, int $$1) {
      Optional<hgx.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axk::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hgx.d a, hgx.c b) {
   }

   static record b(dev a, hgx.d b, aku<der> c) {
      private static String a(jr<dew> $$0, aku<der> $$1) {
         String $$2 = $$0.a().c().get($$1);
         return $$2 != null ? $$2 : $$0.a().a();
      }

      public akv a() {
         akv $$0 = this.a.b().a().a();
         String $$1 = a(this.a.a(), this.c);
         return $$0.a((UnaryOperator<String>)($$1x -> "trims/entity/" + this.b.c() + "/" + $$1x + "_" + $$1));
      }

      public dev b() {
         return this.a;
      }

      public hgx.d c() {
         return this.b;
      }

      public aku<der> d() {
         return this.c;
      }
   }
}
