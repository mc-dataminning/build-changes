import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gsl implements ave {
   private Map<dxh<?>, gsm<?>> d = ImmutableMap.of();
   private final frt e;
   private final Supplier<giy> f;
   public dja a;
   public fog b;
   public feo c;
   private final gre g;
   private final hfo h;
   private final gxf i;
   private final gwf j;

   public gsl(frt $$0, Supplier<giy> $$1, gre $$2, hfo $$3, gxf $$4, gwf $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dxf> gsm<E> a(E $$0) {
      return (gsm<E>)this.d.get($$0.p());
   }

   public void a(dja $$0, fog $$1, feo $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dxf> void a(E $$0, float $$1, fjj $$2, gqa $$3) {
      gsm<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.p().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               try {
                  a($$4, $$0, $$1, $$2, $$3, this.b.b());
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

   private static <T extends dxf> void a(gsm<T> $$0, T $$1, float $$2, fjj $$3, gqa $$4, feq $$5) {
      dja $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = gpv.a($$6, $$1.ax_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hin.d, $$5);
   }

   public void a(@Nullable dja $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avd $$0) {
      gsn.a $$1 = new gsn.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gso.a($$1);
   }
}
