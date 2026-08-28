import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gtc implements ave {
   private Map<dxt<?>, gtd<?>> d = ImmutableMap.of();
   private final fsk e;
   private final Supplier<gjp> f;
   public djm a;
   public fpb b;
   public ffa c;
   private final gru g;
   private final hgg h;
   private final gxw i;
   private final gww j;

   public gtc(fsk $$0, Supplier<gjp> $$1, gru $$2, hgg $$3, gxw $$4, gww $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dxr> gtd<E> a(E $$0) {
      return (gtd<E>)this.d.get($$0.p());
   }

   public void a(djm $$0, fpb $$1, ffa $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dxr> void a(E $$0, float $$1, fkd $$2, gqr $$3) {
      gtd<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.p().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               try {
                  a($$4, $$0, $$1, $$2, $$3, this.b.b());
               } catch (Throwable var9) {
                  p $$6 = p.a(var9, "Rendering Block Entity");
                  q $$7 = $$6.a("Block Entity Details");
                  $$0.a($$7);
                  throw new aa($$6);
               }
            }
         }
      }
   }

   private static <T extends dxr> void a(gtd<T> $$0, T $$1, float $$2, fkd $$3, gqr $$4, ffc $$5) {
      djm $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = gqm.a($$6, $$1.ax_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hjg.d, $$5);
   }

   public void a(@Nullable djm $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avd $$0) {
      gte.a $$1 = new gte.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gtf.a($$1);
   }
}
