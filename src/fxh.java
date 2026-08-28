import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxh extends fxi {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final ww c = ww.c("recover_world.title").a(n.r);
   private static final ww d = ww.c("recover_world.bug_tracker");
   private static final ww s = ww.c("recover_world.restore");
   private static final ww u = ww.c("recover_world.no_fallback");
   private static final ww v = ww.c("recover_world.done.title");
   private static final ww w = ww.c("recover_world.done.success");
   private static final ww x = ww.c("recover_world.done.failed");
   private static final ww y = ww.c("recover_world.issue.none").a(n.k);
   private static final ww z = ww.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fvi B = fvi.d().a(8);
   private final ww C;
   private final fsk D;
   private final fsk E;
   private final eyb.c F;

   public fxh(fof $$0, BooleanConsumer $$1, eyb.c $$2) {
      super(c);
      this.A = $$1;
      this.C = ww.a("recover_world.message", ww.b($$2.f()).a(n.h));
      this.D = new fsk(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      ww $$5 = ww.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fsk($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fsx(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fvi $$7 = fvi.e().a(5);
      $$7.a(frq.a(d, fwf.b(this, ayf.j)).b(120, 20).a());
      $$7.a(frq.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ftb.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(frq.a(wv.k, $$0x -> this.aK_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fof $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fwt(ww.c("recover_world.restoring")));
         gcm.a(this.F);
         if (this.F.n()) {
            $$0.a(new fwg(this.A, v, w, wv.j, wv.k));
         } else {
            $$0.a(new fwb(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fwb(() -> this.A.accept(false), v, x));
      }
   }

   private ww a(eyb.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return ww.i();
      } else {
         xk $$3 = ww.i();
         Instant $$4 = $$0.a($$1);
         xk $$5 = $$4 != null ? ww.b(gcx.a.format($$4)) : ww.c("recover_world.state_entry.unknown");
         $$3.b(ww.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof uo) {
            $$3.b(ww.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(ww.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eyb.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ui | uo | IOException var4) {
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
      fvc.a(this.B, this.J());
   }

   @Override
   public ww i() {
      return wv.a(super.i(), this.C);
   }

   @Override
   public void aK_() {
      this.A.accept(false);
   }
}
