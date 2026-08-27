import javax.annotation.Nullable;

public class sd extends sc {
   private final id a;
   private final id b;
   private final long c;

   public sd(String $$0, id $$1, id $$2, long $$3) {
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
   public id b() {
      return this.b;
   }

   @Nullable
   public id c() {
      return this.a;
   }
}
