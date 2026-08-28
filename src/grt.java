import java.util.Map;

public class grt extends grf<gvi, fzq> {
   private final fzq a;
   private final fzq b;
   private static final Map<btg.a, alb> c = Map.of(
      btg.a.b,
      alb.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      btg.a.c,
      alb.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      btg.a.d,
      alb.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public grt(goo<gvi, fzq> $$0, fzx $$1) {
      super($$0);
      this.a = new fzq($$1.a(gaa.dg));
      this.b = new fzq($$1.a(gaa.di));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gvi $$3, float $$4, float $$5) {
      cvl $$6 = $$3.i;
      if ($$6.h() instanceof ctb $$7 && $$7.d() == ctb.a.b) {
         fzq $$9 = $$3.ae ? this.b : this.a;
         $$9.a($$3);
         fcy $$10 = $$1.getBuffer(ghe.f($$7.b()));
         $$9.a($$0, $$10, $$2, gwb.d);
         this.a($$0, $$1, $$2, $$6, $$7, $$9);
         this.a($$0, $$1, $$2, $$6, $$9);
         return;
      }
   }

   private void a(fcu $$0, ggv $$1, int $$2, cvl $$3, ctb $$4, fxv $$5) {
      if ($$3.a(axb.bD)) {
         int $$6 = cyd.a($$3, 0);
         if (axn.a($$6) == 0) {
            return;
         }

         alb $$7 = $$4.c();
         if ($$7 == null) {
            return;
         }

         $$5.a($$0, $$1.getBuffer(ghe.f($$7)), $$2, gwb.d, axn.f($$6));
      }
   }

   private void a(fcu $$0, ggv $$1, int $$2, cvl $$3, fxv $$4) {
      btg.a $$5 = btg.b.a($$3);
      if ($$5 != btg.a.a) {
         alb $$6 = c.get($$5);
         fcy $$7 = $$1.getBuffer(ghe.j($$6));
         $$4.a($$0, $$7, $$2, gwb.d);
      }
   }
}
