import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfw implements atv {
   private Map<dpp<?>, gfx<?>> d = ImmutableMap.of();
   private final fgx e;
   private final fxe f;
   public dcd a;
   public fey b;
   public evx c;
   private final Supplier<ger> g;
   private final Supplier<gke> h;
   private final Supplier<gje> i;

   public gfw(fgx $$0, fxe $$1, Supplier<ger> $$2, Supplier<gke> $$3, Supplier<gje> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpn> gfx<E> a(E $$0) {
      return (gfx<E>)this.d.get($$0.r());
   }

   public void a(dcd $$0, fey $$1, evx $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpn> void a(E $$0, float $$1, fag $$2, gdx $$3) {
      gfx<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpn> void a(gfx<T> $$0, T $$1, float $$2, fag $$3, gdx $$4) {
      dcd $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdv.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, goz.d);
   }

   public <E extends dpn> boolean a(E $$0, fag $$1, gdx $$2, int $$3, int $$4) {
      gfx<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpn $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dcd $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(atu $$0) {
      gfy.a $$1 = new gfy.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfz.a($$1);
   }
}
