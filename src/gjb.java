import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gjb implements aut {
   private Map<drg<?>, gjc<?>> d = ImmutableMap.of();
   private final fjl e;
   private final fzx f;
   public dds a;
   public fhk b;
   public eyc c;
   private final Supplier<ghu> g;
   private final Supplier<gnq> h;
   private final Supplier<gmq> i;

   public gjb(fjl $$0, fzx $$1, Supplier<ghu> $$2, Supplier<gnq> $$3, Supplier<gmq> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dre> gjc<E> a(E $$0) {
      return (gjc<E>)this.d.get($$0.q());
   }

   public void a(dds $$0, fhk $$1, eyc $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dre> void a(E $$0, float $$1, fcu $$2, ggv $$3) {
      gjc<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dre> void a(gjc<T> $$0, T $$1, float $$2, fcu $$3, ggv $$4) {
      dds $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ggr.a($$5, $$1.aD_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gwb.d);
   }

   public <E extends dre> boolean a(E $$0, fcu $$1, ggv $$2, int $$3, int $$4) {
      gjc<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dre $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dds $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aus $$0) {
      gjd.a $$1 = new gjd.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gje.a($$1);
   }
}
