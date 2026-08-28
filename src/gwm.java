import java.util.Map;

public class gwm extends gvy<hac, gdw> {
   private final gdw a;
   private final gdw b;
   private final gvi c;
   private static final Map<bvc.a, alz> d = Map.of(
      bvc.a.b,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvc.a.c,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvc.a.d,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gwm(gtg<hac, gdw> $$0, ged $$1, gvi $$2) {
      super($$0);
      this.a = new gdw($$1.a(geg.dC));
      this.b = new gdw($$1.a(geg.dE));
      this.c = $$2;
   }

   public void a(fgl $$0, gle $$1, int $$2, hac $$3, float $$4, float $$5) {
      cxk $$6 = $$3.i;
      dfm $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gdw $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfk.d.d, $$9, $$8, $$6, glo::f, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fgl $$0, gle $$1, int $$2, cxk $$3, gca $$4) {
      bvc.a $$5 = bvc.b.a($$3);
      if ($$5 != bvc.a.a) {
         alz $$6 = d.get($$5);
         fgp $$7 = $$1.getBuffer(glo.i($$6));
         $$4.a($$0, $$7, $$2, hav.d);
      }
   }
}
