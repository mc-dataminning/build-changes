import java.util.function.UnaryOperator;

public class gqr extends gqc {
   private final gcf a;
   private final alz b;
   private final gbk<gxf> h;

   public gqr(gro.a $$0, gek $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcf.a($$0.a(gel.B), $$0x -> glt.i());
      this.h = new gar($$0.a($$1));
   }

   @Override
   protected gbk<gxf> a() {
      return this.h;
   }

   @Override
   protected glt b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxf $$0, fgq $$1, glj $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hba.d);
      }
   }
}
