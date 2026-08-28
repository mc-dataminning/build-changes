import java.util.function.UnaryOperator;

public class grh extends gqs {
   private final gcw a;
   private final akv b;
   private final gcb<gxw> h;

   public grh(gse.a $$0, gfb $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcw.a($$0.a(gfc.E), $$0x -> gmi.i());
      this.h = new gbi($$0.a($$1));
   }

   @Override
   protected gcb<gxw> a() {
      return this.h;
   }

   @Override
   protected gmi b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxw $$0, ffu $$1, gly $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hei.d);
      }
   }
}
