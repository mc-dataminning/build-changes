import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class guo implements avi {
   private Map<dyg<?>, gup<?>> d = ImmutableMap.of();
   private final ftx e;
   private final Supplier<glc> f;
   public djz a;
   public fqn b;
   public ffq c;
   private final gtf g;
   private final hhs h;
   private final gzi i;
   private final gyi j;

   public guo(ftx $$0, Supplier<glc> $$1, gtf $$2, hhs $$3, gzi $$4, gyi $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dye> gup<E> a(E $$0) {
      return (gup<E>)this.d.get($$0.p());
   }

   public void a(djz $$0, fqn $$1, ffq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dye> void a(E $$0, float $$1, flq $$2, gsc $$3) {
      gup<E> $$4 = this.a($$0);
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

   private static <T extends dye> void a(gup<T> $$0, T $$1, float $$2, flq $$3, gsc $$4, ffs $$5) {
      djz $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = grx.a($$6, $$1.aB_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hks.d, $$5);
   }

   public void a(@Nullable djz $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avh $$0) {
      guq.a $$1 = new guq.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gur.a($$1);
   }
}
