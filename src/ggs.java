import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggs implements aue {
   private Map<dqh<?>, ggt<?>> d = ImmutableMap.of();
   private final fhr e;
   private final fya f;
   public dcu a;
   public ffs b;
   public ewu c;
   private final Supplier<gfn> g;
   private final Supplier<glb> h;
   private final Supplier<gkb> i;

   public ggs(fhr $$0, fya $$1, Supplier<gfn> $$2, Supplier<glb> $$3, Supplier<gkb> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dqf> ggt<E> a(E $$0) {
      return (ggt<E>)this.d.get($$0.r());
   }

   public void a(dcu $$0, ffs $$1, ewu $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dqf> void a(E $$0, float $$1, fbc $$2, get $$3) {
      ggt<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dqf> void a(ggt<T> $$0, T $$1, float $$2, fbc $$3, get $$4) {
      dcu $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ger.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gpw.d);
   }

   public <E extends dqf> boolean a(E $$0, fbc $$1, get $$2, int $$3, int $$4) {
      ggt<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dqf $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dcu $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aud $$0) {
      ggu.a $$1 = new ggu.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ggv.a($$1);
   }
}
