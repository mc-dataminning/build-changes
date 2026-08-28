import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gkg implements avb {
   private Map<dsi<?>, gkh<?>> d = ImmutableMap.of();
   private final fkk e;
   private final gax f;
   public dev a;
   public fij b;
   public ezf c;
   private final Supplier<giz> g;
   private final Supplier<gox> h;
   private final Supplier<gnx> i;

   public gkg(fkk $$0, gax $$1, Supplier<giz> $$2, Supplier<gox> $$3, Supplier<gnx> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dsg> gkh<E> a(E $$0) {
      return (gkh<E>)this.d.get($$0.q());
   }

   public void a(dev $$0, fij $$1, ezf $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dsg> void a(E $$0, float $$1, fdt $$2, ghw $$3) {
      gkh<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dsg> void a(gkh<T> $$0, T $$1, float $$2, fdt $$3, ghw $$4) {
      dev $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ghs.a($$5, $$1.aC_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gxj.d);
   }

   public <E extends dsg> boolean a(E $$0, fdt $$1, ghw $$2, int $$3, int $$4) {
      gkh<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dsg $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dev $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(ava $$0) {
      gki.a $$1 = new gki.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gkj.a($$1);
   }
}
