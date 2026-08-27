import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gdd implements atp {
   private Map<dnf<?>, gde<?>> d = ImmutableMap.of();
   private final fef e;
   private final fun f;
   public czu a;
   public fcf b;
   public etd c;
   private final Supplier<gby> g;
   private final Supplier<ghl> h;
   private final Supplier<ggl> i;

   public gdd(fef $$0, fun $$1, Supplier<gby> $$2, Supplier<ghl> $$3, Supplier<ggl> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dnd> gde<E> a(E $$0) {
      return (gde<E>)this.d.get($$0.r());
   }

   public void a(czu $$0, fcf $$1, etd $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dnd> void a(E $$0, float $$1, exn $$2, gbe $$3) {
      gde<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dnd> void a(gde<T> $$0, T $$1, float $$2, exn $$3, gbe $$4) {
      czu $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gbc.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gmf.d);
   }

   public <E extends dnd> boolean a(E $$0, exn $$1, gbe $$2, int $$3, int $$4) {
      gde<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dnd $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable czu $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(ato $$0) {
      gdf.a $$1 = new gdf.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gdg.a($$1);
   }
}
