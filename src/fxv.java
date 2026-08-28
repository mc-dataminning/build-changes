import javax.annotation.Nullable;

public class fxv extends fxu {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wy c = wy.c("selectWorld.allowCommands");
   private static final wy d = wy.c("selectWorld.gameMode");
   private static final wy s = wy.c("lanServer.otherPlayers");
   private static final wy u = wy.c("lanServer.port");
   private static final wy v = wy.a("lanServer.port.unavailable", 1024, 65535);
   private static final wy w = wy.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fxu y;
   private dis z = dis.a;
   private boolean A;
   private int B = azd.a();
   @Nullable
   private fsl C;

   public fxv(fxu $$0) {
      super(wy.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aN_() {
      hna $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fsj.a(dis::e).a(dis.a, dis.d, dis.b, dis.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fsj.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fsc $$1 = fsc.a(wy.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         wy $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aok.a(this.B);
         } else {
            $$2 = wy.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fsl(this.p, this.n / 2 - 75, 160, 150, 20, wy.c("lanServer.port"));
      this.C.b($$1x -> {
         wy $$2 = this.a($$1x);
         this.C.c(wy.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.m(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.m(16733525);
            this.C.a(ftn.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(wy.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fsc.a(wx.e, $$0x -> this.aK_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aK_() {
      this.m.a(this.y);
   }

   @Nullable
   private wy a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azd.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azd.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azd.a();
            return w;
         }
      }
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
