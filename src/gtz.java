import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gtz implements avp {
   private Map<dyq<?>, gua<?>> d = ImmutableMap.of();
   private final fti e;
   private final Supplier<gkn> f;
   public dkj a;
   public fpy b;
   public fga c;
   private final gsq g;
   private final hhg h;
   private final gyt i;
   private final gxt j;

   public gtz(fti $$0, Supplier<gkn> $$1, gsq $$2, hhg $$3, gyt $$4, gxt $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dyo> gua<E> a(E $$0) {
      return (gua<E>)this.d.get($$0.p());
   }

   public void a(dkj $$0, fpy $$1, fga $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dyo> void a(E $$0, float $$1, fld $$2, grn $$3) {
      gua<E> $$4 = this.a($$0);
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

   private static <T extends dyo> void a(gua<T> $$0, T $$1, float $$2, fld $$3, grn $$4, fgc $$5) {
      dkj $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = gri.a($$6, $$1.aC_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hkg.d, $$5);
   }

   public void a(@Nullable dkj $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avo $$0) {
      gub.a $$1 = new gub.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = guc.a($$1);
   }
}
