import java.util.function.UnaryOperator;

public class gqs extends gqd {
   private final gcg a;
   private final alz b;
   private final gbl<gxg> h;

   public gqs(grp.a $$0, gel $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcg.a($$0.a(gem.B), $$0x -> glu.i());
      this.h = new gas($$0.a($$1));
   }

   @Override
   protected gbl<gxg> a() {
      return this.h;
   }

   @Override
   protected glu b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxg $$0, fgr $$1, glk $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hbb.d);
      }
   }
}
