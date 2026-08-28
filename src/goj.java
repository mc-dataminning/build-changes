import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class goj implements auq {
   private Map<dub<?>, gok<?>> d = ImmutableMap.of();
   private final foc e;
   private final Supplier<gez> f;
   public dgi a;
   public fkr b;
   public fay c;
   private final gnc g;
   private final hbm h;
   private final gtc i;
   private final gsc j;

   public goj(foc $$0, Supplier<gez> $$1, gnc $$2, hbm $$3, gtc $$4, gsc $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dtz> gok<E> a(E $$0) {
      return (gok<E>)this.d.get($$0.p());
   }

   public void a(dgi $$0, fkr $$1, fay $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dtz> void a(E $$0, float $$1, ffu $$2, gly $$3) {
      gok<E> $$4 = this.a($$0);
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

   private static <T extends dtz> void a(gok<T> $$0, T $$1, float $$2, ffu $$3, gly $$4) {
      dgi $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glu.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hei.d);
   }

   public void a(@Nullable dgi $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gol.a $$1 = new gol.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gom.a($$1);
   }
}
