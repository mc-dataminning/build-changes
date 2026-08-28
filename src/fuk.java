import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fuk extends fum {
   private static final wp a = wp.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fuk.a s;
   @Nullable
   private het u;

   public fuk(BooleanSupplier $$0, fuk.a $$1) {
      super(flb.a);
      this.d = $$0;
      this.s = $$1;
      this.c = af.c();
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected boolean aQ_() {
      return false;
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(fof $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gmj::G, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gmj.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private het m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(djp.eq.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || af.c() > this.c + 30000L) {
         this.aO_();
      }
   }

   @Override
   public void aO_() {
      this.m.aY().c(wp.c("narrator.ready_to_play"));
      super.aO_();
   }

   @Override
   public boolean k() {
      return false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
