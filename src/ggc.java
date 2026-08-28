import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggc implements atx {
   private Map<dpr<?>, ggd<?>> d = ImmutableMap.of();
   private final fhd e;
   private final fxk f;
   public dcf a;
   public ffe b;
   public ewd c;
   private final Supplier<gex> g;
   private final Supplier<gkk> h;
   private final Supplier<gjk> i;

   public ggc(fhd $$0, fxk $$1, Supplier<gex> $$2, Supplier<gkk> $$3, Supplier<gjk> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpp> ggd<E> a(E $$0) {
      return (ggd<E>)this.d.get($$0.r());
   }

   public void a(dcf $$0, ffe $$1, ewd $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpp> void a(E $$0, float $$1, fam $$2, ged $$3) {
      ggd<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpp> void a(ggd<T> $$0, T $$1, float $$2, fam $$3, ged $$4) {
      dcf $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = geb.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gpf.d);
   }

   public <E extends dpp> boolean a(E $$0, fam $$1, ged $$2, int $$3, int $$4) {
      ggd<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpp $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dcf $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(atw $$0) {
      gge.a $$1 = new gge.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ggf.a($$1);
   }
}
