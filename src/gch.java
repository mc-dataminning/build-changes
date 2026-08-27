import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gch implements atf {
   private Map<dmq<?>, gci<?>> d = ImmutableMap.of();
   private final fdj e;
   private final ftr f;
   public czg a;
   public fbj b;
   public esh c;
   private final Supplier<gbc> g;
   private final Supplier<ggp> h;
   private final Supplier<gfp> i;

   public gch(fdj $$0, ftr $$1, Supplier<gbc> $$2, Supplier<ggp> $$3, Supplier<gfp> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dmo> gci<E> a(E $$0) {
      return (gci<E>)this.d.get($$0.r());
   }

   public void a(czg $$0, fbj $$1, esh $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dmo> void a(E $$0, float $$1, ewr $$2, gai $$3) {
      gci<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dmo> void a(gci<T> $$0, T $$1, float $$2, ewr $$3, gai $$4) {
      czg $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gag.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, glj.d);
   }

   public <E extends dmo> boolean a(E $$0, ewr $$1, gai $$2, int $$3, int $$4) {
      gci<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dmo $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable czg $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(ate $$0) {
      gcj.a $$1 = new gcj.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gck.a($$1);
   }
}
