import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gnv implements avw {
   private Map<duz<?>, gnw<?>> d = ImmutableMap.of();
   private final fnq e;
   private final gek f;
   public dhi a;
   public flp b;
   public fbw c;
   private final Supplier<gmo> g;
   private final Supplier<gso> h;
   private final Supplier<gro> i;

   public gnv(fnq $$0, gek $$1, Supplier<gmo> $$2, Supplier<gso> $$3, Supplier<gro> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dux> gnw<E> a(E $$0) {
      return (gnw<E>)this.d.get($$0.q());
   }

   public void a(dhi $$0, flp $$1, fbw $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dux> void a(E $$0, float $$1, fgs $$2, gll $$3) {
      gnw<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dux> void a(gnw<T> $$0, T $$1, float $$2, fgs $$3, gll $$4) {
      dhi $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glh.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hbc.d);
   }

   public <E extends dux> boolean a(E $$0, fgs $$1, gll $$2, int $$3, int $$4) {
      gnw<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dux $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dhi $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avv $$0) {
      gnx.a $$1 = new gnx.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gny.a($$1);
   }
}
