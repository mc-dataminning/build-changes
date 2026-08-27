import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gby implements atd {
   private Map<dmh<?>, gbz<?>> d = ImmutableMap.of();
   private final fda e;
   private final fti f;
   public cyx a;
   public fba b;
   public ery c;
   private final Supplier<gat> g;
   private final Supplier<ggg> h;
   private final Supplier<gfg> i;

   public gby(fda $$0, fti $$1, Supplier<gat> $$2, Supplier<ggg> $$3, Supplier<gfg> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dmf> gbz<E> a(E $$0) {
      return (gbz<E>)this.d.get($$0.r());
   }

   public void a(cyx $$0, fba $$1, ery $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dmf> void a(E $$0, float $$1, ewi $$2, fzz $$3) {
      gbz<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dmf> void a(gbz<T> $$0, T $$1, float $$2, ewi $$3, fzz $$4) {
      cyx $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fzx.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gla.d);
   }

   public <E extends dmf> boolean a(E $$0, ewi $$1, fzz $$2, int $$3, int $$4) {
      gbz<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dmf $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cyx $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(atc $$0) {
      gca.a $$1 = new gca.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gcb.a($$1);
   }
}
