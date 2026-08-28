public class gpi extends gnv<chf, gvm, fzd> {
   private static final all a = all.b("textures/entity/fox/fox.png");
   private static final all b = all.b("textures/entity/fox/fox_sleep.png");
   private static final all k = all.b("textures/entity/fox/snow_fox.png");
   private static final all l = all.b("textures/entity/fox/snow_fox_sleep.png");

   public gpi(gpa.a $$0) {
      super($$0, new fzd($$0.a(gcb.az)), new fzd($$0.a(gcb.aA)), 0.4F);
      this.a(new gta(this, $$0.b()));
   }

   protected void a(gvm $$0, fek $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public all a(gvm $$0) {
      if ($$0.h == chf.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gvm c() {
      return new gvm();
   }

   public void a(chf $$0, gvm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ck();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fU();
      $$1.e = $$0.y();
      $$1.f = $$0.gv();
      $$1.g = $$0.gw();
      $$1.h = $$0.t();
   }
}
