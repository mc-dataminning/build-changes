import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class gab extends gad {
   private static final xa a = xa.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final gab.a s;
   @Nullable
   private hla u;

   public gab(BooleanSupplier $$0, gab.a $$1) {
      super(fqu.a);
      this.d = $$0;
      this.s = $$1;
      this.c = ag.c();
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gsl::G, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gsl.u(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private hla m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dne.eu.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || ag.c() > this.c + 30000L) {
         this.aP_();
      }
   }

   @Override
   public void aP_() {
      this.m.aY().c(xa.c("narrator.ready_to_play"));
      super.aP_();
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
