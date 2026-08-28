import java.util.function.UnaryOperator;

public class gsg extends grr {
   private final gdv a;
   private final aku b;
   private final gda<gyv> h;

   public gsg(gtd.a $$0, gga $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gdv.a($$0.a(ggb.E), $$0x -> gnh.i());
      this.h = new gcg($$0.a($$1));
   }

   @Override
   protected gda<gyv> a() {
      return this.h;
   }

   @Override
   protected gnh b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gyv $$0, fgr $$1, gmx $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hfh.d);
      }
   }
}
