import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gwe {
   private static final int a = 0;
   private final hgy b;
   private final Function<gwe.a, akv> c;
   private final Function<gwe.b, het> d;

   public gwe(hgy $$0, hes $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hgz.d $$0, aku<det> $$1, gcx $$2, cwq $$3, ffv $$4, glz $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hgz.d $$0, aku<det> $$1, gcx $$2, cwq $$3, ffv $$4, glz $$5, int $$6, @Nullable akv $$7) {
      List<hgz.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(awy.bO) ? cze.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hgz.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               akv $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gwe.a($$0, $$11));
               ffz $$14 = gtd.a($$5, gmj.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hej.d, $$12);
               $$10 = false;
            }
         }

         dex $$15 = $$3.a(kv.U);
         if ($$15 != null) {
            het $$16 = this.d.apply(new gwe.b($$15, $$0, $$1));
            ffz $$17 = $$16.a($$5.getBuffer(gmu.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hej.d);
         }
      }
   }

   private static int a(hgz.c $$0, int $$1) {
      Optional<hgz.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axk::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hgz.d a, hgz.c b) {
   }

   static record b(dex a, hgz.d b, aku<det> c) {
      private static String a(jr<dey> $$0, aku<det> $$1) {
         String $$2 = $$0.a().c().get($$1);
         return $$2 != null ? $$2 : $$0.a().a();
      }

      public akv a() {
         akv $$0 = this.a.b().a().a();
         String $$1 = a(this.a.a(), this.c);
         return $$0.a((UnaryOperator<String>)($$1x -> "trims/entity/" + this.b.c() + "/" + $$1x + "_" + $$1));
      }

      public dex b() {
         return this.a;
      }

      public hgz.d c() {
         return this.b;
      }

      public aku<det> d() {
         return this.c;
      }
   }
}
