import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfi implements aum {
   private Map<dpe<?>, gfj<?>> d = ImmutableMap.of();
   private final fgk e;
   private final fwr f;
   public dbt a;
   public fel b;
   public evk c;
   private final Supplier<ged> g;
   private final Supplier<gjq> h;
   private final Supplier<giq> i;

   public gfi(fgk $$0, fwr $$1, Supplier<ged> $$2, Supplier<gjq> $$3, Supplier<giq> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpc> gfj<E> a(E $$0) {
      return (gfj<E>)this.d.get($$0.r());
   }

   public void a(dbt $$0, fel $$1, evk $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpc> void a(E $$0, float $$1, ezt $$2, gdj $$3) {
      gfj<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpc> void a(gfj<T> $$0, T $$1, float $$2, ezt $$3, gdj $$4) {
      dbt $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdh.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gol.d);
   }

   public <E extends dpc> boolean a(E $$0, ezt $$1, gdj $$2, int $$3, int $$4) {
      gfj<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpc $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dbt $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aul $$0) {
      gfk.a $$1 = new gfk.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfl.a($$1);
   }
}
