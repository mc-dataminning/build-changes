import java.util.function.UnaryOperator;

public class gqo extends gpz {
   private final gcc a;
   private final alp b;
   private final gbh<gxc> h;

   public gqo(grl.a $$0, geh $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcc.a($$0.a(gei.E), $$0x -> glq.i());
      this.h = new gao($$0.a($$1));
   }

   @Override
   protected gbh<gxc> a() {
      return this.h;
   }

   @Override
   protected glq b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxc $$0, fgl $$1, glg $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hax.d);
      }
   }
}
