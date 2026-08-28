import java.util.function.UnaryOperator;

public class gtk extends gqd {
   private final gbl<gxg> a;
   private final alz b;

   public gtk(grp.a $$0, gel $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcx($$0.a($$1));
   }

   @Override
   protected gbl<gxg> a() {
      return this.a;
   }

   @Override
   protected glu b() {
      return this.a.a(this.b);
   }
}
