import javax.annotation.Nullable;

public class fwg extends fwf {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wv c = wv.c("selectWorld.allowCommands");
   private static final wv d = wv.c("selectWorld.gameMode");
   private static final wv s = wv.c("lanServer.otherPlayers");
   private static final wv u = wv.c("lanServer.port");
   private static final wv v = wv.a("lanServer.port.unavailable", 1024, 65535);
   private static final wv w = wv.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fwf y;
   private dhm z = dhm.a;
   private boolean A;
   private int B = azb.a();
   @Nullable
   private fqw C;

   public fwg(fwf $$0) {
      super(wv.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aN_() {
      hld $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fqu.a(dhm::e).a(dhm.a, dhm.d, dhm.b, dhm.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fqu.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fqn $$1 = fqn.a(wv.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         wv $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aoh.a(this.B);
         } else {
            $$2 = wv.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fqw(this.p, this.n / 2 - 75, 160, 150, 20, wv.c("lanServer.port"));
      this.C.b($$1x -> {
         wv $$2 = this.a($$1x);
         this.C.c(wv.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.m(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.m(16733525);
            this.C.a(fry.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(wv.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fqn.a(wu.e, $$0x -> this.aK_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aK_() {
      this.m.a(this.y);
   }

   @Nullable
   private wv a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azb.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azb.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azb.a();
            return w;
         }
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
