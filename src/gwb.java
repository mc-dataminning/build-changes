import java.util.function.UnaryOperator;

public class gwb extends gvm {
   private final ghl a;
   private final alg g;
   private final ggp<hcq> h;

   public gwb(gwy.a $$0, gjr $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ghl.a($$0.a(gjs.E), $$0x -> grc.i());
      this.h = new gfs($$0.a($$1));
   }

   @Override
   protected ggp<hcq> a() {
      return this.h;
   }

   @Override
   protected grc b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hcq $$0, fkd $$1, gqr $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hjg.d);
      }
   }
}
