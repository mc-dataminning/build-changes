import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwe extends fwf {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wv c = wv.c("recover_world.title").a(n.r);
   private static final wv d = wv.c("recover_world.bug_tracker");
   private static final wv s = wv.c("recover_world.restore");
   private static final wv u = wv.c("recover_world.no_fallback");
   private static final wv v = wv.c("recover_world.done.title");
   private static final wv w = wv.c("recover_world.done.success");
   private static final wv x = wv.c("recover_world.done.failed");
   private static final wv y = wv.c("recover_world.issue.none").a(n.k);
   private static final wv z = wv.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fuf B = fuf.d().a(8);
   private final wv C;
   private final frh D;
   private final frh E;
   private final ewz.c F;

   public fwe(fnd $$0, BooleanConsumer $$1, ewz.c $$2) {
      super(c);
      this.A = $$1;
      this.C = wv.a("recover_world.message", wv.b($$2.f()).a(n.h));
      this.D = new frh(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wv $$5 = wv.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new frh($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fru(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fuf $$7 = fuf.e().a(5);
      $$7.a(fqn.a(d, fvc.b(this, ayf.j)).b(120, 20).a());
      $$7.a(fqn.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fry.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fqn.a(wu.k, $$0x -> this.aK_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fnd $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fvq(wv.c("recover_world.restoring")));
         gbj.a(this.F);
         if (this.F.n()) {
            $$0.a(new fvd(this.A, v, w, wu.j, wu.k));
         } else {
            $$0.a(new fuy(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fuy(() -> this.A.accept(false), v, x));
      }
   }

   private wv a(ewz.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wv.i();
      } else {
         xj $$3 = wv.i();
         Instant $$4 = $$0.a($$1);
         xj $$5 = $$4 != null ? wv.b(gbu.a.format($$4)) : wv.c("recover_world.state_entry.unknown");
         $$3.b(wv.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof un) {
            $$3.b(wv.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wv.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ewz.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uh | un | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      ftz.a(this.B, this.J());
   }

   @Override
   public wv i() {
      return wu.a(super.i(), this.C);
   }

   @Override
   public void aK_() {
      this.A.accept(false);
   }
}
