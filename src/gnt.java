import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gnt implements avw {
   private Map<duy<?>, gnu<?>> d = ImmutableMap.of();
   private final fno e;
   private final gei f;
   public dhh a;
   public fln b;
   public fbv c;
   private final Supplier<gmm> g;
   private final Supplier<gsm> h;
   private final Supplier<grm> i;

   public gnt(fno $$0, gei $$1, Supplier<gmm> $$2, Supplier<gsm> $$3, Supplier<grm> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends duw> gnu<E> a(E $$0) {
      return (gnu<E>)this.d.get($$0.q());
   }

   public void a(dhh $$0, fln $$1, fbv $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends duw> void a(E $$0, float $$1, fgq $$2, glj $$3) {
      gnu<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends duw> void a(gnu<T> $$0, T $$1, float $$2, fgq $$3, glj $$4) {
      dhh $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = glf.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hba.d);
   }

   public <E extends duw> boolean a(E $$0, fgq $$1, glj $$2, int $$3, int $$4) {
      gnu<E> $$5 = this.a($$0);
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
      gnv.a $$1 = new gnv.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gnw.a($$1);
   }
}
