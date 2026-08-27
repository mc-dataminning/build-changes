import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvg implements aqj {
   private Map<dgx<?>, fvh<?>> d = ImmutableMap.of();
   private final ews e;
   private final fmt f;
   public ctp a;
   public eut b;
   public elr c;
   private final Supplier<fub> g;
   private final Supplier<fzl> h;
   private final Supplier<fyl> i;

   public fvg(ews $$0, fmt $$1, Supplier<fub> $$2, Supplier<fzl> $$3, Supplier<fyl> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dgv> fvh<E> a(E $$0) {
      return (fvh<E>)this.d.get($$0.v());
   }

   public void a(ctp $$0, eut $$1, elr $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dgv> void a(E $$0, float $$1, eqb $$2, fth $$3) {
      fvh<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dgv> void a(fvh<T> $$0, T $$1, float $$2, eqb $$3, fth $$4) {
      ctp $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ftf.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gee.d);
   }

   public <E extends dgv> boolean a(E $$0, eqb $$1, fth $$2, int $$3, int $$4) {
      fvh<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dgv $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable ctp $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aqi $$0) {
      fvi.a $$1 = new fvi.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fvj.a($$1);
   }
}
