import java.util.function.UnaryOperator;

public class gxn extends gwy {
   private final giy a;
   private final alk g;
   private final gic<hec> h;

   public gxn(gyk.a $$0, gle $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new giy.a($$0.a(glf.E), $$0x -> gsn.j());
      this.h = new ghf($$0.a($$1));
   }

   @Override
   protected gic<hec> a() {
      return this.h;
   }

   @Override
   protected gsn b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hec $$0, flq $$1, gsc $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hks.d);
      }
   }
}
