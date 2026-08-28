import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fxj extends fwz<cuw> {
   private static final aku G = aku.b("container/smithing/error");
   private static final aku H = aku.b("container/slot/smithing_template_armor_trim");
   private static final aku I = aku.b("container/slot/smithing_template_netherite_upgrade");
   private static final wp J = wp.c("container.upgrade.missing_template_tooltip");
   private static final wp K = wp.c("container.upgrade.error_tooltip");
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
   private final fwo aa = new fwo(0);
   private final fwo ab = new fwo(1);
   private final fwo ac = new fwo(2);
   @Nullable
   private cll ad;

   public fxj(cuw $$0, cpq $$1, wp $$2) {
      super($$0, $$1, $$2, aku.b("textures/gui/container/smithing.png"));
      this.v = 44;
      this.w = 15;
   }

   @Override
   protected void G() {
      this.ad = new cll(this.m.s, 0.0, 0.0, 0.0);
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
      Optional<cym> $$0 = this.H();
      this.aa.a(L);
      this.ab.a($$0.map(cym::d).orElse(List.of()));
      this.ac.a($$0.map(cym::o).orElse(List.of()));
   }

   private Optional<cym> H() {
      cxh $$0 = this.z.b(0).g();
      return !$$0.f() && $$0.h() instanceof cym $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2);
   }

   @Override
   protected void a(fpc $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.z, $$0, $$1, this.C, this.D);
      this.ab.a(this.z, $$0, $$1, this.C, this.D);
      this.ac.a(this.z, $$0, $$1, this.C, this.D);
      fwy.a($$0, (float)(this.C + 141), (float)(this.D + 75), 25.0F, V, W, null, this.ad);
   }

   @Override
   public void a(csw $$0, int $$1, cxh $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(cxh $$0) {
      if (this.ad != null) {
         for (bvj $$1 : bvj.i) {
            this.ad.a($$1, cxh.k);
         }

         if (!$$0.f()) {
            dfm $$2 = $$0.a(kv.E);
            bvj $$3 = $$2 != null ? $$2.a() : bvj.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void c(fpc $$0, int $$1, int $$2) {
      if (this.I()) {
         $$0.a(gnh::H, G, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void d(fpc $$0, int $$1, int $$2) {
      Optional<wp> $$3 = Optional.empty();
      if (this.I() && this.a(65, 46, 28, 21, (double)$$1, (double)$$2)) {
         $$3 = Optional.of(K);
      }

      if (this.B != null) {
         cxh $$4 = this.z.b(0).g();
         cxh $$5 = this.B.g();
         if ($$4.f()) {
            if (this.B.d == 0) {
               $$3 = Optional.of(J);
            }
         } else if ($$4.h() instanceof cym $$6 && $$5.f()) {
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
