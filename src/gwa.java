import java.util.function.UnaryOperator;

public class gwa extends gst {
   private final gea<gzw> a;
   private final ald g;

   public gwa(guf.a $$0, ghb $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gfn($$0.a($$1));
   }

   @Override
   protected gea<gzw> a() {
      return this.a;
   }

   @Override
   protected goi b() {
      return this.a.a(this.g);
   }
}
