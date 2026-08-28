import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gsd implements ave {
   private Map<dwz<?>, gse<?>> d = ImmutableMap.of();
   private final frm e;
   private final Supplier<giq> f;
   public div a;
   public fnz b;
   public feg c;
   private final gqw g;
   private final hfg h;
   private final gwx i;
   private final gvx j;

   public gsd(frm $$0, Supplier<giq> $$1, gqw $$2, hfg $$3, gwx $$4, gvx $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dwx> gse<E> a(E $$0) {
      return (gse<E>)this.d.get($$0.p());
   }

   public void a(div $$0, fnz $$1, feg $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dwx> void a(E $$0, float $$1, fjc $$2, gps $$3) {
      gse<E> $$4 = this.a($$0);
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

   private static <T extends dwx> void a(gse<T> $$0, T $$1, float $$2, fjc $$3, gps $$4, fei $$5) {
      div $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = gpn.a($$6, $$1.aw_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hif.d, $$5);
   }

   public void a(@Nullable div $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avd $$0) {
      gsf.a $$1 = new gsf.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gsg.a($$1);
   }
}
