import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvh extends fvi {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wp c = wp.c("recover_world.title").a(n.r);
   private static final wp d = wp.c("recover_world.bug_tracker");
   private static final wp s = wp.c("recover_world.restore");
   private static final wp u = wp.c("recover_world.no_fallback");
   private static final wp v = wp.c("recover_world.done.title");
   private static final wp w = wp.c("recover_world.done.success");
   private static final wp x = wp.c("recover_world.done.failed");
   private static final wp y = wp.c("recover_world.issue.none").a(n.k);
   private static final wp z = wp.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fti B = fti.d().a(8);
   private final wp C;
   private final fqk D;
   private final fqk E;
   private final ewc.c F;

   public fvh(fmg $$0, BooleanConsumer $$1, ewc.c $$2) {
      super(c);
      this.A = $$1;
      this.C = wp.a("recover_world.message", wp.b($$2.f()).a(n.h));
      this.D = new fqk(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wp $$5 = wp.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fqk($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fqx(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fti $$7 = fti.e().a(5);
      $$7.a(fpq.a(d, fuf.b(this, axv.j)).b(120, 20).a());
      $$7.a(fpq.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : frb.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fpq.a(wo.k, $$0x -> this.aO_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fmg $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fut(wp.c("recover_world.restoring")));
         gak.a(this.F);
         if (this.F.n()) {
            $$0.a(new fug(this.A, v, w, wo.j, wo.k));
         } else {
            $$0.a(new fub(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fub(() -> this.A.accept(false), v, x));
      }
   }

   private wp a(ewc.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wp.i();
      } else {
         xd $$3 = wp.i();
         Instant $$4 = $$0.a($$1);
         xd $$5 = $$4 != null ? wp.b(gav.a.format($$4)) : wp.c("recover_world.state_entry.unknown");
         $$3.b(wp.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof uh) {
            $$3.b(wp.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wp.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ewc.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ub | uh | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      ftc.a(this.B, this.J());
   }

   @Override
   public wp i() {
      return wo.a(super.i(), this.C);
   }

   @Override
   public void aO_() {
      this.A.accept(false);
   }
}
