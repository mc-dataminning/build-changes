import java.util.Map;

public class gsp extends gsb<gwe, gaf> {
   private final gaf a;
   private final gaf b;
   private static final Map<bto.a, ale> c = Map.of(
      bto.a.b,
      ale.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bto.a.c,
      ale.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bto.a.d,
      ale.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gsp(gpk<gwe, gaf> $$0, gam $$1) {
      super($$0);
      this.a = new gaf($$1.a(gap.dh));
      this.b = new gaf($$1.a(gap.dj));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gwe $$3, float $$4, float $$5) {
      cvs $$6 = $$3.i;
      if ($$6.h() instanceof ctk $$7 && $$7.d() == ctk.a.b) {
         gaf $$9 = $$3.ae ? this.b : this.a;
         $$9.a($$3);
         fdm $$10 = $$1.getBuffer(ghv.f($$7.b()));
         $$9.a($$0, $$10, $$2, gwx.d);
         this.a($$0, $$1, $$2, $$6, $$7, $$9);
         this.a($$0, $$1, $$2, $$6, $$9);
         return;
      }
   }

   private void a(fdi $$0, ghl $$1, int $$2, cvs $$3, ctk $$4, fyj $$5) {
      if ($$3.a(axe.bD)) {
         int $$6 = cyk.a($$3, 0);
         if (axq.a($$6) == 0) {
            return;
         }

         ale $$7 = $$4.c();
         if ($$7 == null) {
            return;
         }

         $$5.a($$0, $$1.getBuffer(ghv.f($$7)), $$2, gwx.d, axq.f($$6));
      }
   }

   private void a(fdi $$0, ghl $$1, int $$2, cvs $$3, fyj $$4) {
      bto.a $$5 = bto.b.a($$3);
      if ($$5 != bto.a.a) {
         ale $$6 = c.get($$5);
         fdm $$7 = $$1.getBuffer(ghv.i($$6));
         $$4.a($$0, $$7, $$2, gwx.d);
      }
   }
}
