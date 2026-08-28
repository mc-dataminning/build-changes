import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyr extends fys {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wy c = wy.c("recover_world.title").a(o.r);
   private static final wy d = wy.c("recover_world.bug_tracker");
   private static final wy s = wy.c("recover_world.restore");
   private static final wy u = wy.c("recover_world.no_fallback");
   private static final wy v = wy.c("recover_world.done.title");
   private static final wy w = wy.c("recover_world.done.success");
   private static final wy x = wy.c("recover_world.done.failed");
   private static final wy y = wy.c("recover_world.issue.none").a(o.k);
   private static final wy z = wy.c("recover_world.issue.missing_file").a(o.m);
   private final BooleanConsumer A;
   private final fws B = fws.d().a(8);
   private final wy C;
   private final ftu D;
   private final ftu E;
   private final ezh.c F;

   public fyr(fpt $$0, BooleanConsumer $$1, ezh.c $$2) {
      super(c);
      this.A = $$1;
      this.C = wy.a("recover_world.message", wy.b($$2.f()).a(o.h));
      this.D = new ftu(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wy $$5 = wy.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new ftu($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fuh(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fws $$7 = fws.e().a(5);
      $$7.a(fta.a(d, fxp.b(this, ayh.j)).b(120, 20).a());
      $$7.a(fta.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ful.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fta.a(wx.k, $$0x -> this.aL_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fpt $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fyd(wy.c("recover_world.restoring")));
         gdw.a(this.F);
         if (this.F.n()) {
            $$0.a(new fxq(this.A, v, w, wx.j, wx.k));
         } else {
            $$0.a(new fxl(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fxl(() -> this.A.accept(false), v, x));
      }
   }

   private wy a(ezh.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wy.i();
      } else {
         xm $$3 = wy.i();
         Instant $$4 = $$0.a($$1);
         xm $$5 = $$4 != null ? wy.b(geh.a.format($$4)) : wy.c("recover_world.state_entry.unknown");
         $$3.b(wy.a("recover_world.state_entry", $$5.a(o.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof uq) {
            $$3.b(wy.b($$2.getCause().toString()).a(o.m));
         } else {
            $$3.b(wy.b($$2.toString()).a(o.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ezh.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uk | uq | IOException var4) {
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
      fwm.a(this.B, this.J());
   }

   @Override
   public wy i() {
      return wx.a(super.i(), this.C);
   }

   @Override
   public void aL_() {
      this.A.accept(false);
   }
}
