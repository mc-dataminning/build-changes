import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gjq implements auu {
   private Map<dru<?>, gjr<?>> d = ImmutableMap.of();
   private final fjv e;
   private final gah f;
   public deg a;
   public fhu b;
   public eyq c;
   private final Supplier<gij> g;
   private final Supplier<goh> h;
   private final Supplier<gnh> i;

   public gjq(fjv $$0, gah $$1, Supplier<gij> $$2, Supplier<goh> $$3, Supplier<gnh> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends drs> gjr<E> a(E $$0) {
      return (gjr<E>)this.d.get($$0.q());
   }

   public void a(deg $$0, fhu $$1, eyq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends drs> void a(E $$0, float $$1, fde $$2, ghg $$3) {
      gjr<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends drs> void a(gjr<T> $$0, T $$1, float $$2, fde $$3, ghg $$4) {
      deg $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ghc.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gws.d);
   }

   public <E extends drs> boolean a(E $$0, fde $$1, ghg $$2, int $$3, int $$4) {
      gjr<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(drs $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable deg $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aut $$0) {
      gjs.a $$1 = new gjs.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gjt.a($$1);
   }
}
