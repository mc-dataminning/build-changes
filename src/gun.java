import java.util.function.UnaryOperator;

public class gun extends gty {
   private final gfz a;
   private final ale g;
   private final gfd<hbb> h;

   public gun(gvk.a $$0, gie $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gfz.a($$0.a(gif.E), $$0x -> gpn.i());
      this.h = new gei($$0.a($$1));
   }

   @Override
   protected gfd<hbb> a() {
      return this.h;
   }

   @Override
   protected gpn b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hbb $$0, fiq $$1, gpd $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hhp.d);
      }
   }
}
