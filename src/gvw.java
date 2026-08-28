import java.util.function.UnaryOperator;

public class gvw extends gvh {
   private final ghg a;
   private final alg g;
   private final ggk<hck> h;

   public gvw(gwt.a $$0, gjm $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ghg.a($$0.a(gjn.E), $$0x -> gqx.i());
      this.h = new gfn($$0.a($$1));
   }

   @Override
   protected ggk<hck> a() {
      return this.h;
   }

   @Override
   protected gqx b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hck $$0, fjy $$1, gqm $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hja.d);
      }
   }
}
