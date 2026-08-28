import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gdp extends gdl {
   private static final xc a = xc.c("options.videoTitle");
   private static final xc u = xc.c("options.graphics.fabulous").a(o.u);
   private static final xc v = xc.a("options.graphics.warning.message", u, u);
   private static final xc w = xc.c("options.graphics.warning.title").a(o.m);
   private static final xc x = xc.c("options.graphics.warning.accept");
   private static final xc y = xc.c("options.graphics.warning.cancel");
   private final grt z;
   private final int A;

   private static fri<?>[] a(frj $$0) {
      return new fri[]{
         $$0.k(),
         $$0.e(),
         $$0.m(),
         $$0.f(),
         $$0.l(),
         $$0.h(),
         $$0.Q(),
         $$0.i(),
         $$0.at(),
         $$0.F(),
         $$0.as(),
         $$0.j(),
         $$0.ad(),
         $$0.au(),
         $$0.E(),
         $$0.R(),
         $$0.am(),
         $$0.g(),
         $$0.an(),
         $$0.ai(),
         $$0.ap(),
         $$0.aq(),
         $$0.q(),
         $$0.ae()
      };
   }

   public gdp(gaf $$0, frf $$1, frj $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.h();
      if ($$2.k().c() == fqx.c) {
         this.z.d();
      }

      this.A = $$2.E().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fkm $$1 = this.m.aO();
      fkg $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fkl> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fri<Integer> $$6 = new fri<>("options.fullscreen.resolution", fri.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xc.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return frj.a($$1x, xc.c("options.fullscreen.current"));
         } else {
            fkl $$3x = $$2.a($$2x);
            return frj.a($$1x, xc.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fri.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.G());
      this.d.a(a(this.c));
   }

   @Override
   public void aP_() {
      this.m.aO().f();
      super.aP_();
   }

   @Override
   public void aJ_() {
      if (this.c.E().c() != this.A) {
         this.m.a(this.c.E().c());
         this.m.R();
      }

      super.aJ_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.f()) {
            List<xc> $$3 = Lists.newArrayList(new xc[]{v, xb.s});
            String $$4 = this.z.i();
            if ($$4 != null) {
               $$3.add(xb.s);
               $$3.add(xc.a("options.graphics.warning.renderer", $$4).a(o.h));
            }

            String $$5 = this.z.k();
            if ($$5 != null) {
               $$3.add(xb.s);
               $$3.add(xc.a("options.graphics.warning.vendor", $$5).a(o.h));
            }

            String $$6 = this.z.j();
            if ($$6 != null) {
               $$3.add(xb.s);
               $$3.add(xc.a("options.graphics.warning.version", $$6).a(o.h));
            }

            this.m.a(new gdo(w, $$3, ImmutableList.of(new gdo.a(x, $$0x -> {
               this.c.k().a(fqx.c);
               frf.Q().f.d();
               this.z.d();
               this.m.a(this);
            }), new gdo.a(y, $$0x -> {
               this.z.e();
               this.m.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (gaf.s()) {
         fri<Integer> $$4 = this.c.at();
         if ($$4.e() instanceof fri.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fuu<Integer> $$9 = (fuu<Integer>)this.d.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.d.a(0.0);
                  return true;
               }
            }
         }

         return false;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void c(boolean $$0) {
      if (this.d != null) {
         ful $$1 = this.d.b(this.c.ad());
         if ($$1 != null) {
            fuu<Boolean> $$2 = (fuu<Boolean>)$$1;
            $$2.a($$0);
         }
      }
   }
}
