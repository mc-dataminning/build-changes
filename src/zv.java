import javax.annotation.Nullable;

public class zv implements va<ws> {
   private final int a;
   private final int b;

   public zv(bil $$0, @Nullable bil $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public zv(sl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(sl $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
