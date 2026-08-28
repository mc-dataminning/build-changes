import java.util.function.UnaryOperator;

public class gyo extends gvh {
   private final ggk<hck> a;
   private final alg g;

   public gyo(gwt.a $$0, gjm $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ghx($$0.a($$1));
   }

   @Override
   protected ggk<hck> a() {
      return this.a;
   }

   @Override
   protected gqx b() {
      return this.a.a(this.g);
   }
}
