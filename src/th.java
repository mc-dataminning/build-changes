import javax.annotation.Nullable;

public class th extends tg {
   private final iz a;
   private final iz b;
   private final long c;

   public th(String $$0, iz $$1, iz $$2, long $$3) {
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
   public iz b() {
      return this.b;
   }

   @Nullable
   public iz c() {
      return this.a;
   }
}
