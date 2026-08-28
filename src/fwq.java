import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fwq extends frp {
   private static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("selectWorld.enterName").a(n.h);
   private static final xl c = xl.c("selectWorld.edit.resetIcon");
   private static final xl d = xl.c("selectWorld.edit.openFolder");
   private static final xl s = xl.c("selectWorld.edit.backup");
   private static final xl u = xl.c("selectWorld.edit.backupFolder");
   private static final xl v = xl.c("selectWorld.edit.optimize");
   private static final xl w = xl.c("optimizeWorld.confirm.title");
   private static final xl x = xl.c("optimizeWorld.confirm.description");
   private static final xl y = xl.c("optimizeWorld.confirm.proceed");
   private static final xl z = xl.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fpp D = fpp.d().a(5);
   private final BooleanConsumer E;
   private final etu.c F;
   private final fmf G;

   public static fwq a(fjx $$0, etu.c $$1, BooleanConsumer $$2) throws IOException {
      etv $$3 = $$1.a($$1.h());
      return new fwq($$0, $$1, $$3.b(), $$2);
   }

   private fwq(fjx $$0, etu.c $$1, String $$2, BooleanConsumer $$3) {
      super(xl.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      flh $$4 = $$0.h;
      this.D.a(new fpq(200, 20));
      this.D.a(new fnd(b, $$4));
      this.G = this.D.a(new fmf($$4, 200, 20, b));
      this.G.a($$2);
      fpp $$5 = fpp.e().a(4);
      flw $$6 = $$5.a(flw.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(flw.a(xk.e, $$0x -> this.aP_()).a(98).a());
      this.G.b($$1x -> $$6.j = !bak.h($$1x));
      this.D.a(flw.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(flw.a(d, $$1x -> ae.m().a($$1.a(ets.l))).a(200).a());
      this.D.a(flw.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(flw.a(u, $$1x -> {
         etu $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ae.m().a($$3x);
      }).a(200).a());
      this.D.a(flw.a(v, $$2x -> $$0.a(new fqj(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fwt.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fpq(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aG_() {
      this.b(this.G);
   }

   @Override
   protected void aS_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fpj.a(this.D, this.H());
   }

   @Override
   public void aP_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uy | ve | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fof.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(etu.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xl $$4 = xl.c("selectWorld.edit.backupFailed");
         xl $$5 = xl.b($$2.getMessage());
         fjx.Q().aA().a(new fof(fof.a.b, $$4, $$5));
         return false;
      } else {
         xl $$6 = xl.a("selectWorld.edit.backupCreated", $$0.f());
         xl $$7 = xl.a("selectWorld.edit.backupSize", azn.c((double)$$1 / 1048576.0));
         fjx.Q().aA().a(new fof(fof.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
