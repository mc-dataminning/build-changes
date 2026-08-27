import javax.annotation.Nullable;

public class zr implements uw<wo> {
   private final int a;
   private final int b;

   public zr(big $$0, @Nullable big $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public zr(sh $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(sh $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
