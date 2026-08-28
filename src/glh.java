import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class glh implements avf {
   private Map<dst<?>, gli<?>> d = ImmutableMap.of();
   private final flh e;
   private final gby f;
   public dff a;
   public fjg b;
   public ezp c;
   private final Supplier<gka> g;
   private final Supplier<gpy> h;
   private final Supplier<goy> i;

   public glh(flh $$0, gby $$1, Supplier<gka> $$2, Supplier<gpy> $$3, Supplier<goy> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dsr> gli<E> a(E $$0) {
      return (gli<E>)this.d.get($$0.q());
   }

   public void a(dff $$0, fjg $$1, ezp $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dsr> void a(E $$0, float $$1, fek $$2, gix $$3) {
      gli<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dsr> void a(gli<T> $$0, T $$1, float $$2, fek $$3, gix $$4) {
      dff $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = git.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gyk.d);
   }

   public <E extends dsr> boolean a(E $$0, fek $$1, gix $$2, int $$3, int $$4) {
      gli<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dsr $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dff $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(ave $$0) {
      glj.a $$1 = new glj.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = glk.a($$1);
   }
}
