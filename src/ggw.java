import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ggw implements auf {
   private Map<dqj<?>, ggx<?>> d = ImmutableMap.of();
   private final fhv e;
   private final fye f;
   public dcw a;
   public ffw b;
   public ewy c;
   private final Supplier<gfr> g;
   private final Supplier<glf> h;
   private final Supplier<gkf> i;

   public ggw(fhv $$0, fye $$1, Supplier<gfr> $$2, Supplier<glf> $$3, Supplier<gkf> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dqh> ggx<E> a(E $$0) {
      return (ggx<E>)this.d.get($$0.r());
   }

   public void a(dcw $$0, ffw $$1, ewy $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dqh> void a(E $$0, float $$1, fbg $$2, gex $$3) {
      ggx<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dqh> void a(ggx<T> $$0, T $$1, float $$2, fbg $$3, gex $$4) {
      dcw $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gev.a($$5, $$1.aD_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gqa.d);
   }

   public <E extends dqh> boolean a(E $$0, fbg $$1, gex $$2, int $$3, int $$4) {
      ggx<E> $$5 = this.a($$0);
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
      ggy.a $$1 = new ggy.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ggz.a($$1);
   }
}
