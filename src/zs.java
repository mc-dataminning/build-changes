import javax.annotation.Nullable;

public class zs implements ux<wp> {
   private final int a;
   private final int b;

   public zs(bii $$0, @Nullable bii $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public zs(si $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(si $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
