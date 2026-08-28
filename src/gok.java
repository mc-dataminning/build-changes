import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gok implements auq {
   private Map<duc<?>, gol<?>> d = ImmutableMap.of();
   private final fod e;
   private final Supplier<gfa> f;
   public dgj a;
   public fks b;
   public faz c;
   private final gnd g;
   private final hbn h;
   private final gtd i;
   private final gsd j;

   public gok(fod $$0, Supplier<gfa> $$1, gnd $$2, hbn $$3, gtd $$4, gsd $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dua> gol<E> a(E $$0) {
      return (gol<E>)this.d.get($$0.p());
   }

   public void a(dgj $$0, fks $$1, faz $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dua> void a(E $$0, float $$1, ffv $$2, glz $$3) {
      gol<E> $$4 = this.a($$0);
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

   private static <T extends dua> void a(gol<T> $$0, T $$1, float $$2, ffv $$3, glz $$4) {
      dgj $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glv.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hej.d);
   }

   public void a(@Nullable dgj $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gom.a $$1 = new gom.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gon.a($$1);
   }
}
