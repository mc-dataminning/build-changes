import javax.annotation.Nullable;

public class zz implements vd<ww> {
   private final int a;
   private final int b;

   public zz(biq $$0, @Nullable biq $$1) {
      this.a = $$0.ai();
      this.b = $$1 != null ? $$1.ai() : 0;
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

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
