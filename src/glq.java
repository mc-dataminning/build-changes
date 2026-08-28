import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class glq implements ave {
   private Map<dta<?>, glr<?>> d = ImmutableMap.of();
   private final flo e;
   private final gch f;
   public dfm a;
   public fjn b;
   public ezw c;
   private final Supplier<gkj> g;
   private final Supplier<gqi> h;
   private final Supplier<gpi> i;

   public glq(flo $$0, gch $$1, Supplier<gkj> $$2, Supplier<gqi> $$3, Supplier<gpi> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dsy> glr<E> a(E $$0) {
      return (glr<E>)this.d.get($$0.q());
   }

   public void a(dfm $$0, fjn $$1, ezw $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dsy> void a(E $$0, float $$1, fer $$2, gjg $$3) {
      glr<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dsy> void a(glr<T> $$0, T $$1, float $$2, fer $$3, gjg $$4) {
      dfm $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gjc.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gyv.d);
   }

   public <E extends dsy> boolean a(E $$0, fer $$1, gjg $$2, int $$3, int $$4) {
      glr<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dsy $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dfm $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avd $$0) {
      gls.a $$1 = new gls.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = glt.a($$1);
   }
}
