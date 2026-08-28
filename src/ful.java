import javax.annotation.Nullable;

public class ful extends fuk {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wp c = wp.c("selectWorld.allowCommands");
   private static final wp d = wp.c("selectWorld.gameMode");
   private static final wp s = wp.c("lanServer.otherPlayers");
   private static final wp u = wp.c("lanServer.port");
   private static final wp v = wp.a("lanServer.port.unavailable", 1024, 65535);
   private static final wp w = wp.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fuk y;
   private dge z = dge.a;
   private boolean A;
   private int B = ayq.a();
   @Nullable
   private fpb C;

   public ful(fuk $$0) {
      super(wp.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      hjc $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(foz.a(dge::e).a(dge.a, dge.d, dge.b, dge.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(foz.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fos $$1 = fos.a(wp.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         wp $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = any.a(this.B);
         } else {
            $$2 = wp.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fpb(this.p, this.n / 2 - 75, 160, 150, 20, wp.c("lanServer.port"));
      this.C.b($$1x -> {
         wp $$2 = this.a($$1x);
         this.C.c(wp.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.m(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.m(16733525);
            this.C.a(fqd.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(wp.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fos.a(wo.e, $$0x -> this.aO_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aO_() {
      this.m.a(this.y);
   }

   @Nullable
   private wp a(String $$0) {
      if ($$0.isBlank()) {
         this.B = ayq.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !ayq.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = ayq.a();
            return w;
         }
      }
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
