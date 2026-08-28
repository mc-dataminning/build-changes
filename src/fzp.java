import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzp extends fzq {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xg c = xg.c("recover_world.title").a(o.r);
   private static final xg d = xg.c("recover_world.bug_tracker");
   private static final xg s = xg.c("recover_world.restore");
   private static final xg u = xg.c("recover_world.no_fallback");
   private static final xg v = xg.c("recover_world.done.title");
   private static final xg w = xg.c("recover_world.done.success");
   private static final xg x = xg.c("recover_world.done.failed");
   private static final xg y = xg.c("recover_world.issue.none").a(o.k);
   private static final xg z = xg.c("recover_world.issue.missing_file").a(o.m);
   private final BooleanConsumer A;
   private final fxq B = fxq.d().a(8);
   private final xg C;
   private final fus D;
   private final fus E;
   private final fah.c F;

   public fzp(fqq $$0, BooleanConsumer $$1, fah.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xg.a("recover_world.message", xg.b($$2.f()).a(o.h));
      this.D = new fus(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xg $$5 = xg.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fus($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fvf(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fxq $$7 = fxq.e().a(5);
      $$7.a(fty.a(d, fyn.b(this, ayt.j)).b(120, 20).a());
      $$7.a(fty.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fvj.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fty.a(xf.k, $$0x -> this.aL_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fqq $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fzb(xg.c("recover_world.restoring")));
         geu.a(this.F);
         if (this.F.n()) {
            $$0.a(new fyo(this.A, v, w, xf.j, xf.k));
         } else {
            $$0.a(new fyj(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fyj(() -> this.A.accept(false), v, x));
      }
   }

   private xg a(fah.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xg.i();
      } else {
         xu $$3 = xg.i();
         Instant $$4 = $$0.a($$1);
         xu $$5 = $$4 != null ? xg.b(gff.a.format($$4)) : xg.c("recover_world.state_entry.unknown");
         $$3.b(xg.a("recover_world.state_entry", $$5.a(o.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof us) {
            $$3.b(xg.b($$2.getCause().toString()).a(o.m));
         } else {
            $$3.b(xg.b($$2.toString()).a(o.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(fah.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ul | us | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      fxk.a(this.B, this.J());
   }

   @Override
   public xg i() {
      return xf.a(super.i(), this.C);
   }

   @Override
   public void aL_() {
      this.A.accept(false);
   }
}
