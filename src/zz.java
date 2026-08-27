import javax.annotation.Nullable;

public class zz implements ve<wx> {
   private final int a;
   private final int b;

   public zz(biw $$0, @Nullable biw $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public zz(so $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
