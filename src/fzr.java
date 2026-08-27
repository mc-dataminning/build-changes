import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzr implements asp {
   private Map<dkk<?>, fzs<?>> d = ImmutableMap.of();
   private final fat e;
   private final frb f;
   public cxb a;
   public eyt b;
   public epr c;
   private final Supplier<fym> g;
   private final Supplier<gdz> h;
   private final Supplier<gcz> i;

   public fzr(fat $$0, frb $$1, Supplier<fym> $$2, Supplier<gdz> $$3, Supplier<gcz> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dki> fzs<E> a(E $$0) {
      return (fzs<E>)this.d.get($$0.r());
   }

   public void a(cxb $$0, eyt $$1, epr $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dki> void a(E $$0, float $$1, eub $$2, fxs $$3) {
      fzs<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dki> void a(fzs<T> $$0, T $$1, float $$2, eub $$3, fxs $$4) {
      cxb $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fxq.a($$5, $$1.aC_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, git.d);
   }

   public <E extends dki> boolean a(E $$0, eub $$1, fxs $$2, int $$3, int $$4) {
      fzs<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dki $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cxb $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aso $$0) {
      fzt.a $$1 = new fzt.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fzu.a($$1);
   }
}
