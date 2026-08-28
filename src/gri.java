import java.util.function.UnaryOperator;

public class gri extends gqt {
   private final gcx a;
   private final akv b;
   private final gcc<gxx> h;

   public gri(gsf.a $$0, gfc $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcx.a($$0.a(gfd.E), $$0x -> gmj.i());
      this.h = new gbj($$0.a($$1));
   }

   @Override
   protected gcc<gxx> a() {
      return this.h;
   }

   @Override
   protected gmj b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxx $$0, ffv $$1, glz $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hej.d);
      }
   }
}
