import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gnu implements avw {
   private Map<duy<?>, gnv<?>> d = ImmutableMap.of();
   private final fnp e;
   private final gej f;
   public dhh a;
   public flo b;
   public fbv c;
   private final Supplier<gmn> g;
   private final Supplier<gsn> h;
   private final Supplier<grn> i;

   public gnu(fnp $$0, gej $$1, Supplier<gmn> $$2, Supplier<gsn> $$3, Supplier<grn> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends duw> gnv<E> a(E $$0) {
      return (gnv<E>)this.d.get($$0.q());
   }

   public void a(dhh $$0, flo $$1, fbv $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends duw> void a(E $$0, float $$1, fgr $$2, glk $$3) {
      gnv<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends duw> void a(gnv<T> $$0, T $$1, float $$2, fgr $$3, glk $$4) {
      dhh $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glg.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hbb.d);
   }

   public <E extends duw> boolean a(E $$0, fgr $$1, glk $$2, int $$3, int $$4) {
      gnv<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(duw $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dhh $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avv $$0) {
      gnw.a $$1 = new gnw.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gnx.a($$1);
   }
}
