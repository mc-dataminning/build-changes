import javax.annotation.Nullable;

public class sm extends sl {
   private final ja a;
   private final ja b;
   private final long c;

   public sm(String $$0, ja $$1, ja $$2, long $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   public String getMessage() {
      String $$0 = this.a.u() + "," + this.a.v() + "," + this.a.w() + " (relative: " + this.b.u() + "," + this.b.v() + "," + this.b.w() + ")";
      return super.getMessage() + " at " + $$0 + " (t=" + this.c + ")";
   }

   @Nullable
   public String a() {
      return super.getMessage();
   }

   @Nullable
   public ja b() {
      return this.b;
   }

   @Nullable
   public ja c() {
      return this.a;
   }
}
