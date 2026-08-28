import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gye {
   private static final int a = 0;
   private final hix b;
   private final Function<gye.a, ald> c;
   private final Function<gye.b, hgs> d;

   public gye(hix $$0, hgr $$1) {
      this.b = $$0;
      this.c = af.b($$0x -> $$0x.b.a($$0x.a));
      this.d = af.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hiy.d $$0, alc<dga> $$1, gew $$2, cxy $$3, fho $$4, gny $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hiy.d $$0, alc<dga> $$1, gew $$2, cxy $$3, fho $$4, gny $$5, int $$6, @Nullable ald $$7) {
      List<hiy.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(axi.bO) ? daj.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hiy.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               ald $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new gye.a($$0, $$11));
               fhs $$14 = gvd.a($$5, goi.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hgi.d, $$12);
               $$10 = false;
            }
         }

         dge $$15 = $$3.a(kx.W);
         if ($$15 != null) {
            hgs $$16 = this.d.apply(new gye.b($$15, $$0, $$1));
            fhs $$17 = $$16.a($$5.getBuffer(got.a($$15.b().a().d())));
            $$2.a($$4, $$17, $$6, hgi.d);
         }
      }
   }

   private static int a(hiy.c $$0, int $$1) {
      Optional<hiy.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axu::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hiy.d a, hiy.c b) {
   }

   static record b(dge a, hiy.d b, alc<dga> c) {
      private static String a(js<dgf> $$0, alc<dga> $$1) {
         String $$2 = $$0.a().c().get($$1);
         return $$2 != null ? $$2 : $$0.a().a();
      }

      public ald a() {
         ald $$0 = this.a.b().a().a();
         String $$1 = a(this.a.a(), this.c);
         return $$0.a((UnaryOperator<String>)($$1x -> "trims/entity/" + this.b.c() + "/" + $$1x + "_" + $$1));
      }

      public dge b() {
         return this.a;
      }

      public hiy.d c() {
         return this.b;
      }

      public alc<dga> d() {
         return this.c;
      }
   }
}
