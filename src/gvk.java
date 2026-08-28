import java.util.function.UnaryOperator;

public class gvk extends guv {
   private final ggu a;
   private final alg g;
   private final gfy<hby> h;

   public gvk(gwh.a $$0, gja $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ggu.a($$0.a(gjb.E), $$0x -> gqk.i());
      this.h = new gfb($$0.a($$1));
   }

   @Override
   protected gfy<hby> a() {
      return this.h;
   }

   @Override
   protected gqk b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hby $$0, fjj $$1, gqa $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hin.d);
      }
   }
}
