import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gkr implements avc {
   private Map<dso<?>, gks<?>> d = ImmutableMap.of();
   private final fks e;
   private final gbi f;
   public dfb a;
   public fir b;
   public ezl c;
   private final Supplier<gjk> g;
   private final Supplier<gpi> h;
   private final Supplier<goi> i;

   public gkr(fks $$0, gbi $$1, Supplier<gjk> $$2, Supplier<gpi> $$3, Supplier<goi> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dsm> gks<E> a(E $$0) {
      return (gks<E>)this.d.get($$0.q());
   }

   public void a(dfb $$0, fir $$1, ezl $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dsm> void a(E $$0, float $$1, feb $$2, gih $$3) {
      gks<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dsm> void a(gks<T> $$0, T $$1, float $$2, feb $$3, gih $$4) {
      dfb $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gid.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gxu.d);
   }

   public <E extends dsm> boolean a(E $$0, feb $$1, gih $$2, int $$3, int $$4) {
      gks<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dsm $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dfb $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avb $$0) {
      gkt.a $$1 = new gkt.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gku.a($$1);
   }
}
