import java.util.Optional;
import javax.annotation.Nullable;

public class fyl extends fwf {
   private static final wv a = wv.c("test_instance_block.test_id");
   private static final wv b = wv.c("test_instance_block.size");
   private static final wv c = wv.c("test_instance_block.entities");
   private static final wv d = wv.c("test_instance_block.rotation");
   private static final int s = 8;
   private static final int u = 316;
   private final dxg v;
   @Nullable
   private fqw w;
   @Nullable
   private fqw x;
   @Nullable
   private fqw y;
   @Nullable
   private fqw z;
   @Nullable
   private fqx A;
   @Nullable
   private fqn B;
   @Nullable
   private fqn C;
   @Nullable
   private fqu<Boolean> D;
   @Nullable
   private fqu<drm> E;

   public fyl(dxg $$0) {
      super($$0.m().b().f());
      this.v = $$0;
   }

   @Override
   protected void aN_() {
      int $$0 = this.n / 2 - 158;
      this.c(fqn.a(wv.b("Run Test"), $$0x -> {
         this.a(ain.a.g);
         this.m.a(null);
      }).a(this.a(0, 3), 210, a(3), 20).a());
      this.c(fqn.a(wu.d, $$0x -> this.E()).a(this.a(1, 3), 210, a(3), 20).a());
      this.c(fqn.a(wu.e, $$0x -> this.F()).a(this.a(2, 3), 210, a(3), 20).a());
      boolean $$1 = ab.aU;
      int $$2 = $$1 ? 3 : 2;
      int $$3 = a($$2);
      int $$4 = 0;
      this.c(fqn.a(wv.c("Reset and Load"), $$0x -> {
         this.a(ain.a.d);
         this.m.a(null);
      }).a(this.a($$4++, $$2), 185, $$3, 20).a());
      this.B = this.c(fqn.a(wv.c("Save Structure"), $$0x -> {
         this.a(ain.a.e);
         this.m.a(null);
      }).a(this.a($$4++, $$2), 185, $$3, 20).a());
      if ($$1) {
         this.C = this.c(fqn.a(wv.b("Export Structure"), $$0x -> {
            this.a(ain.a.f);
            this.m.a(null);
         }).a(this.a($$4++, $$2), 185, $$3, 20).a());
      }

      this.w = new fqw(this.p, $$0, 40, 316, 20, wv.c("test_instance_block.test_id"));
      this.w.f(128);
      Optional<alc<sp>> $$5 = this.v.j();
      if ($$5.isPresent()) {
         this.w.a($$5.get().a().toString());
      }

      this.w.b($$0x -> this.c(false));
      this.c(this.w);
      this.A = new fqx($$0, 70, 316, 8 * 9, wv.b(""), this.p);
      this.c(this.A);
      kn $$6 = this.v.t();
      $$4 = 0;
      this.x = new fqw(this.p, this.a($$4++, 5), 160, a(5), 20, wv.c("structure_block.size.x"));
      this.x.f(15);
      this.c(this.x);
      this.y = new fqw(this.p, this.a($$4++, 5), 160, a(5), 20, wv.c("structure_block.size.y"));
      this.y.f(15);
      this.c(this.y);
      this.z = new fqw(this.p, this.a($$4++, 5), 160, a(5), 20, wv.c("structure_block.size.z"));
      this.z.f(15);
      this.c(this.z);
      this.a($$6);
      this.E = this.c(fqu.<drm>a(fyl::a).a(drm.values()).a(this.v.u()).a().a(this.a($$4++, 5), 160, a(5), 20, d, ($$0x, $$1x) -> this.m()));
      this.D = this.c(fqu.b(!this.v.s()).a().a(this.a($$4++, 5), 160, a(5), 20, c));
      this.c(true);
   }

   private void m() {
      boolean $$0 = this.E.a() == drm.a && ald.c(this.w.a()) != null;
      this.B.j = $$0;
      if (this.C != null) {
         this.C.j = $$0;
      }
   }

   private static wv a(drm $$0) {
      return wv.b(switch ($$0) {
         case a -> "0";
         case b -> "90";
         case c -> "180";
         case d -> "270";
      });
   }

   private void a(kn $$0) {
      this.x.a(Integer.toString($$0.u()));
      this.y.a(Integer.toString($$0.v()));
      this.z.a(Integer.toString($$0.w()));
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.n / 2 - 158;
      float $$3 = b($$1);
      return (int)((float)$$2 + (float)$$0 * (8.0F + $$3));
   }

   private static int a(int $$0) {
      return (int)b($$0);
   }

   private static float b(int $$0) {
      return (float)(316 - ($$0 - 1) * 8) / (float)$$0;
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      $$0.b(this.p, a, this.n / 2 - 153, 30, 12632256);
      $$0.b(this.p, b, this.n / 2 - 153, 150, 12632256);
      $$0.b(this.p, d, this.E.F(), 150, 12632256);
      $$0.b(this.p, c, this.D.F(), 150, 12632256);
   }

   private void c(boolean $$0) {
      boolean $$1 = this.a($$0 ? ain.a.a : ain.a.b);
      if (!$$1) {
         this.A.b(wv.b("Invalid test ID").a(n.m));
      }

      this.m();
   }

   private void E() {
      this.a(ain.a.c);
      this.aK_();
   }

   private boolean a(ain.a $$0) {
      Optional<ald> $$1 = Optional.ofNullable(ald.c(this.w.a()));
      Optional<alc<sp>> $$2 = $$1.map($$0x -> alc.a(me.bf, $$0x));
      kn $$3 = new kn(a(this.x.a()), a(this.y.a()), a(this.z.a()));
      boolean $$4 = this.D.a();
      this.m.L().b(new ain(this.v.aw_(), $$0, $$2, $$3, this.E.a(), $$4));
      return $$1.isPresent();
   }

   public void a(wv $$0, Optional<kn> $$1) {
      xj $$2 = wv.i();
      this.v.v().ifPresent($$1x -> $$2.b(wv.a("test_instance.description.failed", wv.i().a(n.m).b($$1x))).f("\n\n"));
      $$2.b($$0);
      this.A.b($$2);
      $$1.ifPresent(this::a);
   }

   private void F() {
      this.aK_();
   }

   private static int a(String $$0) {
      try {
         return Math.max(Integer.parseInt($$0), 1);
      } catch (NumberFormatException var2) {
         return 1;
      }
   }
}
