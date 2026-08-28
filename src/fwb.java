public class fwb extends fwz<csz> {
   private static final aku G = aku.b("container/anvil/text_field");
   private static final aku H = aku.b("container/anvil/text_field_disabled");
   private static final aku I = aku.b("container/anvil/error");
   private static final aku J = aku.b("textures/gui/container/anvil.png");
   private static final wp K = wp.c("container.repair.expensive");
   private fpz L;
   private final cpr M;

   public fwb(csz $$0, cpq $$1, wp $$2) {
      super($$0, $$1, $$2, J);
      this.M = $$1.k;
      this.v = 60;
   }

   @Override
   protected void G() {
      int $$0 = (this.n - this.s) / 2;
      int $$1 = (this.o - this.u) / 2;
      this.L = new fpz(this.p, $$0 + 62, $$1 + 24, 103, 12, wp.c("container.repair"));
      this.L.f(false);
      this.L.m(-1);
      this.L.n(-1);
      this.L.d(false);
      this.L.f(50);
      this.L.b(this::a);
      this.L.a("");
      this.d(this.L);
      this.L.e(this.z.b(0).h());
   }

   @Override
   protected void aF_() {
      this.b(this.L);
   }

   @Override
   public void a(fmg $$0, int $$1, int $$2) {
      String $$3 = this.L.a();
      this.b($$0, $$1, $$2);
      this.L.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.t.p();
      }

      return !this.L.a($$0, $$1, $$2) && !this.L.c() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      cut $$1 = this.z.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().b(kv.g) && $$0.equals($$1.g().y().getString())) {
            $$2 = "";
         }

         if (this.z.a($$2)) {
            this.m.t.j.b(new ahr($$2));
         }
      }
   }

   @Override
   protected void b(fpc $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      int $$3 = this.z.m();
      if ($$3 > 0) {
         int $$4 = 8453920;
         wp $$5;
         if ($$3 >= 40 && !this.m.t.fX()) {
            $$5 = K;
            $$4 = 16736352;
         } else if (!this.z.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = wp.a("container.repair.cost", $$3);
            if (!this.z.b(2).a(this.M)) {
               $$4 = 16736352;
            }
         }

         if ($$5 != null) {
            int $$8 = this.s - 8 - this.p.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.s - 8, 79, 1325400064);
            $$0.b(this.p, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(fpc $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gnh::H, this.z.b(0).h() ? G : H, this.C + 59, this.D + 20, 110, 16);
   }

   @Override
   public void d(fpc $$0, int $$1, int $$2, float $$3) {
      this.L.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c(fpc $$0, int $$1, int $$2) {
      if ((this.z.b(0).h() || this.z.b(1).h()) && !this.z.b(this.z.n()).h()) {
         $$0.a(gnh::H, I, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(csw $$0, int $$1, cxh $$2) {
      if ($$1 == 0) {
         this.L.a($$2.f() ? "" : $$2.y().getString());
         this.L.e(!$$2.f());
         this.a(this.L);
      }
   }
}
