import java.util.function.UnaryOperator;

public class gti extends gst {
   private final gew a;
   private final ald g;
   private final gea<gzw> h;

   public gti(guf.a $$0, ghb $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gew.a($$0.a(ghc.E), $$0x -> goi.i());
      this.h = new gdf($$0.a($$1));
   }

   @Override
   protected gea<gzw> a() {
      return this.h;
   }

   @Override
   protected goi b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(gzw $$0, fho $$1, gny $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hgi.d);
      }
   }
}
