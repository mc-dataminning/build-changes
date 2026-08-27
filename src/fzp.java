import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzp implements asp {
   private Map<dki<?>, fzq<?>> d = ImmutableMap.of();
   private final far e;
   private final fqz f;
   public cwz a;
   public eyr b;
   public epp c;
   private final Supplier<fyk> g;
   private final Supplier<gdw> h;
   private final Supplier<gcw> i;

   public fzp(far $$0, fqz $$1, Supplier<fyk> $$2, Supplier<gdw> $$3, Supplier<gcw> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dkg> fzq<E> a(E $$0) {
      return (fzq<E>)this.d.get($$0.r());
   }

   public void a(cwz $$0, eyr $$1, epp $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dkg> void a(E $$0, float $$1, etz $$2, fxq $$3) {
      fzq<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dkg> void a(fzq<T> $$0, T $$1, float $$2, etz $$3, fxq $$4) {
      cwz $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fxo.a($$5, $$1.aC_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, giq.d);
   }

   public <E extends dkg> boolean a(E $$0, etz $$1, fxq $$2, int $$3, int $$4) {
      fzq<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dkg $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cwz $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aso $$0) {
      fzr.a $$1 = new fzr.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fzs.a($$1);
   }
}
