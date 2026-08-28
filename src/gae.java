import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gae extends gaf {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xc c = xc.c("recover_world.title").a(o.r);
   private static final xc d = xc.c("recover_world.bug_tracker");
   private static final xc s = xc.c("recover_world.restore");
   private static final xc u = xc.c("recover_world.no_fallback");
   private static final xc v = xc.c("recover_world.done.title");
   private static final xc w = xc.c("recover_world.done.success");
   private static final xc x = xc.c("recover_world.done.failed");
   private static final xc y = xc.c("recover_world.issue.none").a(o.k);
   private static final xc z = xc.c("recover_world.issue.missing_file").a(o.m);
   private final BooleanConsumer A;
   private final fyf B = fyf.d().a(8);
   private final xc C;
   private final fvh D;
   private final fvh E;
   private final ezx.c F;

   public gae(frf $$0, BooleanConsumer $$1, ezx.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xc.a("recover_world.message", xc.b($$2.f()).a(o.h));
      this.D = new fvh(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xc $$5 = xc.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fvh($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fvu(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fyf $$7 = fyf.e().a(5);
      $$7.a(fun.a(d, fzc.b(this, ayl.j)).b(120, 20).a());
      $$7.a(fun.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fvy.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fun.a(xb.k, $$0x -> this.aP_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(frf $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fzq(xc.c("recover_world.restoring")));
         gfj.a(this.F);
         if (this.F.n()) {
            $$0.a(new fzd(this.A, v, w, xb.j, xb.k));
         } else {
            $$0.a(new fyy(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fyy(() -> this.A.accept(false), v, x));
      }
   }

   private xc a(ezx.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xc.i();
      } else {
         xq $$3 = xc.i();
         Instant $$4 = $$0.a($$1);
         xq $$5 = $$4 != null ? xc.b(gfu.a.format($$4)) : xc.c("recover_world.state_entry.unknown");
         $$3.b(xc.a("recover_world.state_entry", $$5.a(o.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof us) {
            $$3.b(xc.b($$2.getCause().toString()).a(o.m));
         } else {
            $$3.b(xc.b($$2.toString()).a(o.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ezx.c $$0, boolean $$1) {
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
   protected void aS_() {
      super.aS_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      fxz.a(this.B, this.J());
   }

   @Override
   public xc i() {
      return xb.a(super.i(), this.C);
   }

   @Override
   public void aP_() {
      this.A.accept(false);
   }
}
