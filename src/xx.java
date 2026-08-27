import javax.annotation.Nullable;

public class xx implements uo<ur> {
   private final int a;
   private final int b;

   public xx(bfj $$0, @Nullable bfj $$1) {
      this.a = $$0.af();
      this.b = $$1 != null ? $$1.af() : 0;
   }

   public xx(sf $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
