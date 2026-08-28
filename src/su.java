import javax.annotation.Nullable;

public class su extends st {
   private final jf a;
   private final jf b;
   private final long c;

   public su(String $$0, jf $$1, jf $$2, long $$3) {
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
   public jf b() {
      return this.b;
   }

   @Nullable
   public jf c() {
      return this.a;
   }
}
