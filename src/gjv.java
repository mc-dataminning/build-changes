import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gjv implements auw {
   private Map<drx<?>, gjw<?>> d = ImmutableMap.of();
   private final fjz e;
   private final gam f;
   public dej a;
   public fhy b;
   public eyu c;
   private final Supplier<gio> g;
   private final Supplier<gom> h;
   private final Supplier<gnm> i;

   public gjv(fjz $$0, gam $$1, Supplier<gio> $$2, Supplier<gom> $$3, Supplier<gnm> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends drv> gjw<E> a(E $$0) {
      return (gjw<E>)this.d.get($$0.q());
   }

   public void a(dej $$0, fhy $$1, eyu $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends drv> void a(E $$0, float $$1, fdi $$2, ghl $$3) {
      gjw<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends drv> void a(gjw<T> $$0, T $$1, float $$2, fdi $$3, ghl $$4) {
      dej $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ghh.a($$5, $$1.aC_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gwx.d);
   }

   public <E extends drv> boolean a(E $$0, fdi $$1, ghl $$2, int $$3, int $$4) {
      gjw<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(drv $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dej $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(auv $$0) {
      gjx.a $$1 = new gjx.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gjy.a($$1);
   }
}
