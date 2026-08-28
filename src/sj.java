import javax.annotation.Nullable;

public class sj extends si {
   private final iw c;
   private final iw d;

   public sj(xc $$0, iw $$1, iw $$2, int $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public xc a() {
      return xc.a("test.error.position", this.a, this.c.u(), this.c.v(), this.c.w(), this.d.u(), this.d.v(), this.d.w(), this.b);
   }

   @Nullable
   public String b() {
      return super.getMessage();
   }

   @Nullable
   public iw c() {
      return this.d;
   }

   @Nullable
   public iw d() {
      return this.c;
   }
}
