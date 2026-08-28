import java.util.Optional;
import javax.annotation.Nullable;

public class gbw extends fzq {
   private static final xg a = xg.c("test_instance_block.test_id");
   private static final xg b = xg.c("test_instance_block.size");
   private static final xg c = xg.c("test_instance_block.entities");
   private static final xg d = xg.c("test_instance_block.rotation");
   private static final int s = 8;
   private static final int u = 316;
   private final eaj v;
   @Nullable
   private fuh w;
   @Nullable
   private fuh x;
   @Nullable
   private fuh y;
   @Nullable
   private fuh z;
   @Nullable
   private fui A;
   @Nullable
   private fty B;
   @Nullable
   private fty C;
   @Nullable
   private fuf<Boolean> D;
   @Nullable
   private fuf<dui> E;

   public gbw(eaj $$0) {
      super($$0.m().b().f());
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      int $$0 = this.n / 2 - 158;
      boolean $$1 = ac.aU;
      int $$2 = $$1 ? 3 : 2;
      int $$3 = a($$2);
      this.w = new fuh(this.p, $$0, 40, 316, 20, xg.c("test_instance_block.test_id"));
      this.w.f(128);
      Optional<alq<ss>> $$4 = this.v.j();
      if ($$4.isPresent()) {
         this.w.a($$4.get().a().toString());
      }

      this.w.b($$0x -> this.c(false));
      this.c(this.w);
      this.A = new fui($$0, 70, 316, 8 * 9, xg.b(""), this.p);
      this.c(this.A);
      kb $$5 = this.v.t();
      int $$6 = 0;
      this.x = new fuh(this.p, this.a($$6++, 5), 160, a(5), 20, xg.c("structure_block.size.x"));
      this.x.f(15);
      this.c(this.x);
      this.y = new fuh(this.p, this.a($$6++, 5), 160, a(5), 20, xg.c("structure_block.size.y"));
      this.y.f(15);
      this.c(this.y);
      this.z = new fuh(this.p, this.a($$6++, 5), 160, a(5), 20, xg.c("structure_block.size.z"));
      this.z.f(15);
      this.c(this.z);
      this.a($$5);
      this.E = this.c(fuf.<dui>a(gbw::a).a(dui.values()).a(this.v.u()).a().a(this.a($$6++, 5), 160, a(5), 20, d, ($$0x, $$1x) -> this.m()));
      this.D = this.c(fuf.b(!this.v.s()).a().a(this.a($$6++, 5), 160, a(5), 20, c));
      $$6 = 0;
      this.c(fty.a(xg.c("test_instance.action.reset"), $$0x -> {
         this.a(ajb.a.d);
         this.m.a(null);
      }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      this.B = this.c(fty.a(xg.c("test_instance.action.save"), $$0x -> {
         this.a(ajb.a.e);
         this.m.a(null);
      }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      if ($$1) {
         this.C = this.c(fty.a(xg.b("Export Structure"), $$0x -> {
            this.a(ajb.a.f);
            this.m.a(null);
         }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      }

      this.c(fty.a(xg.c("test_instance.action.run"), $$0x -> {
         this.a(ajb.a.g);
         this.m.a(null);
      }).a(this.a(0, 3), 210, a(3), 20).a());
      this.c(fty.a(xf.d, $$0x -> this.E()).a(this.a(1, 3), 210, a(3), 20).a());
      this.c(fty.a(xf.e, $$0x -> this.F()).a(this.a(2, 3), 210, a(3), 20).a());
      this.c(true);
   }

   private void m() {
      boolean $$0 = this.E.a() == dui.a && alr.c(this.w.a()) != null;
      this.B.j = $$0;
      if (this.C != null) {
         this.C.j = $$0;
      }
   }

   private static xg a(dui $$0) {
      return xg.b(switch ($$0) {
         case a -> "0";
         case b -> "90";
         case c -> "180";
         case d -> "270";
      });
   }

   private void a(kb $$0) {
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
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 158;
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      $$0.b(this.p, a, $$4, 30, 12632256);
      $$0.b(this.p, b, $$4, 150, 12632256);
      $$0.b(this.p, d, this.E.F(), 150, 12632256);
      $$0.b(this.p, c, this.D.F(), 150, 12632256);
   }

   private void c(boolean $$0) {
      boolean $$1 = this.a($$0 ? ajb.a.a : ajb.a.b);
      if (!$$1) {
         this.A.b(xg.c("test_instance.description.invalid_id").a(o.m));
      }

      this.m();
   }

   private void E() {
      this.a(ajb.a.c);
      this.aQ_();
   }

   private boolean a(ajb.a $$0) {
      Optional<alr> $$1 = Optional.ofNullable(alr.c(this.w.a()));
      Optional<alq<ss>> $$2 = $$1.map($$0x -> alq.a(mi.bh, $$0x));
      kb $$3 = new kb(a(this.x.a()), a(this.y.a()), a(this.z.a()));
      boolean $$4 = !this.D.a();
      this.m.L().b(new ajb(this.v.aC_(), $$0, $$2, $$3, this.E.a(), $$4));
      return $$1.isPresent();
   }

   public void a(xg $$0, Optional<kb> $$1) {
      xu $$2 = xg.i();
      this.v.v().ifPresent($$1x -> $$2.b(xg.a("test_instance.description.failed", xg.i().a(o.m).b($$1x))).f("\n\n"));
      $$2.b($$0);
      this.A.b($$2);
      $$1.ifPresent(this::a);
   }

   private void F() {
      this.aQ_();
   }

   private static int a(String $$0) {
      try {
         return azz.a(Integer.parseInt($$0), 1, 48);
      } catch (NumberFormatException var2) {
         return 1;
      }
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
