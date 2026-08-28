import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gce extends gbu<cxq> {
   private static final ali G = ali.b("container/smithing/error");
   private static final ali H = ali.b("container/slot/smithing_template_armor_trim");
   private static final ali I = ali.b("container/slot/smithing_template_netherite_upgrade");
   private static final xa J = xa.c("container.upgrade.missing_template_tooltip");
   private static final xa K = xa.c("container.upgrade.error_tooltip");
   private static final List<ali> L = List.of(H, I);
   private static final int M = 44;
   private static final int N = 15;
   private static final int O = 28;
   private static final int P = 21;
   private static final int Q = 65;
   private static final int R = 46;
   private static final int S = 115;
   private static final int T = 210;
   private static final int U = 25;
   private static final Vector3f V = new Vector3f();
   private static final Quaternionf W = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int X = 25;
   private static final int Y = 75;
   private static final int Z = 141;
   private final gbj aa = new gbj(0);
   private final gbj ab = new gbj(1);
   private final gbj ac = new gbj(2);
   @Nullable
   private cnr ad;

   public gce(cxq $$0, crw $$1, xa $$2) {
      super($$0, $$1, $$2, ali.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void G() {
      this.ad = new cnr(this.m.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.aV = 210.0F;
      this.ad.x(25.0F);
      this.ad.aX = this.ad.dL();
      this.ad.aY = this.ad.dL();
      this.b(this.z.b(3).g());
   }

   @Override
   public void E() {
      super.E();
      Optional<dbc> $$0 = this.H();
      this.aa.a(L);
      this.ab.a($$0.map(dbc::c).orElse(List.of()));
      this.ac.a($$0.map(dbc::n).orElse(List.of()));
   }

   private Optional<dbc> H() {
      czy $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof dbc $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(ftx $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      gbt.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(cvq $$0, int $$1, czy $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(czy $$0) {
      if (this.ad != null) {
         for (bxd $$1 : bxd.j) {
            this.ad.a($$1, czy.k);
         }

         if (!$$0.f()) {
            dih $$2 = $$0.a(kk.D);
            bxd $$3 = $$2 != null ? $$2.b() : bxd.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(ftx $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(gsl::H, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(ftx $$0, int $$1, int $$2) {
      Optional<xa> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         czy $$4 = this.z.b(0).g();
         czy $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof dbc $$6 && $$5.f()) {
            if (this.B.d == 1) {
               $$3 = Optional.of($$6.a());
            } else if (this.B.d == 2) {
               $$3 = Optional.of($$6.b());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean I() {
      return this.z.m();
   }
}
