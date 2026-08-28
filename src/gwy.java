import java.util.function.UnaryOperator;

public class gwy extends gwj {
   private final gij a;
   private final alr g;
   private final ghn<hdn> h;

   public gwy(gxv.a $$0, gkp $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gij.a($$0.a(gkq.E), $$0x -> gry.j());
      this.h = new ggq($$0.a($$1));
   }

   @Override
   protected ghn<hdn> a() {
      return this.h;
   }

   @Override
   protected gry b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hdn $$0, fld $$1, grn $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hkg.d);
      }
   }
}
