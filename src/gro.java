import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gro implements avc {
   private Map<dwp<?>, grp<?>> d = ImmutableMap.of();
   private final fra e;
   private final Supplier<gic> f;
   public dip a;
   public fnn b;
   public fdu c;
   private final gqh g;
   private final heq h;
   private final gwi i;
   private final gvi j;

   public gro(fra $$0, Supplier<gic> $$1, gqh $$2, heq $$3, gwi $$4, gvi $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dwn> grp<E> a(E $$0) {
      return (grp<E>)this.d.get($$0.p());
   }

   public void a(dip $$0, fnn $$1, fdu $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dwn> void a(E $$0, float $$1, fiq $$2, gpd $$3) {
      grp<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.p().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               try {
                  a($$4, $$0, $$1, $$2, $$3);
               } catch (Throwable var9) {
                  o $$6 = o.a(var9, "Rendering Block Entity");
                  p $$7 = $$6.a("Block Entity Details");
                  $$0.a($$7);
                  throw new z($$6);
               }
            }
         }
      }
   }

   private static <T extends dwn> void a(grp<T> $$0, T $$1, float $$2, fiq $$3, gpd $$4) {
      dip $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = goy.a($$5, $$1.aw_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hhp.d);
   }

   public void a(@Nullable dip $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avb $$0) {
      grq.a $$1 = new grq.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = grr.a($$1);
   }
}
