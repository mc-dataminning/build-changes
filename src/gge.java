import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gge implements atx {
   private Map<dps<?>, ggf<?>> d = ImmutableMap.of();
   private final fhf e;
   private final fxm f;
   public dcg a;
   public ffg b;
   public ewf c;
   private final Supplier<gez> g;
   private final Supplier<gkm> h;
   private final Supplier<gjm> i;

   public gge(fhf $$0, fxm $$1, Supplier<gez> $$2, Supplier<gkm> $$3, Supplier<gjm> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpq> ggf<E> a(E $$0) {
      return (ggf<E>)this.d.get($$0.r());
   }

   public void a(dcg $$0, ffg $$1, ewf $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpq> void a(E $$0, float $$1, fao $$2, gef $$3) {
      ggf<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpq> void a(ggf<T> $$0, T $$1, float $$2, fao $$3, gef $$4) {
      dcg $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ged.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gph.d);
   }

   public <E extends dpq> boolean a(E $$0, fao $$1, gef $$2, int $$3, int $$4) {
      ggf<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpq $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dcg $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(atw $$0) {
      ggg.a $$1 = new ggg.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ggh.a($$1);
   }
}
