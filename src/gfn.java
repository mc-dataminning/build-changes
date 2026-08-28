import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gfn implements auq {
   private Map<dpj<?>, gfo<?>> d = ImmutableMap.of();
   private final fgp e;
   private final fww f;
   public dby a;
   public feq b;
   public evp c;
   private final Supplier<gei> g;
   private final Supplier<gjv> h;
   private final Supplier<giv> i;

   public gfn(fgp $$0, fww $$1, Supplier<gei> $$2, Supplier<gjv> $$3, Supplier<giv> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dph> gfo<E> a(E $$0) {
      return (gfo<E>)this.d.get($$0.r());
   }

   public void a(dby $$0, feq $$1, evp $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dph> void a(E $$0, float $$1, ezy $$2, gdo $$3) {
      gfo<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dph> void a(gfo<T> $$0, T $$1, float $$2, ezy $$3, gdo $$4) {
      dby $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gdm.a($$5, $$1.ay_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, goq.d);
   }

   public <E extends dph> boolean a(E $$0, ezy $$1, gdo $$2, int $$3, int $$4) {
      gfo<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dph $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dby $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gfp.a $$1 = new gfp.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gfq.a($$1);
   }
}
