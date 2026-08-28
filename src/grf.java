import java.util.function.UnaryOperator;

public class grf extends gqq {
   private final gcv a;
   private final aku b;
   private final gca<gxu> h;

   public grf(gsc.a $$0, gfa $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcv.a($$0.a(gfb.E), $$0x -> gmh.i());
      this.h = new gbh($$0.a($$1));
   }

   @Override
   protected gca<gxu> a() {
      return this.h;
   }

   @Override
   protected gmh b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxu $$0, ffu $$1, glx $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hea.d);
      }
   }
}
