import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class goi implements auq {
   private Map<dua<?>, goj<?>> d = ImmutableMap.of();
   private final fob e;
   private final Supplier<gey> f;
   public dgh a;
   public fkq b;
   public fax c;
   private final gnb g;
   private final hbl h;
   private final gtb i;
   private final gsb j;

   public goi(fob $$0, Supplier<gey> $$1, gnb $$2, hbl $$3, gtb $$4, gsb $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dty> goj<E> a(E $$0) {
      return (goj<E>)this.d.get($$0.p());
   }

   public void a(dgh $$0, fkq $$1, fax $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dty> void a(E $$0, float $$1, fft $$2, glx $$3) {
      goj<E> $$4 = this.a($$0);
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

   private static <T extends dty> void a(goj<T> $$0, T $$1, float $$2, fft $$3, glx $$4) {
      dgh $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glt.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, heh.d);
   }

   public void a(@Nullable dgh $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gok.a $$1 = new gok.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gol.a($$1);
   }
}
