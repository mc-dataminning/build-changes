import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class has {
   private static final int a = 0;
   private final hlo b;
   private final Function<has.a, alg> c;
   private final Function<has.b, hjk> d;

   public has(hlo $$0, hjj $$1) {
      this.b = $$0;
      this.c = ag.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ag.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(hlp.d $$0, alf<dhr> $$1, ghg $$2, czk $$3, fjy $$4, gqm $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(hlp.d $$0, alf<dhr> $$1, ghg $$2, czk $$3, fjy $$4, gqm $$5, int $$6, @Nullable alg $$7) {
      List<hlp.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = $$3.a(axk.bP) ? dbx.a($$3, 0) : 0;
         boolean $$10 = $$3.C();

         for (hlp.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               alg $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new has.a($$0, $$11));
               fkc $$14 = gxr.a($$5, gqx.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hja.d, $$12);
               $$10 = false;
            }
         }

         dhv $$15 = $$3.a(kk.W);
         if ($$15 != null) {
            hjk $$16 = this.d.apply(new has.b($$15, $$0, $$1));
            fkc $$17 = $$16.a($$5.getBuffer(grg.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hja.d);
         }
      }
   }

   private static int a(hlp.c $$0, int $$1) {
      Optional<hlp.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(axw::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   static record a(hlp.d a, hlp.c b) {
   }

   static record b(dhv a, hlp.d b, alf<dhr> c) {
      public alg a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dhv b() {
         return this.a;
      }

      public hlp.d c() {
         return this.b;
      }

      public alf<dhr> d() {
         return this.c;
      }
   }
}
