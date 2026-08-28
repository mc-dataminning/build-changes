import java.util.function.UnaryOperator;

public class grf extends gnz {
   private final fzj<gvb> a;
   private final alj b;

   public grf(gpk.a $$0, gcj $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gav($$0.a($$1));
   }

   @Override
   protected fzj<gvb> a() {
      return this.a;
   }

   @Override
   protected gjq b() {
      return this.a.a(this.b);
   }
}
