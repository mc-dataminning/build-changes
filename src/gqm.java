import java.util.function.UnaryOperator;

public class gqm extends gpx {
   private final gca a;
   private final alz b;
   private final gbf<gxa> h;

   public gqm(grj.a $$0, gef $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gca.a($$0.a(geg.B), $$0x -> glo.i());
      this.h = new gam($$0.a($$1));
   }

   @Override
   protected gbf<gxa> a() {
      return this.h;
   }

   @Override
   protected glo b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxa $$0, fgl $$1, gle $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hav.d);
      }
   }
}
