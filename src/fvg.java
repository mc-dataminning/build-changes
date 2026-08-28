import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fvg extends fqh {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("selectWorld.enterName").a(n.h);
   private static final xe c = xe.c("selectWorld.edit.resetIcon");
   private static final xe d = xe.c("selectWorld.edit.openFolder");
   private static final xe s = xe.c("selectWorld.edit.backup");
   private static final xe u = xe.c("selectWorld.edit.backupFolder");
   private static final xe v = xe.c("selectWorld.edit.optimize");
   private static final xe w = xe.c("optimizeWorld.confirm.title");
   private static final xe x = xe.c("optimizeWorld.confirm.description");
   private static final xe y = xe.c("optimizeWorld.confirm.proceed");
   private static final xe z = xe.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fog D = fog.d().a(5);
   private final BooleanConsumer E;
   private final esz.c F;
   private final fkx G;

   public static fvg a(fip $$0, esz.c $$1, BooleanConsumer $$2) throws IOException {
      eta $$3 = $$1.a($$1.h());
      return new fvg($$0, $$1, $$3.b(), $$2);
   }

   private fvg(fip $$0, esz.c $$1, String $$2, BooleanConsumer $$3) {
      super(xe.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fjz $$4 = $$0.h;
      this.D.a(new foh(200, 20));
      this.D.a(new flv(b, $$4));
      this.G = this.D.a(new fkx($$4, 200, 20, b));
      this.G.a($$2);
      fog $$5 = fog.e().a(4);
      fko $$6 = $$5.a(fko.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fko.a(xd.e, $$0x -> this.d()).a(98).a());
      this.G.b($$1x -> $$6.j = !bac.h($$1x));
      this.D.a(fko.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fko.a(d, $$1x -> ad.m().a($$1.a(esx.l))).a(200).a());
      this.D.a(fko.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fko.a(u, $$1x -> {
         esz $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ad.m().a($$3x);
      }).a(200).a());
      this.D.a(fko.a(v, $$2x -> $$0.a(new fpb(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fvi.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new foh(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aH_() {
      this.b(this.G);
   }

   @Override
   protected void aS_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      foa.a(this.D, this.H());
   }

   @Override
   public void d() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (ur | ux | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fmx.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(esz.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xe $$4 = xe.c("selectWorld.edit.backupFailed");
         xe $$5 = xe.b($$2.getMessage());
         fip.Q().aA().a(new fmx(fmx.a.b, $$4, $$5));
         return false;
      } else {
         xe $$6 = xe.a("selectWorld.edit.backupCreated", $$0.f());
         xe $$7 = xe.a("selectWorld.edit.backupSize", azf.c((double)$$1 / 1048576.0));
         fip.Q().aA().a(new fmx(fmx.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
