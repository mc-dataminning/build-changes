import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hbu {
   private static final int a = 0;
   private final hmv b;
   private final Function<hbu.a, alr> c;
   private final Function<hbu.b, hkq> d;

   public hbu(hmv $$0, hkp $$1) {
      this.b = $$0;
      this.c = ag.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ag.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hmw.d $$0, alq<dir> $$1, gij $$2, dak $$3, fld $$4, grn $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hmw.d $$0, alq<dir> $$1, gij $$2, dak $$3, fld $$4, grn $$5, int $$6, @Nullable alr $$7) {
      List<hmw.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = dcx.a($$3, 0);
         boolean $$10 = $$3.C();

         for (hmw.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alr $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new hbu.a($$0, $$11));
               flg $$14 = gyt.a($$5, gry.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hkg.d, $$12);
               $$10 = false;
            }
         }

         div $$15 = $$3.a(kl.W);
         if ($$15 != null) {
            hkq $$16 = this.d.apply(new hbu.b($$15, $$0, $$1));
            flg $$17 = $$16.a($$5.getBuffer(gsh.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hkg.d);
         }
      }
   }

   private static int a(hmw.c $$0, int $$1) {
      Optional<hmw.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(ayh::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hmw.d a, hmw.c b) {
   }

   static record b(div a, hmw.d b, alq<dir> c) {
      public alr a() {
         return this.a.a(this.b.a(), this.c);
      }

      public div b() {
         return this.a;
      }

      public hmw.d c() {
         return this.b;
      }

      public alq<dir> d() {
         return this.c;
      }
   }
}
