import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gqj implements avb {
   private Map<dvn<?>, gqk<?>> d = ImmutableMap.of();
   private final fpx e;
   private final Supplier<ggz> f;
   public dhp a;
   public fml b;
   public fcs c;
   private final gpc g;
   private final hdl h;
   private final gvd i;
   private final gud j;

   public gqj(fpx $$0, Supplier<ggz> $$1, gpc $$2, hdl $$3, gvd $$4, gud $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dvl> gqk<E> a(E $$0) {
      return (gqk<E>)this.d.get($$0.p());
   }

   public void a(dhp $$0, fml $$1, fcs $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dvl> void a(E $$0, float $$1, fho $$2, gny $$3) {
      gqk<E> $$4 = this.a($$0);
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

   private static <T extends dvl> void a(gqk<T> $$0, T $$1, float $$2, fho $$3, gny $$4) {
      dhp $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gnu.a($$5, $$1.aw_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hgi.d);
   }

   public void a(@Nullable dhp $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(ava $$0) {
      gql.a $$1 = new gql.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gqm.a($$1);
   }
}
