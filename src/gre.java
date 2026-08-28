import java.util.function.UnaryOperator;

public class gre extends gqp {
   private final gct a;
   private final aku b;
   private final gby<gxt> h;

   public gre(gsb.a $$0, gey $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gct.a($$0.a(gez.E), $$0x -> gmf.i());
      this.h = new gbf($$0.a($$1));
   }

   @Override
   protected gby<gxt> a() {
      return this.h;
   }

   @Override
   protected gmf b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxt $$0, ffs $$1, glv $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hec.d);
      }
   }
}
