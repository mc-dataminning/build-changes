import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hcj {
   private static final int a = 0;
   private final hnh b;
   private final Function<hcj.a, alk> c;
   private final Function<hcj.b, hlc> d;

   public hcj(hnh $$0, hlb $$1) {
      this.b = $$0;
      this.c = ag.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ag.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hni.d $$0, alj<dih> $$1, giy $$2, daa $$3, flq $$4, gsc $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hni.d $$0, alj<dih> $$1, giy $$2, daa $$3, flq $$4, gsc $$5, int $$6, @Nullable alk $$7) {
      List<hni.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = dcn.a($$3, 0);
         boolean $$10 = $$3.C();

         for (hni.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alk $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new hcj.a($$0, $$11));
               flt $$14 = gzi.a($$5, gsn.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hks.d, $$12);
               $$10 = false;
            }
         }

         dil $$15 = $$3.a(kl.W);
         if ($$15 != null) {
            hlc $$16 = this.d.apply(new hcj.b($$15, $$0, $$1));
            flt $$17 = $$16.a($$5.getBuffer(gsw.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hks.d);
         }
      }
   }

   private static int a(hni.c $$0, int $$1) {
      Optional<hni.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(aya::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hni.d a, hni.c b) {
   }

   static record b(dil a, hni.d b, alj<dih> c) {
      public alk a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dil b() {
         return this.a;
      }

      public hni.d c() {
         return this.b;
      }

      public alj<dih> d() {
         return this.c;
      }
   }
}
