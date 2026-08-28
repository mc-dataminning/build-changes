import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gao extends gae<cxc> {
   private static final alg G = alg.b("container/smithing/error");
   private static final alg H = alg.b("container/slot/smithing_template_armor_trim");
   private static final alg I = alg.b("container/slot/smithing_template_netherite_upgrade");
   private static final wy J = wy.c("container.upgrade.missing_template_tooltip");
   private static final wy K = wy.c("container.upgrade.error_tooltip");
   private static final List<alg> L = List.of(H, I);
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
   private final fzt aa = new fzt(0);
   private final fzt ab = new fzt(1);
   private final fzt ac = new fzt(2);
   @Nullable
   private cnd ad;

   public gao(cxc $$0, cri $$1, wy $$2) {
      super($$0, $$1, $$2, alg.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void G() {
      this.ad = new cnd(this.m.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.aV = 210.0F;
      this.ad.x(25.0F);
      this.ad.aX = this.ad.dK();
      this.ad.aY = this.ad.dK();
      this.b(this.z.b(3).g());
   }

   @Override
   public void E() {
      super.E();
      Optional<dao> $$0 = this.H();
      this.aa.a(L);
      this.ab.a($$0.map(dao::c).orElse(List.of()));
      this.ac.a($$0.map(dao::n).orElse(List.of()));
   }

   private Optional<dao> H() {
      czk $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof dao $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fsh $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      gad.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(cvc $$0, int $$1, czk $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(czk $$0) {
      if (this.ad != null) {
         for (bws $$1 : bws.j) {
            this.ad.a($$1, czk.k);
         }

         if (!$$0.f()) {
            dht $$2 = $$0.a(kk.D);
            bws $$3 = $$2 != null ? $$2.b() : bws.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(fsh $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(gqx::H, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fsh $$0, int $$1, int $$2) {
      Optional<wy> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         czk $$4 = this.z.b(0).g();
         czk $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof dao $$6 && $$5.f()) {
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
