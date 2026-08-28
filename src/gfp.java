import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfp implements auq {
   private Map<dpl<?>, gfq<?>> d = ImmutableMap.of();
   private final fgr e;
   private final fwy f;
   public dca a;
   public fes b;
   public evr c;
   private final Supplier<gek> g;
   private final Supplier<gjx> h;
   private final Supplier<gix> i;

   public gfp(fgr $$0, fwy $$1, Supplier<gek> $$2, Supplier<gjx> $$3, Supplier<gix> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpj> gfq<E> a(E $$0) {
      return (gfq<E>)this.d.get($$0.r());
   }

   public void a(dca $$0, fes $$1, evr $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpj> void a(E $$0, float $$1, faa $$2, gdq $$3) {
      gfq<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpj> void a(gfq<T> $$0, T $$1, float $$2, faa $$3, gdq $$4) {
      dca $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdo.a($$5, $$1.ay_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gos.d);
   }

   public <E extends dpj> boolean a(E $$0, faa $$1, gdq $$2, int $$3, int $$4) {
      gfq<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpj $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dca $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gfr.a $$1 = new gfr.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfs.a($$1);
   }
}
