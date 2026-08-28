import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gum implements avg {
   private Map<dye<?>, gun<?>> d = ImmutableMap.of();
   private final ftv e;
   private final Supplier<gla> f;
   public djx a;
   public fql b;
   public ffo c;
   private final gtd g;
   private final hhq h;
   private final gzg i;
   private final gyg j;

   public gum(ftv $$0, Supplier<gla> $$1, gtd $$2, hhq $$3, gzg $$4, gyg $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dyc> gun<E> a(E $$0) {
      return (gun<E>)this.d.get($$0.p());
   }

   public void a(djx $$0, fql $$1, ffo $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dyc> void a(E $$0, float $$1, flo $$2, gsa $$3) {
      gun<E> $$4 = this.a($$0);
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

   private static <T extends dyc> void a(gun<T> $$0, T $$1, float $$2, flo $$3, gsa $$4, ffq $$5) {
      djx $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = grv.a($$6, $$1.aB_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hkq.d, $$5);
   }

   public void a(@Nullable djx $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avf $$0) {
      guo.a $$1 = new guo.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gup.a($$1);
   }
}
