import java.util.function.UnaryOperator;

public class gvc extends gun {
   private final ggm a;
   private final alg g;
   private final gfq<hbq> h;

   public gvc(gvz.a $$0, gis $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ggm.a($$0.a(git.E), $$0x -> gqc.i());
      this.h = new geu($$0.a($$1));
   }

   @Override
   protected gfq<hbq> a() {
      return this.h;
   }

   @Override
   protected gqc b() {
      return this.h.a(this.g);
   }

   @Override
   protected void b(hbq $$0, fjc $$1, gps $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.g)), $$3, hif.d);
      }
   }
}
