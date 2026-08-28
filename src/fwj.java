import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fwj extends fvz<cua> {
   private static final aku G = aku.b("container/smithing/error");
   private static final aku H = aku.b("container/slot/smithing_template_armor_trim");
   private static final aku I = aku.b("container/slot/smithing_template_netherite_upgrade");
   private static final wo J = wo.c("container.upgrade.missing_template_tooltip");
   private static final wo K = wo.c("container.upgrade.error_tooltip");
   private static final List<aku> L = List.of(H, I);
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
   private final fvo aa = new fvo(0);
   private final fvo ab = new fvo(1);
   private final fvo ac = new fvo(2);
   @Nullable
   private ckp ad;

   public fwj(cua $$0, cou $$1, wo $$2) {
      super($$0, $$1, $$2, aku.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void G() {
      this.ad = new ckp(this.m.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.aX = 210.0F;
      this.ad.w(25.0F);
      this.ad.aZ = this.ad.dM();
      this.ad.ba = this.ad.dM();
      this.b(this.z.b(3).g());
   }

   @Override
   public void E() {
      super.E();
      Optional<cxt> $$0 = this.H();
      this.aa.a(L);
      this.ab.a($$0.map(cxt::d).orElse(List.of()));
      this.ac.a($$0.map(cxt::o).orElse(List.of()));
   }

   private Optional<cxt> H() {
      cwn $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof cxt $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fob $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      fvy.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(csa $$0, int $$1, cwn $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cwn $$0) {
      if (this.ad != null) {
         for (bur $$1 : bur.i) {
            this.ad.a($$1, cwn.j);
         }

         if (!$$0.f()) {
            des $$2 = $$0.a(kv.D);
            bur $$3 = $$2 != null ? $$2.a() : bur.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(fob $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(gmf::H, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fob $$0, int $$1, int $$2) {
      Optional<wo> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         cwn $$4 = this.z.b(0).g();
         cwn $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof cxt $$6 && $$5.f()) {
            if (this.B.d == 1) {
               $$3 = Optional.of($$6.b());
            } else if (this.B.d == 2) {
               $$3 = Optional.of($$6.c());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.p, this.p.c($$3x, 115), $$1, $$2));
   }

   private boolean I() {
      return this.z.m();
   }
}
