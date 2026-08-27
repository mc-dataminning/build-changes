import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gdn implements ats {
   private Map<dno<?>, gdo<?>> d = ImmutableMap.of();
   private final fep e;
   private final fux f;
   public dad a;
   public fcp b;
   public etn c;
   private final Supplier<gci> g;
   private final Supplier<ghv> h;
   private final Supplier<ggv> i;

   public gdn(fep $$0, fux $$1, Supplier<gci> $$2, Supplier<ghv> $$3, Supplier<ggv> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dnm> gdo<E> a(E $$0) {
      return (gdo<E>)this.d.get($$0.r());
   }

   public void a(dad $$0, fcp $$1, etn $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dnm> void a(E $$0, float $$1, exx $$2, gbo $$3) {
      gdo<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dnm> void a(gdo<T> $$0, T $$1, float $$2, exx $$3, gbo $$4) {
      dad $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gbm.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gmp.d);
   }

   public <E extends dnm> boolean a(E $$0, exx $$1, gbo $$2, int $$3, int $$4) {
      gdo<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dnm $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dad $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(atr $$0) {
      gdp.a $$1 = new gdp.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gdq.a($$1);
   }
}
