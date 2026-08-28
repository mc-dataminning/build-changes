import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gac extends gad {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xa c = xa.c("recover_world.title").a(o.r);
   private static final xa d = xa.c("recover_world.bug_tracker");
   private static final xa s = xa.c("recover_world.restore");
   private static final xa u = xa.c("recover_world.no_fallback");
   private static final xa v = xa.c("recover_world.done.title");
   private static final xa w = xa.c("recover_world.done.success");
   private static final xa x = xa.c("recover_world.done.failed");
   private static final xa y = xa.c("recover_world.issue.none").a(o.k);
   private static final xa z = xa.c("recover_world.issue.missing_file").a(o.m);
   private final BooleanConsumer A;
   private final fyd B = fyd.d().a(8);
   private final xa C;
   private final fvf D;
   private final fvf E;
   private final ezv.c F;

   public gac(frd $$0, BooleanConsumer $$1, ezv.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xa.a("recover_world.message", xa.b($$2.f()).a(o.h));
      this.D = new fvf(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xa $$5 = xa.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fvf($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fvs(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fyd $$7 = fyd.e().a(5);
      $$7.a(ful.a(d, fza.b(this, ayj.j)).b(120, 20).a());
      $$7.a(ful.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fvw.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(ful.a(wz.k, $$0x -> this.aP_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(frd $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fzo(xa.c("recover_world.restoring")));
         gfh.a(this.F);
         if (this.F.n()) {
            $$0.a(new fzb(this.A, v, w, wz.j, wz.k));
         } else {
            $$0.a(new fyw(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fyw(() -> this.A.accept(false), v, x));
      }
   }

   private xa a(ezv.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xa.i();
      } else {
         xo $$3 = xa.i();
         Instant $$4 = $$0.a($$1);
         xo $$5 = $$4 != null ? xa.b(gfs.a.format($$4)) : xa.c("recover_world.state_entry.unknown");
         $$3.b(xa.a("recover_world.state_entry", $$5.a(o.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof ur) {
            $$3.b(xa.b($$2.getCause().toString()).a(o.m));
         } else {
            $$3.b(xa.b($$2.toString()).a(o.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ezv.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uk | ur | IOException var4) {
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
      fxx.a(this.B, this.J());
   }

   @Override
   public xa i() {
      return wz.a(super.i(), this.C);
   }

   @Override
   public void aP_() {
      this.A.accept(false);
   }
}
