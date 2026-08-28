import java.util.function.UnaryOperator;

public class grg extends gqr {
   private final gcv a;
   private final akv b;
   private final gca<gxv> h;

   public grg(gsd.a $$0, gfa $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcv.a($$0.a(gfb.E), $$0x -> gmh.i());
      this.h = new gbh($$0.a($$1));
   }

   @Override
   protected gca<gxv> a() {
      return this.h;
   }

   @Override
   protected gmh b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxv $$0, fft $$1, glx $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, heh.d);
      }
   }
}
