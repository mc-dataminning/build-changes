import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfl implements aup {
   private Map<dph<?>, gfm<?>> d = ImmutableMap.of();
   private final fgn e;
   private final fwu f;
   public dbw a;
   public feo b;
   public evn c;
   private final Supplier<geg> g;
   private final Supplier<gjt> h;
   private final Supplier<git> i;

   public gfl(fgn $$0, fwu $$1, Supplier<geg> $$2, Supplier<gjt> $$3, Supplier<git> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpf> gfm<E> a(E $$0) {
      return (gfm<E>)this.d.get($$0.r());
   }

   public void a(dbw $$0, feo $$1, evn $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpf> void a(E $$0, float $$1, ezw $$2, gdm $$3) {
      gfm<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpf> void a(gfm<T> $$0, T $$1, float $$2, ezw $$3, gdm $$4) {
      dbw $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdk.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, goo.d);
   }

   public <E extends dpf> boolean a(E $$0, ezw $$1, gdm $$2, int $$3, int $$4) {
      gfm<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpf $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dbw $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(auo $$0) {
      gfn.a $$1 = new gfn.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfo.a($$1);
   }
}
