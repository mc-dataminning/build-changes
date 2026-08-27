import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fve implements aqi {
   private Map<dgw<?>, fvf<?>> d = ImmutableMap.of();
   private final ewq e;
   private final fmr f;
   public cto a;
   public eur b;
   public elq c;
   private final Supplier<ftz> g;
   private final Supplier<fzj> h;
   private final Supplier<fyj> i;

   public fve(ewq $$0, fmr $$1, Supplier<ftz> $$2, Supplier<fzj> $$3, Supplier<fyj> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dgu> fvf<E> a(E $$0) {
      return (fvf<E>)this.d.get($$0.v());
   }

   public void a(cto $$0, eur $$1, elq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dgu> void a(E $$0, float $$1, epz $$2, ftf $$3) {
      fvf<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dgu> void a(fvf<T> $$0, T $$1, float $$2, epz $$3, ftf $$4) {
      cto $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ftd.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gec.d);
   }

   public <E extends dgu> boolean a(E $$0, epz $$1, ftf $$2, int $$3, int $$4) {
      fvf<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dgu $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cto $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aqh $$0) {
      fvg.a $$1 = new fvg.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fvh.a($$1);
   }
}
