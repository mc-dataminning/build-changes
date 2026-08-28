import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gwa {
   private static final int a = 0;
   private final hgq b;
   private final Function<gwa.a, aku> c;
   private final Function<gwa.b, hem> d;

   public gwa(hgq $$0, hel $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hgr.d $$0, akt<deq> $$1, gct $$2, cwn $$3, ffs $$4, glv $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hgr.d $$0, akt<deq> $$1, gct $$2, cwn $$3, ffs $$4, glv $$5, int $$6, @Nullable aku $$7) {
      List<hgr.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(awx.bO) ? czb.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hgr.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               aku $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gwa.a($$0, $$11));
               ffw $$14 = gsz.a($$5, gmf.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hec.d, $$12);
               $$10 = false;
            }
         }

         deu $$15 = $$3.a(kv.U);
         if ($$15 != null) {
            hem $$16 = this.d.apply(new gwa.b($$15, $$0, $$1));
            ffw $$17 = $$16.a($$5.getBuffer(gmq.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hec.d);
         }
      }
   }

   private static int a(hgr.c $$0, int $$1) {
      Optional<hgr.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axj::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hgr.d a, hgr.c b) {
   }

   static record b(deu a, hgr.d b, akt<deq> c) {
      private static String a(jr<dev> $$0, akt<deq> $$1) {
         String $$2 = $$0.a().c().get($$1);
         return $$2 != null ? $$2 : $$0.a().a();
      }

      public aku a() {
         aku $$0 = this.a.b().a().a();
         String $$1 = a(this.a.a(), this.c);
         return $$0.a((UnaryOperator<String>)($$1x -> "trims/entity/" + this.b.c() + "/" + $$1x + "_" + $$1));
      }

      public deu b() {
         return this.a;
      }

      public hgr.d c() {
         return this.b;
      }

      public akt<deq> d() {
         return this.c;
      }
   }
}
