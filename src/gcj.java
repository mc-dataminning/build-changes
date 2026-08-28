import java.util.Optional;
import javax.annotation.Nullable;

public class gcj extends gad {
   private static final xa a = xa.c("test_instance_block.test_id");
   private static final xa b = xa.c("test_instance_block.size");
   private static final xa c = xa.c("test_instance_block.entities");
   private static final xa d = xa.c("test_instance_block.rotation");
   private static final int s = 8;
   private static final int u = 316;
   private final dzx v;
   @Nullable
   private fuu w;
   @Nullable
   private fuu x;
   @Nullable
   private fuu y;
   @Nullable
   private fuu z;
   @Nullable
   private fuv A;
   @Nullable
   private ful B;
   @Nullable
   private ful C;
   @Nullable
   private fus<Boolean> D;
   @Nullable
   private fus<dtw> E;

   public gcj(dzx $$0) {
      super($$0.m().b().f());
      this.v = $$0;
   }

   @Override
   protected void aS_() {
      int $$0 = this.n / 2 - 158;
      boolean $$1 = ac.aU;
      int $$2 = $$1 ? 3 : 2;
      int $$3 = a($$2);
      this.w = new fuu(this.p, $$0, 40, 316, 20, xa.c("test_instance_block.test_id"));
      this.w.f(128);
      Optional<alh<sr>> $$4 = this.v.j();
      if ($$4.isPresent()) {
         this.w.a($$4.get().a().toString());
      }

      this.w.b($$0x -> this.c(false));
      this.c(this.w);
      this.A = new fuv($$0, 70, 316, 8 * 9, xa.b(""), this.p);
      this.c(this.A);
      ka $$5 = this.v.t();
      int $$6 = 0;
      this.x = new fuu(this.p, this.a($$6++, 5), 160, a(5), 20, xa.c("structure_block.size.x"));
      this.x.f(15);
      this.c(this.x);
      this.y = new fuu(this.p, this.a($$6++, 5), 160, a(5), 20, xa.c("structure_block.size.y"));
      this.y.f(15);
      this.c(this.y);
      this.z = new fuu(this.p, this.a($$6++, 5), 160, a(5), 20, xa.c("structure_block.size.z"));
      this.z.f(15);
      this.c(this.z);
      this.a($$5);
      this.E = this.c(fus.<dtw>a(gcj::a).a(dtw.values()).a(this.v.u()).a().a(this.a($$6++, 5), 160, a(5), 20, d, ($$0x, $$1x) -> this.m()));
      this.D = this.c(fus.b(!this.v.s()).a().a(this.a($$6++, 5), 160, a(5), 20, c));
      $$6 = 0;
      this.c(ful.a(xa.c("test_instance.action.reset"), $$0x -> {
         this.a(ais.a.d);
         this.m.a(null);
      }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      this.B = this.c(ful.a(xa.c("test_instance.action.save"), $$0x -> {
         this.a(ais.a.e);
         this.m.a(null);
      }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      if ($$1) {
         this.C = this.c(ful.a(xa.b("Export Structure"), $$0x -> {
            this.a(ais.a.f);
            this.m.a(null);
         }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      }

      this.c(ful.a(xa.c("test_instance.action.run"), $$0x -> {
         this.a(ais.a.g);
         this.m.a(null);
      }).a(this.a(0, 3), 210, a(3), 20).a());
      this.c(ful.a(wz.d, $$0x -> this.E()).a(this.a(1, 3), 210, a(3), 20).a());
      this.c(ful.a(wz.e, $$0x -> this.F()).a(this.a(2, 3), 210, a(3), 20).a());
      this.c(true);
   }

   private void m() {
      boolean $$0 = this.E.a() == dtw.a && ali.c(this.w.a()) != null;
      this.B.j = $$0;
      if (this.C != null) {
         this.C.j = $$0;
      }
   }

   private static xa a(dtw $$0) {
      return xa.b(switch ($$0) {
         case a -> "0";
         case b -> "90";
         case c -> "180";
         case d -> "270";
      });
   }

   private void a(ka $$0) {
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
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 158;
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      $$0.b(this.p, a, $$4, 30, 12632256);
      $$0.b(this.p, b, $$4, 150, 12632256);
      $$0.b(this.p, d, this.E.F(), 150, 12632256);
      $$0.b(this.p, c, this.D.F(), 150, 12632256);
   }

   private void c(boolean $$0) {
      boolean $$1 = this.a($$0 ? ais.a.a : ais.a.b);
      if (!$$1) {
         this.A.b(xa.c("test_instance.description.invalid_id").a(o.m));
      }

      this.m();
   }

   private void E() {
      this.a(ais.a.c);
      this.aP_();
   }

   private boolean a(ais.a $$0) {
      Optional<ali> $$1 = Optional.ofNullable(ali.c(this.w.a()));
      Optional<alh<sr>> $$2 = $$1.map($$0x -> alh.a(mh.bh, $$0x));
      ka $$3 = new ka(a(this.x.a()), a(this.y.a()), a(this.z.a()));
      boolean $$4 = !this.D.a();
      this.m.L().b(new ais(this.v.aB_(), $$0, $$2, $$3, this.E.a(), $$4));
      return $$1.isPresent();
   }

   public void a(xa $$0, Optional<ka> $$1) {
      xo $$2 = xa.i();
      this.v.v().ifPresent($$1x -> $$2.b(xa.a("test_instance.description.failed", xa.i().a(o.m).b($$1x))).f("\n\n"));
      $$2.b($$0);
      this.A.b($$2);
      $$1.ifPresent(this::a);
   }

   private void F() {
      this.aP_();
   }

   private static int a(String $$0) {
      try {
         return azo.a(Integer.parseInt($$0), 1, 48);
      } catch (NumberFormatException var2) {
         return 1;
      }
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
