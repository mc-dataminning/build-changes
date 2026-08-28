import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gbr extends gbh<cyc> {
   private static final alr G = alr.b("container/smithing/error");
   private static final alr H = alr.b("container/slot/smithing_template_armor_trim");
   private static final alr I = alr.b("container/slot/smithing_template_netherite_upgrade");
   private static final xg J = xg.c("container.upgrade.missing_template_tooltip");
   private static final xg K = xg.c("container.upgrade.error_tooltip");
   private static final List<alr> L = List.of(H, I);
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
   private final gaw aa = new gaw(0);
   private final gaw ab = new gaw(1);
   private final gaw ac = new gaw(2);
   @Nullable
   private coc ad;

   public gbr(cyc $$0, csh $$1, xg $$2) {
      super($$0, $$1, $$2, alr.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void G() {
      this.ad = new coc(this.m.s, 0.0, 0.0, 0.0);
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
      Optional<dbo> $$0 = this.H();
      this.aa.a(L);
      this.ab.a($$0.map(dbo::c).orElse(List.of()));
      this.ac.a($$0.map(dbo::n).orElse(List.of()));
   }

   private Optional<dbo> H() {
      dak $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof dbo $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(ftk $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      gbg.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(cwb $$0, int $$1, dak $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(dak $$0) {
      if (this.ad != null) {
         for (bxo $$1 : bxo.j) {
            this.ad.a($$1, dak.l);
         }

         if (!$$0.f()) {
            dit $$2 = $$0.a(kl.D);
            bxo $$3 = $$2 != null ? $$2.b() : bxo.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(ftk $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(gry::H, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(ftk $$0, int $$1, int $$2) {
      Optional<xg> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         dak $$4 = this.z.b(0).g();
         dak $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof dbo $$6 && $$5.f()) {
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
