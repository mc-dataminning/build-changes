import java.util.function.UnaryOperator;

public class haf extends gwy {
   private final gic<hec> a;
   private final alk g;

   public haf(gyk.a $$0, gle $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gjp($$0.a($$1));
   }

   @Override
   protected gic<hec> a() {
      return this.a;
   }

   @Override
   protected gsn b() {
      return this.a.a(this.g);
   }
}
