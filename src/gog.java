import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gog implements aup {
   private Map<dtz<?>, goh<?>> d = ImmutableMap.of();
   private final fnz e;
   private final Supplier<gew> f;
   public dgg a;
   public fkp b;
   public faw c;
   private final gmz g;
   private final hbi h;
   private final gsz i;
   private final grz j;

   public gog(fnz $$0, Supplier<gew> $$1, gmz $$2, hbi $$3, gsz $$4, grz $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dtx> goh<E> a(E $$0) {
      return (goh<E>)this.d.get($$0.p());
   }

   public void a(dgg $$0, fkp $$1, faw $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dtx> void a(E $$0, float $$1, ffs $$2, glv $$3) {
      goh<E> $$4 = this.a($$0);
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

   private static <T extends dtx> void a(goh<T> $$0, T $$1, float $$2, ffs $$3, glv $$4) {
      dgg $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glr.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hec.d);
   }

   public void a(@Nullable dgg $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(auo $$0) {
      goi.a $$1 = new goi.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = goj.a($$1);
   }
}
