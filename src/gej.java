import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gej implements atx {
   private Map<doi<?>, gek<?>> d = ImmutableMap.of();
   private final ffk e;
   private final fvs f;
   public dax a;
   public fdk b;
   public eui c;
   private final Supplier<gde> g;
   private final Supplier<gir> h;
   private final Supplier<ghr> i;

   public gej(ffk $$0, fvs $$1, Supplier<gde> $$2, Supplier<gir> $$3, Supplier<ghr> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dog> gek<E> a(E $$0) {
      return (gek<E>)this.d.get($$0.r());
   }

   public void a(dax $$0, fdk $$1, eui $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dog> void a(E $$0, float $$1, eys $$2, gck $$3) {
      gek<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dog> void a(gek<T> $$0, T $$1, float $$2, eys $$3, gck $$4) {
      dax $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gci.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gnm.d);
   }

   public <E extends dog> boolean a(E $$0, eys $$1, gck $$2, int $$3, int $$4) {
      gek<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dog $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable dax $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(atw $$0) {
      gel.a $$1 = new gel.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gem.a($$1);
   }
}
