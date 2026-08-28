import java.util.Map;

public class gsk extends grw<gvz, gaa> {
   private final gaa a;
   private final gaa b;
   private static final Map<btl.a, alc> c = Map.of(
      btl.a.b,
      alc.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      btl.a.c,
      alc.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      btl.a.d,
      alc.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gsk(gpf<gvz, gaa> $$0, gah $$1) {
      super($$0);
      this.a = new gaa($$1.a(gak.dh));
      this.b = new gaa($$1.a(gak.dj));
   }

   public void a(fde $$0, ghg $$1, int $$2, gvz $$3, float $$4, float $$5) {
      cvp $$6 = $$3.i;
      if ($$6.h() instanceof cth $$7 && $$7.d() == cth.a.b) {
         gaa $$9 = $$3.ae ? this.b : this.a;
         $$9.a($$3);
         fdi $$10 = $$1.getBuffer(ghq.f($$7.b()));
         $$9.a($$0, $$10, $$2, gws.d);
         this.a($$0, $$1, $$2, $$6, $$7, $$9);
         this.a($$0, $$1, $$2, $$6, $$9);
         return;
      }
   }

   private void a(fde $$0, ghg $$1, int $$2, cvp $$3, cth $$4, fyf $$5) {
      if ($$3.a(axc.bD)) {
         int $$6 = cyh.a($$3, 0);
         if (axo.a($$6) == 0) {
            return;
         }

         alc $$7 = $$4.c();
         if ($$7 == null) {
            return;
         }

         $$5.a($$0, $$1.getBuffer(ghq.f($$7)), $$2, gws.d, axo.f($$6));
      }
   }

   private void a(fde $$0, ghg $$1, int $$2, cvp $$3, fyf $$4) {
      btl.a $$5 = btl.b.a($$3);
      if ($$5 != btl.a.a) {
         alc $$6 = c.get($$5);
         fdi $$7 = $$1.getBuffer(ghq.i($$6));
         $$4.a($$0, $$7, $$2, gws.d);
      }
   }
}
