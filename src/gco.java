import org.joml.Matrix4f;

public class gco implements gcp {
   private final aza a;

   public gco(aza $$0) {
      this.a = $$0;
   }

   @Override
   public int b(ftv $$0) {
      return $$0.a(this.a);
   }

   @Override
   public int a(ftv $$0) {
      return 10;
   }

   @Override
   public void a(ftv $$0, int $$1, int $$2, Matrix4f $$3, gsa.a $$4) {
      $$0.a(this.a, (float)$$1, (float)$$2, -1, true, $$3, $$4, ftv.a.a, 0, 15728880);
   }
}
