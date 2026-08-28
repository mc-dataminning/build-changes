import java.util.function.UnaryOperator;

public class gxl extends gww {
   private final giw a;
   private final ali g;
   private final gia<hea> h;

   public gxl(gyi.a $$0, glc $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new giw.a($$0.a(gld.E), $$0x -> gsl.j());
      this.h = new ghd($$0.a($$1));
   }

   @Override
   protected gia<hea> a() {
      return this.h;
   }

   @Override
   protected gsl b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hea $$0, flo $$1, gsa $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hkq.d);
      }
   }
}
