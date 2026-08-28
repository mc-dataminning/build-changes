public class grt extends gqf<chy, gxz, gbk> {
   private static final alp a = alp.b("textures/entity/fox/fox.png");
   private static final alp b = alp.b("textures/entity/fox/fox_sleep.png");
   private static final alp k = alp.b("textures/entity/fox/snow_fox.png");
   private static final alp l = alp.b("textures/entity/fox/snow_fox_sleep.png");

   public grt(grl.a $$0) {
      super($$0, new gbk($$0.a(gei.aN)), new gbk($$0.a(gei.aO)), 0.4F);
      this.a(new gvm(this, $$0.b()));
   }

   protected void a(gxz $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alp a(gxz $$0) {
      if ($$0.h == chy.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gxz b() {
      return new gxz();
   }

   public void a(chy $$0, gxz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fR();
      $$1.e = $$0.x();
      $$1.f = $$0.go();
      $$1.g = $$0.gp();
      $$1.h = $$0.t();
   }
}
