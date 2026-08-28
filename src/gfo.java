import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfo implements auq {
   private Map<dpk<?>, gfp<?>> d = ImmutableMap.of();
   private final fgq e;
   private final fwx f;
   public dbz a;
   public fer b;
   public evq c;
   private final Supplier<gej> g;
   private final Supplier<gjw> h;
   private final Supplier<giw> i;

   public gfo(fgq $$0, fwx $$1, Supplier<gej> $$2, Supplier<gjw> $$3, Supplier<giw> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dpi> gfp<E> a(E $$0) {
      return (gfp<E>)this.d.get($$0.r());
   }

   public void a(dbz $$0, fer $$1, evq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dpi> void a(E $$0, float $$1, ezz $$2, gdp $$3) {
      gfp<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dpi> void a(gfp<T> $$0, T $$1, float $$2, ezz $$3, gdp $$4) {
      dbz $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdn.a($$5, $$1.ay_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gor.d);
   }

   public <E extends dpi> boolean a(E $$0, ezz $$1, gdp $$2, int $$3, int $$4) {
      gfp<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dpi $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dbz $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gfq.a $$1 = new gfq.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfr.a($$1);
   }
}
