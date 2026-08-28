import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gxc {
   private static final int a = 0;
   private final hhw b;
   private final Function<gxc.a, aku> c;
   private final Function<gxc.b, hfr> d;

   public gxc(hhw $$0, hfq $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hhx.d $$0, akt<dfk> $$1, gdv $$2, cxh $$3, fgr $$4, gmx $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hhx.d $$0, akt<dfk> $$1, gdv $$2, cxh $$3, fgr $$4, gmx $$5, int $$6, @Nullable aku $$7) {
      List<hhx.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(awy.bO) ? czt.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hhx.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               aku $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gxc.a($$0, $$11));
               fgv $$14 = gub.a($$5, gnh.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hfh.d, $$12);
               $$10 = false;
            }
         }

         dfo $$15 = $$3.a(kv.W);
         if ($$15 != null) {
            hfr $$16 = this.d.apply(new gxc.b($$15, $$0, $$1));
            fgv $$17 = $$16.a($$5.getBuffer(gns.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hfh.d);
         }
      }
   }

   private static int a(hhx.c $$0, int $$1) {
      Optional<hhx.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axk::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hhx.d a, hhx.c b) {
   }

   static record b(dfo a, hhx.d b, akt<dfk> c) {
      private static String a(jr<dfp> $$0, akt<dfk> $$1) {
         String $$2 = $$0.a().c().get($$1);
         return $$2 != null ? $$2 : $$0.a().a();
      }

      public aku a() {
         aku $$0 = this.a.b().a().a();
         String $$1 = a(this.a.a(), this.c);
         return $$0.a((UnaryOperator<String>)($$1x -> "trims/entity/" + this.b.c() + "/" + $$1x + "_" + $$1));
      }

      public dfo b() {
         return this.a;
      }

      public hhx.d c() {
         return this.b;
      }

      public akt<dfk> d() {
         return this.c;
      }
   }
}
