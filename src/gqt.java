import java.util.function.UnaryOperator;

public class gqt extends gqe {
   private final gch a;
   private final alz b;
   private final gbm<gxh> h;

   public gqt(grq.a $$0, gem $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gch.a($$0.a(gen.B), $$0x -> glv.i());
      this.h = new gat($$0.a($$1));
   }

   @Override
   protected gbm<gxh> a() {
      return this.h;
   }

   @Override
   protected glv b() {
      return this.h.a(this.b);
   }

   @Override
   protected void b(gxh $$0, fgs $$1, gll $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.b)), $$3, hbc.d);
      }
   }
}
