import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gwd {
   private static final int a = 0;
   private final hgx b;
   private final Function<gwd.a, akv> c;
   private final Function<gwd.b, hes> d;

   public gwd(hgx $$0, her $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hgy.d $$0, aku<des> $$1, gcw $$2, cwp $$3, ffu $$4, gly $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hgy.d $$0, aku<des> $$1, gcw $$2, cwp $$3, ffu $$4, gly $$5, int $$6, @Nullable akv $$7) {
      List<hgy.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(awy.bO) ? czd.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hgy.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               akv $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gwd.a($$0, $$11));
               ffy $$14 = gtc.a($$5, gmi.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hei.d, $$12);
               $$10 = false;
            }
         }

         dew $$15 = $$3.a(kv.U);
         if ($$15 != null) {
            hes $$16 = this.d.apply(new gwd.b($$15, $$0, $$1));
            ffy $$17 = $$16.a($$5.getBuffer(gmt.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hei.d);
         }
      }
   }

   private static int a(hgy.c $$0, int $$1) {
      Optional<hgy.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axk::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hgy.d a, hgy.c b) {
   }

   static record b(dew a, hgy.d b, aku<des> c) {
      private static String a(jr<dex> $$0, aku<des> $$1) {
         String $$2 = $$0.a().c().get($$1);
         return $$2 != null ? $$2 : $$0.a().a();
      }

      public akv a() {
         akv $$0 = this.a.b().a().a();
         String $$1 = a(this.a.a(), this.c);
         return $$0.a((UnaryOperator<String>)($$1x -> "trims/entity/" + this.b.c() + "/" + $$1x + "_" + $$1));
      }

      public dew b() {
         return this.a;
      }

      public hgy.d c() {
         return this.b;
      }

      public aku<des> d() {
         return this.c;
      }
   }
}
