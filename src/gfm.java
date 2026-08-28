import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfm implements aup {
   private Map<dpi<?>, gfn<?>> d = ImmutableMap.of();
   private final fgo e;
   private final fwv f;
   public dbx a;
   public fep b;
   public evo c;
   private final Supplier<geh> g;
   private final Supplier<gju> h;
   private final Supplier<giu> i;

   public gfm(fgo $$0, fwv $$1, Supplier<geh> $$2, Supplier<gju> $$3, Supplier<giu> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpg> gfn<E> a(E $$0) {
      return (gfn<E>)this.d.get($$0.r());
   }

   public void a(dbx $$0, fep $$1, evo $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpg> void a(E $$0, float $$1, ezx $$2, gdn $$3) {
      gfn<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpg> void a(gfn<T> $$0, T $$1, float $$2, ezx $$3, gdn $$4) {
      dbx $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdl.a($$5, $$1.ay_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gop.d);
   }

   public <E extends dpg> boolean a(E $$0, ezx $$1, gdn $$2, int $$3, int $$4) {
      gfn<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpg $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dbx $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(auo $$0) {
      gfo.a $$1 = new gfo.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfp.a($$1);
   }
}
