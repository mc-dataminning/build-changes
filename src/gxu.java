import java.util.function.UnaryOperator;

public class gxu extends gun {
   private final gfq<hbq> a;
   private final alg g;

   public gxu(gvz.a $$0, gis $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ghd($$0.a($$1));
   }

   @Override
   protected gfq<hbq> a() {
      return this.a;
   }

   @Override
   protected gqc b() {
      return this.a.a(this.g);
   }
}
