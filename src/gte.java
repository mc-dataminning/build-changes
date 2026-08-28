import java.util.function.UnaryOperator;

public class gte extends gpx {
   private final gbf<gxa> a;
   private final alz b;

   public gte(grj.a $$0, gef $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcr($$0.a($$1));
   }

   @Override
   protected gbf<gxa> a() {
      return this.a;
   }

   @Override
   protected glo b() {
      return this.a.a(this.b);
   }
}
