import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fzo extends fzq {
   private static final xg a = xg.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fzo.a s;
   @Nullable
   private hkq u;

   public fzo(BooleanSupplier $$0, fzo.a $$1) {
      super(fqh.a);
      this.d = $$0;
      this.s = $$1;
      this.c = ag.c();
   }

   @Override
   public boolean aI_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gry::G, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gry.u(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private hkq m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dnq.eu.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || ag.c() > this.c + 30000L) {
         this.aQ_();
      }
   }

   @Override
   public void aQ_() {
      this.m.aY().c(xg.c("narrator.ready_to_play"));
      super.aQ_();
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
