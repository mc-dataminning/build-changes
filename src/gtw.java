import java.util.function.UnaryOperator;

public class gtw extends gqp {
   private final gby<gxt> a;
   private final aku b;

   public gtw(gsb.a $$0, gey $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gdk($$0.a($$1));
   }

   @Override
   protected gby<gxt> a() {
      return this.a;
   }

   @Override
   protected gmf b() {
      return this.a.a(this.b);
   }
}
