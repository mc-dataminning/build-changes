import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fxs extends fxu {
   private static final wy a = wy.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fxs.a s;
   @Nullable
   private hip u;

   public fxs(BooleanSupplier $$0, fxs.a $$1) {
      super(foi.a);
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
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gqc::G, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gqc.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private hip m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dmc.er.m());
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
      this.m.aY().c(wy.c("narrator.ready_to_play"));
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
