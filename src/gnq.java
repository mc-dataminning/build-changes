import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gnq implements avm {
   private Map<dus<?>, gnr<?>> d = ImmutableMap.of();
   private final fnj e;
   private final gef f;
   public dgz a;
   public fli b;
   public fbp c;
   private final Supplier<gmj> g;
   private final Supplier<gsj> h;
   private final Supplier<grj> i;

   public gnq(fnj $$0, gef $$1, Supplier<gmj> $$2, Supplier<gsj> $$3, Supplier<grj> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends duq> gnr<E> a(E $$0) {
      return (gnr<E>)this.d.get($$0.p());
   }

   public void a(dgz $$0, fli $$1, fbp $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends duq> void a(E $$0, float $$1, fgl $$2, glg $$3) {
      gnr<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.p().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends duq> void a(gnr<T> $$0, T $$1, float $$2, fgl $$3, glg $$4) {
      dgz $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glc.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hax.d);
   }

   public <E extends duq> boolean a(E $$0, fgl $$1, glg $$2, int $$3, int $$4) {
      gnr<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(duq $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dgz $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avl $$0) {
      gns.a $$1 = new gns.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gnt.a($$1);
   }
}
