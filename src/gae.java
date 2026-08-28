import javax.annotation.Nullable;

public class gae extends gad {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xa c = xa.c("selectWorld.allowCommands");
   private static final xa d = xa.c("selectWorld.gameMode");
   private static final xa s = xa.c("lanServer.otherPlayers");
   private static final xa u = xa.c("lanServer.port");
   private static final xa v = xa.a("lanServer.port.unavailable", 1024, 65535);
   private static final xa w = xa.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final gad y;
   private dju z = dju.a;
   private boolean A;
   private int B = azf.a();
   @Nullable
   private fuu C;

   public gae(gad $$0) {
      super(xa.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aS_() {
      hpl $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fus.a(dju::e).a(dju.a, dju.d, dju.b, dju.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fus.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      ful $$1 = ful.a(xa.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xa $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aom.a(this.B);
         } else {
            $$2 = xa.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fuu(this.p, this.n / 2 - 75, 160, 150, 20, xa.c("lanServer.port"));
      this.C.b($$1x -> {
         xa $$2 = this.a($$1x);
         this.C.c(xa.b(this.B + "").a(o.i));
         if ($$2 == null) {
            this.C.m(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.m(16733525);
            this.C.a(fvw.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xa.b(this.B + "").a(o.i));
      this.c(this.C);
      this.c($$1);
      this.c(ful.a(wz.e, $$0x -> this.aP_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aP_() {
      this.m.a(this.y);
   }

   @Nullable
   private xa a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azf.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azf.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azf.a();
            return w;
         }
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
