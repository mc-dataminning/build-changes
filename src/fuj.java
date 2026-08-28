import javax.annotation.Nullable;

public class fuj extends fui {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wo c = wo.c("selectWorld.allowCommands");
   private static final wo d = wo.c("selectWorld.gameMode");
   private static final wo s = wo.c("lanServer.otherPlayers");
   private static final wo u = wo.c("lanServer.port");
   private static final wo v = wo.a("lanServer.port.unavailable", 1024, 65535);
   private static final wo w = wo.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fui y;
   private dgd z = dgd.a;
   private boolean A;
   private int B = ayp.a();
   @Nullable
   private foz C;

   public fuj(fui $$0) {
      super(wo.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      hix $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fox.a(dgd::e).a(dgd.a, dgd.d, dgd.b, dgd.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fox.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fop $$1 = fop.a(wo.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         wo $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = anx.a(this.B);
         } else {
            $$2 = wo.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new foz(this.p, this.n / 2 - 75, 160, 150, 20, wo.c("lanServer.port"));
      this.C.b($$1x -> {
         wo $$2 = this.a($$1x);
         this.C.c(wo.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.m(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.m(16733525);
            this.C.a(fqb.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(wo.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fop.a(wn.e, $$0x -> this.aO_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aO_() {
      this.m.a(this.y);
   }

   @Nullable
   private wo a(String $$0) {
      if ($$0.isBlank()) {
         this.B = ayp.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !ayp.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = ayp.a();
            return w;
         }
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
