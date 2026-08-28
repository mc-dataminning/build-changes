import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fxg extends fxi {
   private static final ww a = ww.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fxg.a s;
   @Nullable
   private hhz u;

   public fxg(BooleanSupplier $$0, fxg.a $$1) {
      super(fnw.a);
      this.d = $$0;
      this.s = $$1;
      this.c = af.c();
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gpn::G, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gpn.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private hhz m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dlw.eq.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || af.c() > this.c + 30000L) {
         this.aK_();
      }
   }

   @Override
   public void aK_() {
      this.m.aY().c(ww.c("narrator.ready_to_play"));
      super.aK_();
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
