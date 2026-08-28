import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fyy extends ftw {
   private static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("selectWorld.enterName").a(n.h);
   private static final xv c = xv.c("selectWorld.edit.resetIcon");
   private static final xv d = xv.c("selectWorld.edit.openFolder");
   private static final xv s = xv.c("selectWorld.edit.backup");
   private static final xv u = xv.c("selectWorld.edit.backupFolder");
   private static final xv v = xv.c("selectWorld.edit.optimize");
   private static final xv w = xv.c("optimizeWorld.confirm.title");
   private static final xv x = xv.c("optimizeWorld.confirm.description");
   private static final xv y = xv.c("optimizeWorld.confirm.proceed");
   private static final xv z = xv.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final frw D = frw.d().a(5);
   private final BooleanConsumer E;
   private final ewc.c F;
   private final fom G;

   public static fyy a(fme $$0, ewc.c $$1, BooleanConsumer $$2) throws IOException {
      ewd $$3 = $$1.a($$1.h());
      return new fyy($$0, $$1, $$3.b(), $$2);
   }

   private fyy(fme $$0, ewc.c $$1, String $$2, BooleanConsumer $$3) {
      super(xv.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fno $$4 = $$0.h;
      this.D.a(new frx(200, 20));
      this.D.a(new fpl(b, $$4));
      this.G = this.D.a(new fom($$4, 200, 20, b));
      this.G.a($$2);
      frw $$5 = frw.e().a(4);
      fod $$6 = $$5.a(fod.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fod.a(xu.e, $$0x -> this.aP_()).a(98).a());
      this.G.b($$1x -> $$6.j = !bbb.h($$1x));
      this.D.a(fod.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fod.a(d, $$1x -> ae.m().a($$1.a(ewa.l))).a(200).a());
      this.D.a(fod.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fod.a(u, $$1x -> {
         ewc $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ae.m().a($$3x);
      }).a(200).a());
      this.D.a(fod.a(v, $$2x -> $$0.a(new fsq(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fzb.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new frx(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fob var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aG_() {
      this.b(this.G);
   }

   @Override
   protected void aT_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      frq.a(this.D, this.H());
   }

   @Override
   public void aP_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (vi | vo | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fqn.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(ewc.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xv $$4 = xv.c("selectWorld.edit.backupFailed");
         xv $$5 = xv.b($$2.getMessage());
         fme.Q().aA().a(new fqn(fqn.a.b, $$4, $$5));
         return false;
      } else {
         xv $$6 = xv.a("selectWorld.edit.backupCreated", $$0.f());
         xv $$7 = xv.a("selectWorld.edit.backupSize", bae.c((double)$$1 / 1048576.0));
         fme.Q().aA().a(new fqn(fqn.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
