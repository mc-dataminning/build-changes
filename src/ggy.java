import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggy implements auf {
   private Map<dqj<?>, ggz<?>> d = ImmutableMap.of();
   private final fhx e;
   private final fyg f;
   public dcw a;
   public ffy b;
   public exa c;
   private final Supplier<gft> g;
   private final Supplier<glh> h;
   private final Supplier<gkh> i;

   public ggy(fhx $$0, fyg $$1, Supplier<gft> $$2, Supplier<glh> $$3, Supplier<gkh> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dqh> ggz<E> a(E $$0) {
      return (ggz<E>)this.d.get($$0.r());
   }

   public void a(dcw $$0, ffy $$1, exa $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dqh> void a(E $$0, float $$1, fbi $$2, gez $$3) {
      ggz<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dqh> void a(ggz<T> $$0, T $$1, float $$2, fbi $$3, gez $$4) {
      dcw $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gex.a($$5, $$1.aD_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gqc.d);
   }

   public <E extends dqh> boolean a(E $$0, fbi $$1, gez $$2, int $$3, int $$4) {
      ggz<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dqh $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dcw $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aue $$0) {
      gha.a $$1 = new gha.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ghb.a($$1);
   }
}
