import javax.annotation.Nullable;

public class fzr extends fzq {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xg c = xg.c("selectWorld.allowCommands");
   private static final xg d = xg.c("selectWorld.gameMode");
   private static final xg s = xg.c("lanServer.otherPlayers");
   private static final xg u = xg.c("lanServer.port");
   private static final xg v = xg.a("lanServer.port.unavailable", 1024, 65535);
   private static final xg w = xg.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fzq y;
   private dkg z = dkg.a;
   private boolean A;
   private int B = azq.a();
   @Nullable
   private fuh C;

   public fzr(fzq $$0) {
      super(xg.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aT_() {
      hpb $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fuf.a(dkg::e).a(dkg.a, dkg.d, dkg.b, dkg.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fuf.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fty $$1 = fty.a(xg.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xg $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aov.a(this.B);
         } else {
            $$2 = xg.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fuh(this.p, this.n / 2 - 75, 160, 150, 20, xg.c("lanServer.port"));
      this.C.b($$1x -> {
         xg $$2 = this.a($$1x);
         this.C.c(xg.b(this.B + "").a(o.i));
         if ($$2 == null) {
            this.C.m(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.m(16733525);
            this.C.a(fvj.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xg.b(this.B + "").a(o.i));
      this.c(this.C);
      this.c($$1);
      this.c(fty.a(xf.e, $$0x -> this.aQ_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aQ_() {
      this.m.a(this.y);
   }

   @Nullable
   private xg a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azq.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azq.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azq.a();
            return w;
         }
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
