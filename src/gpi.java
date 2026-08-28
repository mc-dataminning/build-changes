import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gpi implements auq {
   private Map<duu<?>, gpj<?>> d = ImmutableMap.of();
   private final fpa e;
   private final Supplier<gfy> f;
   public dgz a;
   public flo b;
   public fbv c;
   private final gob g;
   private final hcl h;
   private final gub i;
   private final gtb j;

   public gpi(fpa $$0, Supplier<gfy> $$1, gob $$2, hcl $$3, gub $$4, gtb $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dus> gpj<E> a(E $$0) {
      return (gpj<E>)this.d.get($$0.p());
   }

   public void a(dgz $$0, flo $$1, fbv $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dus> void a(E $$0, float $$1, fgr $$2, gmx $$3) {
      gpj<E> $$4 = this.a($$0);
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

   private static <T extends dus> void a(gpj<T> $$0, T $$1, float $$2, fgr $$3, gmx $$4) {
      dgz $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gmt.a($$5, $$1.aA_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hfh.d);
   }

   public void a(@Nullable dgz $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aup $$0) {
      gpk.a $$1 = new gpk.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gpl.a($$1);
   }
}
