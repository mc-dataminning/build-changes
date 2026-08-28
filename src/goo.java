import java.util.function.UnaryOperator;

public class goo extends gnz {
   private final gae a;
   private final alj b;
   private final fzj<gvb> h;

   public goo(gpk.a $$0, gcj $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gae.a($$0.a(gck.B), $$0x -> gjq.i());
      this.h = new fyr($$0.a($$1));
   }

   @Override
   protected fzj<gvb> a() {
      return this.h;
   }

   @Override
   protected gjq b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gvb $$0, fer $$1, gjg $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, gyv.d);
      }
   }
}
