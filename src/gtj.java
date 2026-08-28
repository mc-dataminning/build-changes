import java.util.function.UnaryOperator;

public class gtj extends gqc {
   private final gbk<gxf> a;
   private final alz b;

   public gtj(gro.a $$0, gek $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcw($$0.a($$1));
   }

   @Override
   protected gbk<gxf> a() {
      return this.a;
   }

   @Override
   protected glt b() {
      return this.a.a(this.b);
   }
}
