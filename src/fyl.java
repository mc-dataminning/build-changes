import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fyl extends fyn {
   private static final wy a = wy.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fyl.a s;
   @Nullable
   private hjk u;

   public fyl(BooleanSupplier $$0, fyl.a $$1) {
      super(fpf.a);
      this.d = $$0;
      this.s = $$1;
      this.c = ag.c();
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aN_() {
      return false;
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gqx::G, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gqx.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private hjk m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dmo.eu.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || ag.c() > this.c + 30000L) {
         this.aL_();
      }
   }

   @Override
   public void aL_() {
      this.m.aY().c(wy.c("narrator.ready_to_play"));
      super.aL_();
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
